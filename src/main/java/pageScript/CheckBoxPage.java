package pageScript;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLibrary.BaseClassLibrary;

public class CheckBoxPage extends BaseClassLibrary
{
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
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
	  public void ClickOnCheckboxbtn()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(checkboxbtn));
		  checkboxbtn.click();
	  }
	  public void ClickOnAllCheckboxbtn()
	  {
		  wait.until(ExpectedConditions.visibilityOf(frameloc));
		  driver.switchTo().frame(frameloc);
		 
		  mobilebtn.click();
		  
		  laptopbtn.click();
		 
		  desktopbtn.click();
		  
		  driver.switchTo().defaultContent();
	  }
}
