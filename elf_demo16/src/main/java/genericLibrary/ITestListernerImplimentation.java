package genericLibrary;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestResult;
public class ITestListernerImplimentation extends BaseClass{ 

		
		 		
		    public void onFinish(ITestContext arg0) {					
			 
		    }		

		    		
		    public void onStart(ITestContext arg0) {					

		    	
		    }		

		    		
		    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					

		    	
		    }		

		    		
		    public void onTestFailure(String path  ) throws IOException {	
		    	
		    	TakesScreenshot  ts = (TakesScreenshot) driver;
		    	File temp = ts.getScreenshotAs(OutputType.FILE);
		    	File dest = new File(path+".png");
				FileUtils.copyFile(temp, dest);
		   	
		    }		

		    		
		    public void onTestSkipped(ITestResult arg0) {					

		    	
		    }		

		    		
		    public void onTestStart(ITestResult arg0) {					

		        		
		    }		

		    		
		    public void onTestSuccess(ITestResult arg0) {					

		        		
		    }

	}


