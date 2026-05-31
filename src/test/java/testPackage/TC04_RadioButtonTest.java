package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseClassLibrary;
import pageScript.RadioButtonPage;


public class TC04_RadioButtonTest extends BaseClassLibrary
{
	   RadioButtonPage ob;	
	   @BeforeTest	
	   public void getLaunchUrl()
	   {
		   LaunchUrl("https://testingbaba.com/old");
		   ob= new RadioButtonPage();
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
	   public void ClickOnRadioButtons()
	   {
	 	 ob.ClickOnRadiobtn();
	   }
	   @Test(priority = 4)
	   public void ClickOnAllRadioButton()
	   {
	 	 ob.ClickOnAllRadiobtn();
	   }
}
