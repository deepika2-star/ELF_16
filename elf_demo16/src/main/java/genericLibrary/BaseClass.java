package genericLibrary;

    import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

	/***
	 * 
	 * @author Deepika
	 *
	 */

	public class BaseClass {

		public static WebDriver driver;

		@BeforeClass
		public void preCondtions(String url) {

			System.setProperty(IAutoConstants.CHROME_KEY, IAutoConstants.CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get(url);
			String actualUrl = driver.getCurrentUrl();
			if(url.equalsIgnoreCase(actualUrl)) {
				System.out.println("Successfully Navigated to the Login page");
			}
		}

		@BeforeMethod 
		public void loginCredentials(String username, String password) {

			WebElement user = driver.findElement(By.name("user_name"));
			user.clear();
			user.sendKeys(username);
			WebElement pwd = driver.findElement(By.name("user_password"));
			pwd.clear();
			pwd.sendKeys(password, Keys.ENTER);
		}

		@AfterMethod
		public void LogoutOfWebpage() {

		}


		@AfterClass
		public void postConditions() {
			driver.quit();
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	