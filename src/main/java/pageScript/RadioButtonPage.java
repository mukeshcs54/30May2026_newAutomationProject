package pageScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseClassLibrary;

public class RadioButtonPage extends BaseClassLibrary
{
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

	public void ClickOnClosedbtn() {
		closedbtn.click();
	}

	public void ClickOnPracticebtn() {
		practicebtn.click();
	}

	public void ClickOnElementbtn() {
		elementbtn.click();
	}

	public void ClickOnRadiobtn() {
		radiobtn.click();
	}

	public void ClickOnAllRadiobtn() {
		yesbtn.click();
		impressivebtn.click();
		nobtn.click();

	}
}
