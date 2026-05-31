package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseClassLibrary;
import pageScript.WebTablePage;

public class TC05_WebTableTest extends BaseClassLibrary
{
	WebTablePage ob;
	@BeforeTest
    public void getLaunchUrl()
    {
    	LaunchUrl("https://testingbaba.com/old");
    	ob= new WebTablePage();
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
	   public void ClickOnWebTable()
	   {
	 	  ob.ClickOnWebTablebtn();
	   }
	   @Test(priority = 4)
	   public void getfilldetail()
	   {
		   ob.filldetailInWebtable();
	   }
	   @Test(priority = 5)
	   public void getUpdate()
	   {
		   ob.editUpdateWebtable();
	   }
	   @Test(priority = 6)
	   public void getUpdated_data()
	   {
		   ob.getUpdatedData();
	   }
}
