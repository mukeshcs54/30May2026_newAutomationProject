package pageScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseClassLibrary;

public class CheckBoxPage extends BaseClassLibrary
{
	public CheckBoxPage()
    {
    	PageFactory.initElements(driver, this);
    }
     @FindBy(xpath = "//button[text()='×']")
	  private WebElement closedbtn;
	  @FindBy(xpath = "//a[text()='Practice']")
	  private WebElement practicebtn;
	  @FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	  private WebElement elementbtn;
	  @FindBy(xpath = "//a[text()='check box']")
	  private WebElement checkboxbtn;
	  @FindBy(xpath = "//a[text()='radio buttons']")
	  private WebElement radiobtn;
	  
	  @FindBy(xpath = "//input[@id=\"myCheck\"]")
	  private WebElement mobilebtn;
	  @FindBy(xpath = "//input[@id=\"mylaptop\"]")
	  private WebElement laptopbtn;
	  @FindBy(xpath = "//input[@id=\"mydesktop\"]")
	  private WebElement desktopbtn;
	  
	  @FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]")
	  private WebElement frameloc;
	  
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
	  public void ClickOnCheckboxbtn()
	  {
		  checkboxbtn.click();
	  }
	  public void ClickOnAllCheckboxbtn()
	  {
		  driver.switchTo().frame(frameloc);
		 
		  mobilebtn.click();
		  
		  laptopbtn.click();
		 
		  desktopbtn.click();
		  
		  driver.switchTo().defaultContent();
	  }
}
