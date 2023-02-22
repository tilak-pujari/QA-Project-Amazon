package amazon.genericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

		public WebDriver driver;
		@BeforeClass
		public void launchBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Projects\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@BeforeMethod
		public void launchHomePage() {
			driver.get("https://www.amazon.in/");	
			}
		
		@AfterMethod
		public void logout() {
				
			}
		
		@AfterClass
		public void closeBrowser() {
			driver.quit();
		}

	}

