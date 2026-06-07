package pageScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLibrary.BaseClassLibrary;

public class WebTablePage extends BaseClassLibrary
{  
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	String path="C:\\Users\\Av\\eclipse-workspaceApril_2026\\25May2026_MavenAutomationTestingBabaProject\\TestData_25May2026\\testdata.xlsx";
    public WebTablePage()
    {
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[text()='×']")
    private WebElement closedbtn;
    @FindBy(xpath = "//a[text()='Practice']")
    private WebElement practicebtn;
    @FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
    private WebElement elementbtn;
    @FindBy(xpath = "//a[text()='web tables']")
    private WebElement webtablebtn;
    @FindBy(xpath = "//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
    private WebElement name;
    @FindBy(xpath = "//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
    private WebElement email;
    @FindBy(xpath = "//button[text()='Save']")
    private WebElement savebtn;
    @FindBy(xpath = "//iframe[@src=\"Webtable.html\"]")
    private WebElement frameloc;
    
    @FindBy(xpath = "//button[text()='Edit']")
    private List<WebElement> edit;
    @FindBy(xpath = "//input[@name=\"edit_name\"]")
    private WebElement editName;
    @FindBy(xpath = "//input[@name=\"edit_email\"]")
    private WebElement editEmail;
    @FindBy(xpath = "//button[text()='Update']")
    private WebElement update;
    
    @FindBy(xpath = "//*[@class=\"table table-bordered data-table\"]/thead/following::tbody/tr/td[1]")
    private List<WebElement>col1;
    
    @FindBy(xpath = "//*[@class=\"table table-bordered data-table\"]/thead/following::tbody/tr/td[2]")
    private List<WebElement>col2;
    
    
    public void ClickOnClosedbtn()
    {
    	 wait.until(ExpectedConditions.elementToBeClickable(closedbtn));
  	  closedbtn.click();
    }
    public void ClickOnPracticebtn()
    {
    	 wait.until(ExpectedConditions.elementToBeClickable(practicebtn));
  	  practicebtn.click();
    }
    public void ClickOnElementbtn()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(elementbtn));
  	  elementbtn.click();
    }
    public void ClickOnWebTablebtn()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(webtablebtn));
  	  webtablebtn.click();
    }
    public void filldetailInWebtable()
    {
  	  driver.switchTo().frame(frameloc);
  	  for(int i=1;i<=5;i++)
  	  {
  		  name.sendKeys(getReadExceldata(path, 0, i, 0));
  		  email.sendKeys(getReadExceldata(path, 0, i, 1));
  		  savebtn.click();
  	  }
  	  
  	//  ArrayList<String> actual = new ArrayList<String>();
  	  
    }
    
    
    public void editUpdateWebtable()
    {
  	  int j=1;
  	 for(int i=0;i<edit.size();i++)
  	 { 
  		 edit.get(i).click();;
  		 editName.clear();
  		 editName.sendKeys(getReadExceldata(path, 0, j, 2));
  		
  		 editEmail.clear();
  		 editEmail.sendKeys(getReadExceldata(path, 0, j, 3));
  		 update.click();
  		 j++;
  	 }
    }
    public void getUpdatedData()
    {
  	  for(int i=0;i<col1.size();i++)
  	  {
  		  
  		  System.out.println(col1.get(i).getText());
  	  }
  	  for(int j=0;j<col2.size();j++)
  	  {
  		  System.out.println(col2.get(j).getText());
  	  }
  	  driver.switchTo().defaultContent();
    }
}
