package amazon.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amazon.genericLib.BaseClass;

public class TC4_A_Lang_Test {//extends BaseClass{
	WebDriver driver;
	public void openAmazon() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91740\\OneDrive\\Desktop\\Projects\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	
	public void clickLangMenu(WebDriver driver) {
		WebElement langMenu=driver.findElement(By.xpath("//a[contains(@aria-label,'language')]"));
		langMenu.click();
	}
	
	public void SaveChanges(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(@id,'save')]")).click();
	}
	public void cancelChanges(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(@id,'cancel')]")).click();
	}
	@Test(priority=1)
	void testLanKan() throws InterruptedException {
		openAmazon();
		clickLangMenu(driver);
		WebElement lang=driver.findElement(By.xpath("//span[contains(text(),'ಕನ್ನಡ ')]"));
		lang.click();
		SaveChanges(driver);
	}
	
	@Test(priority=2)
	void testLanEng() throws InterruptedException {
		openAmazon();
		clickLangMenu(driver);
		WebElement english=driver.findElement(By.xpath("//span[text()='EN']"));
		english.click();
		SaveChanges(driver);
	}
	
	@Test(priority=3)
	void testLanHin() throws InterruptedException {
		openAmazon();
		clickLangMenu(driver);
		WebElement hindi=driver.findElement(By.xpath("//span[contains(text(),'हिन्दी ')]"));
		hindi.click();
		SaveChanges(driver);
	}
	
	@Test(priority=4)
	void testLanMarathi() throws InterruptedException {
		openAmazon();
		clickLangMenu(driver);
		WebElement marathi=driver.findElement(By.xpath("//span[text()='MR']"));
		marathi.click();
		SaveChanges(driver);
	}
	
	@Test(priority=5)
	void testLanTelugu() throws InterruptedException {
		openAmazon();
		clickLangMenu(driver);
		WebElement telugu=driver.findElement(By.xpath("//span[text()='TE']"));	
		telugu.click();
		SaveChanges(driver);
	}
	
	@Test(priority=6)
	void testLanTamil() throws InterruptedException {
		openAmazon();
		clickLangMenu(driver);
		WebElement tamil=driver.findElement(By.xpath("//span[text()='TA']"));
		tamil.click();
		SaveChanges(driver);
	}
	
	@Test(priority=7)
	void testLanBangla() throws InterruptedException {
		openAmazon();
		clickLangMenu(driver);
		WebElement bangla=driver.findElement(By.xpath("//span[text()='BN']"));
		bangla.click();
		SaveChanges(driver);
	}
	
	@Test(priority=8)
	void testLanMalayalam() throws InterruptedException {
		openAmazon();
		clickLangMenu(driver);
		WebElement malayalam=driver.findElement(By.xpath("//span[text()='ML']"));
		malayalam.click();
		SaveChanges(driver);
	}
	
}