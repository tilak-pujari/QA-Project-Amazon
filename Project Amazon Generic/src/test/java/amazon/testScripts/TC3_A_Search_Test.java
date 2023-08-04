package amazon.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.genericLib.BaseClass;

public class TC3_A_Search_Test extends BaseClass{
	@Test(priority=1)
	public void searchBarVisible() {
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		boolean displayed=search.isDisplayed();
		System.out.println("Search field is Visible "+displayed);
		
		boolean enabled=search.isEnabled();
		System.out.println("Search field is enabled "+enabled);
		
		boolean selected=search.isSelected();
		System.out.println("Search field is selected "+selected);
	}
	
	@Test(priority=2)
	public void searchBarItemWritable() {
		String item="iphone";
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(item);
		String actual=search.getAttribute("value");
		Assert.assertEquals(item, actual);
		System.out.println("Pass");
	}
	@Test(priority=3)
	public void searchItem() {
		String item="iphone";
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(item);
		search.submit();
	}

}