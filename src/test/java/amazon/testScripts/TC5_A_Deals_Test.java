package amazon.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC5_A_Deals_Test {
	

	WebDriver driver;
	
	public void openAmazon() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Projects\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	
	public void scrollToWebElement(WebDriver driver,WebElement wb) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",wb);	
	}
	
	public void scrollToXY(WebDriver driver,int x,int y) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+");");
	}
	public void scrollToVertical(WebDriver driver,int y) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+y+");");
	}
	//@Test(priority=1)
		void scrollTodayDeals() throws InterruptedException {
		openAmazon();
		WebElement deals=driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		scrollToWebElement(driver, deals);
		Thread.sleep(1000);
		scrollToXY(driver, 0, 900);
		Thread.sleep(1000);
		scrollToVertical(driver, 900);
	}
	
	@Test(priority=2)
	public void seeAllDeals() {
		openAmazon();
		WebElement alldeals=driver.findElement(By.xpath("//a[text()='See all deals']"));
		alldeals.click();
		
	}
}