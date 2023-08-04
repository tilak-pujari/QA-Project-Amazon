package amazon.testScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.Utils.CommonUtility;
import amazon.Utils.DataUtility;
import amazon.repository.HomePageLocators;

public class TC02SearchBarTest extends BaseClass {

	CommonUtility cu;
	DataUtility du;
	HomePageLocators hp;
	String product_Name;

	@Test(priority = 0)
	public void setUp() throws IOException {
		cu = new CommonUtility();
		DataUtility du = new DataUtility();
		product_Name = du.getDataFromPropertiesFile("product_name");
		hp = new HomePageLocators(driver);
	}

	@Test(priority = 2)
	public void LocateSearchBar() {
		WebElement completeSearchBar = hp.getCompleteSearchBar();
		Dimension d = completeSearchBar.getSize();
		Point p = completeSearchBar.getLocation();
		System.out.println(d + "\n " + p);
		Reporter.log("Search Bar is Situated on UI");
	}

	@Test(priority = 3)
	public void SearchAutoSuggestion() {
		hp.getSearch().sendKeys(product_Name);
		for (WebElement wb : hp.getSuggestions()) {
			System.out.println(wb.getText());
		}
		Reporter.log("Search Bar Suggestions are Visible on UI");
	}

	@Test(priority = 4)
	public void SearchProduct() {
		hp.getSearch().sendKeys(product_Name, Keys.ENTER);
		cu.waitUsingVisibilityOfWebElement(driver, hp.getWaitResult());
		String productTitle = driver.getTitle();
		System.out.println("Title of Searched Item Page is :" + productTitle);
	}
}