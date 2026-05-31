package testPackage;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import baseLibrary.BaseClassLibrary;
import pageScript.TextBoxPage;


public class TC02_TextBoxTest extends BaseClassLibrary
{
	TextBoxPage ob;
	@BeforeTest
	
	public void getlaunchUrl()
	{
		LaunchUrl("https://www.testingbaba.com/old/");
		ob = new TextBoxPage();
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
	   public void ClickOnTextBox()
	   {
	 	 ob.ClickOnTextboxbtn();
	   }
	   @Test(priority = 4)
	   public void getSendDetailTextbox()
	   {
	 	 ob.senddetailInTextBox();
	   }
	   @Test(priority = 5)
	   public void getdetailOftextbox()
	   {
	 	 ob.getTextBoxDetail();
	   }
}
