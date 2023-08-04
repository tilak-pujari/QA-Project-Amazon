package amazon.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DealType {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Projects\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.linkText("See all deals")).click();
	WebElement alldeals=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[1]/div[1]/a[1]"));
	//WebElement alldeals=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[1]/div[1]/a[1]/span[1]"));
	WebElement dealoftheday=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[2]/div[1]/a[1]/span[1]"));
	WebElement lightningdeal=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[3]/div[1]/a[1]/span[1]"));
	WebElement bestdeal=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[3]/div[1]/a[1]/span[1]"));
	WebElement dealtype=driver.findElement(By.xpath("//span[text()='All deals']/../../../../../../span[5]/ul[1]/li[2]/div[1]/a"));

	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500);");
	Actions act=new Actions(driver);
	act.moveToElement(dealtype).perform();
	Thread.sleep(1000);
	act.moveToElement(alldeals).perform();
	Thread.sleep(1000);
	act.moveToElement(dealoftheday).perform();
	Thread.sleep(1000);
	act.moveToElement(lightningdeal).perform();
	Thread.sleep(1000);
	act.moveToElement(bestdeal).perform();
	
	Thread.sleep(2000);
	act.moveToElement(alldeals).click().perform();
	Thread.sleep(1000);
	act.moveToElement(dealoftheday).click().perform();
	Thread.sleep(1000);
	act.moveToElement(lightningdeal).click().perform();
	Thread.sleep(1000);
	act.moveToElement(bestdeal).click().perform();
	
	}
}
