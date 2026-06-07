package pageScript;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLibrary.BaseClassLibrary;

public class RadioButtonPage extends BaseClassLibrary
{
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	public RadioButtonPage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement closedbtn;
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practicebtn;
	@FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement elementbtn;

	@FindBy(xpath = "//a[text()='radio buttons']")
	private WebElement radiobtn;

	@FindBy(xpath = "//input[@id=\"yes\"]")
	private WebElement yesbtn;
	@FindBy(xpath = "//input[@id=\"impressive\"]")
	private WebElement impressivebtn;
	@FindBy(xpath = "//input[@id=\"no\"]")
	private WebElement nobtn;

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

	public void ClickOnRadiobtn() 
	{  
		wait.until(ExpectedConditions.elementToBeClickable(radiobtn));
		radiobtn.click();
	}

	public void ClickOnAllRadiobtn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(yesbtn));
		yesbtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(impressivebtn));
		impressivebtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(nobtn));
		nobtn.click();

	}
}
