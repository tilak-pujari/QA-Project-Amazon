package amazon.Utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	DataUtility du = new DataUtility();
	public WebDriver driver;
	public static WebDriver ListenerDriver;

	@BeforeClass
	public void OpenBrowser() {

//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--lang= locale-of-choice");
//		driver = new ChromeDriver(chromeOptions);

		driver = new ChromeDriver();
		ListenerDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Session Started");
		Reporter.log("Opened Session Successful");
	}

	@BeforeMethod
	public void Login() throws IOException {
		driver.get(du.getDataFromPropertiesFile("url"));
		Reporter.log("Login Successful", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout Successful", true);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Closed Session Successful", true);
	}
}