package amazon.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import amazon.genericLib.BaseClass;

public class TC11_List_Items extends BaseClass{
	
	
	public void searchItem() throws InterruptedException {
		String item="iphone";
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(item);
		search.submit();
		Thread.sleep(2000);
	}
	
	public void clickNext() {
		driver.findElement(By.xpath("//a[text()='Next']")).click();
	}
	
	public void clickPrevious() {
		driver.findElement(By.xpath("//span[text()='Previous']")).click();
	}
	
	public void clickPage(int number) {
		driver.findElement(By.xpath("//span[text()='"+number+"']")).click();
	}
	//@Test(priority=1)
	public void getAllItemsName() throws InterruptedException {
		
		//searchItem();
	
		List<WebElement> alllist=driver.findElements(By.xpath("//span[text()='RESULTS']/../../../../../following-sibling::div/div/div/div/div/div/div[2]/div/div/div/h2/a/span"));
		for(WebElement list:alllist) {
			System.out.println(list.getText());
			
		}	
	}
	//@Test(priority=2)
	public void getAllItemsPrice() throws InterruptedException {
		searchItem();
		List<WebElement> alllist=driver.findElements(By.xpath("//span[text()='RESULTS']/../../../../../following-sibling::div/div/div/div/div/div/div[2]/div/div[1]/div[3]/div/div/div/div/a/span[1]"));
		
		for(WebElement list:alllist) {
			System.out.println(list.getText());	
		}	
	}
	@Test(priority=1)
	public void getPage2Items() throws InterruptedException {
		searchItem();
		clickNext();
		getAllItemsName();	
		clickNext();
		getAllItemsName();
		clickNext();
		getAllItemsName();
		clickPage(4);
		getAllItemsName();
		//clickPrevious();
		getAllItemsName();
	}

}