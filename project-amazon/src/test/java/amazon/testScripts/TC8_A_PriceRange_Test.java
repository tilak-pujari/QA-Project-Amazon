package amazon.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC8_A_PriceRange_Test {
	WebDriver driver;
	public void opendeals() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Projects\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement alldeals=driver.findElement(By.xpath("//a[text()='See all deals']"));
		alldeals.click();
	}
	@Test(priority=1)
	public void testPriceRange() throws InterruptedException {
		opendeals();
	WebElement rangeAll=driver.findElement(By.xpath("//h4[text()='Price']/../ul[1]/li[1]/div[1]/a[1]"));
	WebElement rangeunder500=driver.findElement(By.xpath("//h4[text()='Price']/../ul[1]/li[2]/div[1]/a[1]"));
	WebElement range500_1000=driver.findElement(By.xpath("//h4[text()='Price']/../ul[1]/li[3]/div[1]/a[1]"));
	WebElement range1000_2000=driver.findElement(By.xpath("//h4[text()='Price']/../ul[1]/li[4]/div[1]/a[1]"));
	WebElement range2000_5000=driver.findElement(By.xpath("//h4[text()='Price']/../ul[1]/li[5]/div[1]/a[1]"));
	WebElement rangeabove5000=driver.findElement(By.xpath("//h4[text()='Price']/../ul[1]/li[6]/div[1]/a[1]"));
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500);");
	Thread.sleep(1000);
	
	Actions act=new Actions(driver);
	act.moveToElement(rangeAll).perform();
	Thread.sleep(1000);
	act.moveToElement(rangeunder500).perform();
	Thread.sleep(1000);
	act.moveToElement(range500_1000).perform();
	Thread.sleep(1000);
	act.moveToElement(range1000_2000).perform();
	Thread.sleep(1000);
	act.moveToElement(range2000_5000).perform();
	Thread.sleep(1000);
	act.moveToElement(rangeabove5000).perform();
	

	act.moveToElement(rangeAll).click().perform();

	}
}