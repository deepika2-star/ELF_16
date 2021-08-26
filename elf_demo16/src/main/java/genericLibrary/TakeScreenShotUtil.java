package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

/***
 * 
 * @author Deepika
 *
 */
public class TakeScreenShotUtil implements IAutoConstants {

		
		public void takeScreenshotAndStoreInErrorshots(ITestResult result) {
			
			String localDateTime=LocalDateTime.now().toString().replace(":","-");
			TakesScreenshot takeScreenshot = (TakesScreenshot) BaseClass.driver;
			File tempFile=takeScreenshot.getScreenshotAs(OutputType.FILE);
			File destFile=new File(SCREENSHOT_PATH+result.getMethod().getMethodName()+localDateTime);
			try {
				FileUtils.copyFile(tempFile,destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

		

		
		
		
	
	
