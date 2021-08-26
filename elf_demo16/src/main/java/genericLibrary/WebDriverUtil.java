package genericLibrary;

import java.util.Set;

import org.openqa.selenium.WebElement;

public class WebDriverUtil  extends BaseClass {
	
	public void switchToWindow(WebElement element) {
		String mainWindow = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		allIds.remove(mainWindow);
		for(String winId : allIds) {
			driver.switchTo().window(winId);
			if(element.isDisplayed()) {
				break;
			}
		}
	}

}
