package amazon.repository;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LangPageLocators {
	WebDriver driver;

	public LangPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBys({@FindBy(xpath= "//div[@id='icp-language-settings']/div/div[1]")})
	private List<WebElement> allLang;
	//List<WebElement> allLang1 = driver.findElements(By.xpath("//div[@id='icp-language-settings']/div/div[1]"));

	public List<WebElement> getAllLang() {
		return allLang;
	}
}
