package amazon.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.Utils.CommonUtility;
import amazon.Utils.DataUtility;
import amazon.repository.HomePageLocators;
import amazon.repository.TodaysDealsPageLocators;

public class TC04TodayDealsTest extends BaseClass {

	CommonUtility cu;
	DataUtility du;
	HomePageLocators hp;
	TodaysDealsPageLocators tp;

	String productName;

	@Test(priority = -1)
	public void setUp() throws IOException {
		cu = new CommonUtility();
		du = new DataUtility();
		hp = new HomePageLocators(driver);
		tp = new TodaysDealsPageLocators(driver);
		productName = du.getDataFromPropertiesFile("product_name");
	}

	@Test(priority = 1)
	public void todayDealsUITest() {

		WebElement todayDealsLink = hp.getTodayDealsLink();
		Point p = todayDealsLink.getLocation();
		Dimension d = todayDealsLink.getSize();
		Rectangle rect = todayDealsLink.getRect();
		int height = rect.getHeight();
		int width = rect.getWidth();
		int x = rect.getX();
		int y = rect.getY();
		Assert.assertEquals(true, true);
		Reporter.log("Height :" + height + " width: " + width + " X axis:" + x + " Y axis: " + y, true);
	}

	@Test(priority = 2)
	public void todayDealsFunctionTest() {
		hp.getTodayDealsLink().click();
		cu.waitUsingVisibilityOfWebElement(driver, tp.getHeaderTitle());
		System.out.println(tp.getHeaderTitle().getText());
	}
}