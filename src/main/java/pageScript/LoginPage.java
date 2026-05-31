package pageScript;

import org.testng.Assert;

import baseLibrary.BaseClassLibrary;

public class LoginPage extends BaseClassLibrary
{
    public void getTitle()
    {
    	String title=driver.getTitle();
    	System.out.println(title);
    }
    public void VerifyTitle()
    {
    	Assert.assertEquals(driver.getTitle(), "Testing Baba");
    }
    
}
