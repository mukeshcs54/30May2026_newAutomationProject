package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseClassLibrary;
import pageScript.CheckBoxPage;


public class TC03_CheckBoxTest extends BaseClassLibrary
{
	CheckBoxPage ob;
	@BeforeTest
   public void getLaunchUrl()
   {
		LaunchUrl("https://testingbaba.com/old");
		ob= new CheckBoxPage();
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
	   public void ClickOnCheckbox()
	   {
	 	 ob.ClickOnCheckboxbtn();
	   }
	   @Test(priority = 4)
	   public void ClickonAllCheckbox()
	   {
	 	 ob.ClickOnAllCheckboxbtn();
	   }
}
