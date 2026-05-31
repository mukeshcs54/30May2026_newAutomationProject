package pageScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseClassLibrary;

public class ButtonsPage extends BaseClassLibrary
{
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
	  public void ClickOnButtonbtn()
	  {
		  Buttonbtn.click();
	  }
	  public void ClickOnDoubleClick()
	  {  
		  DoubleClick(doubleClickbtn);
	  }
	  public void ClickOnRightClickbtn()
	  {
		  RightClick(rightClickbtn);
		  
	  }
	  public void ClickOnNormalClickbtn()
	  {
		  
		  Clickbtn.click();
	  }
}
