package testPackage;



import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import baseLibrary.BaseClassLibrary;
import pageScript.LinkPage;


public class TC07_LinkTest extends BaseClassLibrary
{
    LinkPage ob;
	@BeforeTest
   public void getLaunchUrl()
   {
	   LaunchUrl("https://www.testingbaba.com/old/");
	   ob= new LinkPage();
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
	   public void ClickOnLinks()
	   {
		   ob.ClickOnLinkbtn();
	   }
	   @Test(priority = 4)
	   public void ClickOnBrowserbtn()
	   {
	 	 ob.ClickOnDempPagebtn();
	 	 ob.ClickOnNewTab();
	   }
	   @Test(priority = 5)
	   public void ClickOnAllLinks()
	   {
		   ob.ClickOnAllLinkbtn();
	   }
}
