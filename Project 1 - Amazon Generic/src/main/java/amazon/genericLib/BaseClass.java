package amazon.genericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void launchHomePage() {
		driver.get("https://www.amazon.in/");
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout from web Application Successful", true);
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}