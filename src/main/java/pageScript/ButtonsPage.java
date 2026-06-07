package pageScript;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLibrary.BaseClassLibrary;

public class ButtonsPage extends BaseClassLibrary
{  
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	public ButtonsPage()
    {
    	PageFactory.initElements(driver, this);
    }
     @FindBy(xpath = "//button[text()='×']")
	  private WebElement closedbtn;
	  @FindBy(xpath = "//a[text()='Practice']")
	  private WebElement practicebtn;
	  @FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	  private WebElement elementbtn;
	  
	  @FindBy(xpath = "//a[text()='buttons']")
	  private WebElement Buttonbtn;
	  
	  @FindBy(xpath = "//button[@ondblclick=\"doubletext()\"]")
	  private WebElement doubleClickbtn;
	  
	  @FindBy(xpath = "//button[@id=\"noContextMenu\"]")
	  private WebElement rightClickbtn;
	  
	  @FindBy(xpath = "//button[@onclick=\"clicktext()\"]")
	  private WebElement Clickbtn;
	  
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
	  public void ClickOnButtonbtn()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(Buttonbtn));
		  Buttonbtn.click();
	  }
	  public void ClickOnDoubleClick()
	  {  
		  wait.until(ExpectedConditions.elementToBeClickable(doubleClickbtn));
		  DoubleClick(doubleClickbtn);
	  }
	  public void ClickOnRightClickbtn()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(rightClickbtn));
		  RightClick(rightClickbtn);
		  
	  }
	  public void ClickOnNormalClickbtn()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(Clickbtn));
		  Clickbtn.click();
	  }
}
