package pageScript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseClassLibrary;

public class TextBoxPage extends BaseClassLibrary
{
	String path="C:\\Users\\Av\\eclipse-workspaceApril_2026\\25May2026_MavenAutomationTestingBabaProject\\TestData_25May2026\\testdata.xlsx";
      public TextBoxPage()
      {
    	  PageFactory.initElements(driver, this);
      }
      @FindBy(xpath = "//button[text()='×']")
	  private WebElement closedbtn;
	  @FindBy(xpath = "//a[text()='Practice']")
	  private WebElement practicebtn;
	  @FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	  private WebElement elementbtn;
	  
	  @FindBy(xpath = "//a[text()='text box']")
	  private WebElement Texboxbtn;
	  @FindBy(xpath = "//input[@id=\"fullname1\"]")
	  private WebElement fullnamebtn;
	  
	  @FindBy(xpath = "//input[@id=\"fullemail1\"]")
	  private WebElement emailtextbox;
	  
	  @FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
	  private WebElement currentAddressbtn;
	  @FindBy(xpath = "//*[@id=\"paddresh1\"]")
	  private WebElement PermanentAddressbtn;
	  
	  @FindBy(xpath = "//input[@value=\"Submit\"]")
	  private WebElement submitbtn;
	  
	  @FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	  private List<WebElement>detailtextbox;
	  
	  public void ClickOnClosedbtn()
	  {
		  closedbtn.click();
	  }
	  public void ClickOnPracticebtn()
	  {
		  practicebtn.click();
	  }
	  public void ClickOnElementbtn()
	  {
		  elementbtn.click();
	  }
	  public void ClickOnTextboxbtn()
	  {
		  Texboxbtn.click();
	  }
	  public void  senddetailInTextBox()
	  {
		  fullnamebtn.sendKeys(getReadExceldata(path, 1, 1, 0));
		  emailtextbox.sendKeys(getReadExceldata(path, 1, 1, 1));
		  currentAddressbtn.sendKeys(getReadExceldata(path, 1, 1, 2));
		  PermanentAddressbtn.sendKeys(getReadExceldata(path, 1, 1, 3));
		  submitbtn.click();
		  
	  }
	  public void getTextBoxDetail()
	  {
		  for(int i=1;i<=detailtextbox.size()-1;i=i+2)
		  {
			  String textTextbox=detailtextbox.get(i).getText();
			  System.out.println(textTextbox);
		  }
	  }
}
