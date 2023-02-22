package amazon.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC7_A_Discount_Test {
	
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
	public void testDiscount() throws InterruptedException {
		
		opendeals();
		WebElement alldeals=driver.findElement(By.xpath("//h4[text()='Discount']/../ul[1]/li[1]/div[1]/a[1]"));
		WebElement dis10_more=driver.findElement(By.xpath("//h4[text()='Discount']/../ul[1]/li[2]/div[1]/a[1]"));
		WebElement dis25_more=driver.findElement(By.xpath("//h4[text()='Discount']/../ul[1]/li[3]/div[1]/a[1]"));
		WebElement dis50_more=driver.findElement(By.xpath("//h4[text()='Discount']/../ul[1]/li[4]/div[1]/a[1]"));
		WebElement dis70_more=driver.findElement(By.xpath("//h4[text()='Discount']/../ul[1]/li[5]/div[1]/a[1]"));
	

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500);");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(alldeals).perform();
		Thread.sleep(1000);
		act.moveToElement(dis10_more).perform();
		Thread.sleep(1000);
		act.moveToElement(dis25_more).perform();
		Thread.sleep(1000);
		act.moveToElement(dis50_more).perform();
		Thread.sleep(1000);
		act.moveToElement(dis70_more).perform();
		
		Thread.sleep(1000);
		act.moveToElement(alldeals).click().perform();
		Thread.sleep(1000);
		act.moveToElement(dis10_more).click().perform();
		Thread.sleep(1000);
		act.moveToElement(dis25_more).click().perform();
		Thread.sleep(1000);
		act.moveToElement(dis50_more).click().perform();
		Thread.sleep(1000);
		act.moveToElement(dis70_more).click().perform();
	
	}
}