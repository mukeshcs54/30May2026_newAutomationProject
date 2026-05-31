package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseClassLibrary;
import pageScript.LoginPage;

public class TC01_LoginTest extends BaseClassLibrary
{
	LoginPage ob;
	@BeforeTest
	public void getLaunchUrl()
	{
		LaunchUrl("https://www.testingbaba.com/old/");
		ob= new LoginPage();
	}
	@Test(priority = 0)
	public void getTitle()
	{
		ob.getTitle();
	}
	@Test(priority = 1)
	public void getVerifyTitle()
	{
		ob.VerifyTitle();
	}
}
