package amazon.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import amazon.genericLib.BaseClass;

public class TC09_DealType_Test  extends BaseClass{
	@Test(priority=1)
	public void testVisibilityDealType() throws InterruptedException{
		
		driver.findElement(By.linkText("See all deals")).click();
		
		WebElement alldeals=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[1]/div[1]/a[1]"));
		WebElement dealoftheday=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[2]/div[1]/a[1]/span[1]"));
		WebElement lightningdeal=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[3]/div[1]/a[1]/span[1]"));
		WebElement bestdeal=driver.findElement(By.xpath("//h4[text()='Deal type']/../ul[1]/li[3]/div[1]/a[1]/span[1]"));
		WebElement dealtype=driver.findElement(By.xpath("//span[text()='All deals']/../../../../../../span[5]/ul[1]/li[2]/div[1]/a"));
		
		//Validate visibility
		Assert.assertEquals(true,dealtype.isDisplayed());
		Assert.assertEquals(true,alldeals.isDisplayed());
		Assert.assertEquals(true,dealoftheday.isDisplayed());
		Assert.assertEquals(true,lightningdeal.isDisplayed());
		Assert.assertEquals(true,bestdeal.isDisplayed());
		Reporter.log("All Deal Type Elements are Visible in WebPage",true);
			
}
	@Test(priority=2)
	public void testDealType() throws InterruptedException{
		
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
//		act.moveToElement(alldeals).click().perform();
//		Thread.sleep(1000);
//		act.moveToElement(dealoftheday).click().perform();
//		Thread.sleep(1000);
//		act.moveToElement(lightningdeal).click().perform();
//		Thread.sleep(1000);
		act.moveToElement(bestdeal).click().perform();
		
	}
}