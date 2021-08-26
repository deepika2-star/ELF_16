package genericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class SelectUtil extends BaseClass { 
	public void dropDown(WebElement listBox, String data) {
		Select select = new Select(listBox);
		int count = 0;

		try {
			int index = Integer.parseInt(data);
			select.selectByIndex(index);
			count++;
		} 
		catch(Exception e) {

		}

		if (count == 0) {
			try {
				select.selectByVisibleText(data);
			}
			catch(Exception e) {
				select.selectByValue(data);
			}
		}
	}
}


