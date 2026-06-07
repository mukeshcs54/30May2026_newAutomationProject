package pageScript;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLibrary.BaseClassLibrary;

public class LinkPage extends BaseClassLibrary
{
	   WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	   public LinkPage()
	   {
		   PageFactory.initElements(driver, this);
		   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   }
	     @FindBy(xpath = "//button[text()='×']")
		  private WebElement closedbtn;
		  @FindBy(xpath = "//a[text()='Practice']")
		  private WebElement practicebtn;
		  @FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
		  private WebElement elementbtn;
		  @FindBy(xpath = "//a[text()='links']")
		  private WebElement linkbtn;
		  @FindBy(xpath = "//a[@href=\"index.html\" and @target=\"_blank\"]")
		  private WebElement Demopagebtn;
		  
		  @FindBy(xpath = "//a[text()='Created']")
		  private WebElement Createdbtn;
		  @FindBy(xpath ="//a[text()='No Content']" )
		  private WebElement NoContentbtn;
		  @FindBy(xpath = "//a[text()='Moved']")
		  private WebElement Movedbtn;
		  @FindBy(xpath = "//a[text()='Bad Request']")
		  private WebElement BadRequestbtn;
		  @FindBy(xpath = "//a[text()='Unauthorized']")
		  private WebElement Unauthorizedbtn;
		  @FindBy(xpath = "//a[text()='Forbidden']")
		  private WebElement Forbiddenbtn;
		  @FindBy(xpath = "//a[text()='Not Found']")
		  private WebElement NotFoundbtn;
		  
	     
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
		  public void ClickOnLinkbtn()
		  {
			  wait.until(ExpectedConditions.elementToBeClickable(linkbtn));
			  linkbtn.click();
		  }
		  public void ClickOnDempPagebtn()
		  {
			  wait.until(ExpectedConditions.elementToBeClickable(Demopagebtn));
			  Demopagebtn.click();
		  }
		  public void ClickOnNewTab()
		  {
			  ChangeWindow(1);
			  wait.until(ExpectedConditions.elementToBeClickable(closedbtn));
			  closedbtn.click();
			  driver.close();
			  ChangeWindow(0);
		  }
		  public void ClickOnAllLinkbtn()
		  {
			  wait.until(ExpectedConditions.elementToBeClickable(Createdbtn));
			  Createdbtn.click();
			  NoContentbtn.click();
			  Movedbtn.click();
			  BadRequestbtn.click();
			  Unauthorizedbtn.click();
			  Forbiddenbtn.click();
			  NotFoundbtn.click();
		  }
}
