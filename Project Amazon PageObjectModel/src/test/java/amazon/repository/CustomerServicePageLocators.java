package amazon.repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import amazon.Utils.LoadDrivers;

public class CustomerServicePageLocators {

	WebDriver driver;

	public CustomerServicePageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(xpath = "//h3[@class='a-spacing-none a-text-normal']") })
	private List<WebElement> thingsToDo;

	public List<WebElement> getThingsToDo() {
		return thingsToDo;
	}

}
