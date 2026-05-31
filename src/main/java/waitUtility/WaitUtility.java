package waitUtility;

import org.openqa.selenium.WebElement;

public interface WaitUtility
{
	public void visibilityOfElement(WebElement ele);
	public void elemenToBeClickable(WebElement ele);
	
	public void WaitalertisPresent();
}
