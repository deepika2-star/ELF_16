package genericLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class WebActionUtil extends BaseClass{

	public void actionDragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public void actionDragAndDropBy(WebElement source, int xOffset, int yOffset) {
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(source, xOffset, yOffset).perform();
	}

}
