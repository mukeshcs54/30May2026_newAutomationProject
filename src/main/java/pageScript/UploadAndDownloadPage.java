package pageScript;

import javax.xml.datatype.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseLibrary.BaseClassLibrary;

public class UploadAndDownloadPage extends BaseClassLibrary
{
	String filepath="C:\\Users\\Av\\eclipse-workspaceApril_2026\\25May2026_MavenAutomationTestingBabaProject\\TestData_25May2026\\testdata.xlsx";
	WebDriverWait wait= new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	public UploadAndDownloadPage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement closedbtn;
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practicebtn;
	@FindBy(xpath = "//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement elementbtn;

	@FindBy(xpath = "//a[text()='upload and download']")
	private WebElement UploadAndDownlaodbtn;

	@FindBy(xpath = "//label[@for=\"File1\"]")
	private WebElement selectfilebtn;

	public void ClickOnClosedbtn() {
		closedbtn.click();
	}

	public void ClickOnPracticebtn() {
		practicebtn.click();
	}

	public void ClickOnElementbtn() {
		elementbtn.click();
	}

	public void ClickOnUploadAndDownlaodbtn() {
		UploadAndDownlaodbtn.click();
	}

	public void ClickOnSelectFilebtn() {
		
		wait.until(ExpectedConditions.elementToBeClickable(selectfilebtn));
		selectfilebtn.click();

	}

	public void uploadingfile() 
	{
		
		fileUploading(filepath);
		
		String actualFileName= selectfilebtn.getText();
		
		Assert.assertEquals(actualFileName, "Select a file");
	}
}
