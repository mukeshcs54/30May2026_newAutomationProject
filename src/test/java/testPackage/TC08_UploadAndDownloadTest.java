package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseClassLibrary;
import pageScript.UploadAndDownloadPage;


public class TC08_UploadAndDownloadTest extends BaseClassLibrary 
{
	UploadAndDownloadPage ob;

	@BeforeTest
	public void getLaunchUrl() 
	{
		LaunchUrl("https://testingbaba.com/old");
		ob = new UploadAndDownloadPage();
	}

	@Test(priority = 0)
	public void ClickOnClosed() {
		ob.ClickOnClosedbtn();
	}

	@Test(priority = 1)
	public void ClickOnPracticebtn()
	{
		ob.ClickOnPracticebtn();
	}

	@Test(priority = 2)
	public void ClickOnElement() 
	{
		ob.ClickOnElementbtn();
	}

	@Test(priority = 3)
	public void ClickOnUploadAndDownlaod() 
	{
		ob.ClickOnUploadAndDownlaodbtn();
	}

	@Test(priority = 4)
	public void ClickOnSelectFile() 
	{
		ob.ClickOnSelectFilebtn();
	}

	@Test(priority = 5)
	public void uploadingfile() 
	{
		ob.uploadingfile();
		
	}

}
