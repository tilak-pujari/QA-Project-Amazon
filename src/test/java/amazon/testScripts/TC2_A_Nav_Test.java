package amazon.testScripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.genericLib.BaseClass;
public class TC2_A_Nav_Test extends BaseClass{
		//AmazonNavBarTest at=new AmazonNavBarTest();
		
		public WebElement addToCart() {
			return driver.findElement(By.id("add-to-cart-button"));
			//return driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		}
		
		public WebDriver switchWindow() {
			String mainid=driver.getWindowHandle();
			Set<String> allid=driver.getWindowHandles();
			for(String id:allid) {
				if(!id.equals(mainid)) {
					driver.switchTo().window(id);
				}
			}
			return driver;
		}
		@Test(priority=1)
		public void navbar_Links_List(){
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='nav-fill']/div[1]/div[1]/a"));
			
		for(WebElement link:links) {
			String text=link.getText();
				if(text.equals(" ")) {
					
				}
				else {
					System.out.println(link.getText());
				}
			}
		}
		@Test(priority=2)
		public void testSearchBar() throws InterruptedException {
			WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("IphoneX");
			search.submit();
			
			
			List<WebElement> reslist=driver.findElements(By.xpath("//div[@class='a-section']/div[1]/div[1]/div[1]"));
			//driver.findElement(By.xpath("//span[text()='RESULTS']/../../../../../../div[4]/div/div/div")).click();
			WebElement firstresult=reslist.get(0);
			firstresult.click();
			
			switchWindow();
			Thread.sleep(4000);
			System.out.println(driver.getTitle());
			addToCart().click();
			
		}

}