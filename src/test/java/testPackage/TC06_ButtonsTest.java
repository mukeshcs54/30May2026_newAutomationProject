package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseClassLibrary;
import pageScript.ButtonsPage;


public class TC06_ButtonsTest extends BaseClassLibrary
{
	ButtonsPage ob;
	@BeforeTest
   public void getLaunchUrl()
   {
	   LaunchUrl("https://testingbaba.com/old/");
	   ob= new ButtonsPage();
   }
	 @Test(priority = 0)
	   public void ClickOnClosed()
	   {
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
	   public void ClickOnButton()
	   {
	 	 ob.ClickOnButtonbtn();
	   }
	   @Test(priority = 4)
	   public void ClickOnAllbutton()
	   {
	 	 ob.ClickOnDoubleClick();
	 	 ob.ClickOnRightClickbtn();
	 	 ob.ClickOnNormalClickbtn();
	 	 
	 	 
	 	 
	   }
}
