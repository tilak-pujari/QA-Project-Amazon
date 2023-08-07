package amazon.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import amazon.genericLib.BaseClass;

public class TC10_A_Sort_Items extends BaseClass{
	@Test
	public void searchItem() throws InterruptedException {
		String item="iphone";
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(item);
		search.submit();
		Thread.sleep(2000);
		
		WebElement sortBy=driver.findElement(By.xpath("//span[text()='Featured']"));
		Actions act=new Actions(driver);
		act.moveToElement(sortBy).click().build().perform();
		
		WebElement featured=driver.findElement(By.xpath("//a[text()='Featured']"));
		WebElement lowtoHigh=driver.findElement(By.xpath("//a[text()='Price: Low to High']"));
		WebElement hightoLow=driver.findElement(By.xpath("//a[text()='Price: High to Low']"));
		WebElement avgCustReview=driver.findElement(By.xpath("//a[text()='Avg. Customer Review']"));
		WebElement newArrivals=driver.findElement(By.xpath("//a[text()='Newest Arrivals']"));
		
		//act.click(lowtoHigh).perform();
	//	act.click(hightoLow).perform();
		act.click(newArrivals).perform();
	}

}
