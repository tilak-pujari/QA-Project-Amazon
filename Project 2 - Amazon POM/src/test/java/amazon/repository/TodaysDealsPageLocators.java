package amazon.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDealsPageLocators {
	WebDriver driver;

	public TodaysDealsPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "h1")
	private WebElement headerTitle;

	public WebElement getHeaderTitle() {
		return headerTitle;
	}

}
