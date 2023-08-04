package amazon.testScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import amazon.genericLib.BaseClass;

public class TC1_A_HomePage_Test extends BaseClass {
	public WebDriver driver;
	//@Test(priority=1)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Projects\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Chrome Browser launched Successfully",true);
	}
	//@Test(priority=2)
	public void launchHomePage() {
		driver.get("https://www.amazon.in/");	
		Reporter.log("Home Page is Visibility Test Passed Successfully",true);;
	}
	@Test(priority=3)
	public void scrollPage() {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200);");
		Reporter.log("Scrolling Action Working Successfully",true);
	}
	@Test(priority=4)
	public void testTitleURL() {
		String expurl="https://www.amazon.in/";
		String exptitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualtitle=driver.getTitle();
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expurl);
		Assert.assertEquals(actualtitle,exptitle);
		Reporter.log("Title and URL both are matching!",true);		
	}
	
	//@Test(priority=5)
	public void closeBrowser() {
		driver.close();
		Reporter.log("Chrome Browser closed Succesfully",true);
	}

}