package amazon.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Discount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/gp/goldbox/?ie=UTF8&ref=nav_topnav_deals&_ref=dlx_gate_sd_dcl_vai_dt&pd_rd_w=AJC09&content-id=amzn1.sym.a532052b-26f3-4811-a261-3b35ffa57237&pf_rd_p=a532052b-26f3-4811-a261-3b35ffa57237&pf_rd_r=RPPTVY97JYVRBR5ZM78S&pd_rd_wg=Vd3ul&pd_rd_r=9ed40c06-6af6-437b-a644-c233a292bf3e&ref_=pd_gw_unk");
		
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
