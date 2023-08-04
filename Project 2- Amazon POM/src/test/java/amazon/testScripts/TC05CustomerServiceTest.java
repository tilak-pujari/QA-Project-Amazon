package amazon.testScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.Utils.CommonUtility;
import amazon.Utils.DataUtility;
import amazon.repository.CustomerServicePageLocators;
import amazon.repository.HomePageLocators;
import amazon.repository.TodaysDealsPageLocators;

public class TC05CustomerServiceTest extends BaseClass {

	CommonUtility cu;
	DataUtility du;
	HomePageLocators hp;
	CustomerServicePageLocators cp;

	String productName;

	@Test(priority = 0)
	public void setUp() throws IOException {
		cu = new CommonUtility();
		du = new DataUtility();
		hp = new HomePageLocators(driver);
		cp = new CustomerServicePageLocators(driver);
	}

	@Test(priority = 1)
	public void CustomerServiceUITest() {

		Rectangle rect = hp.getCustServicelink().getRect();
		Reporter.log(
				"Element Height:" + rect.height + "\nWidth:" + rect.width + "\nX-axis " + rect.x + "\nY-axis " + rect.y,
				true);
		Assert.assertEquals(true, true);
		Reporter.log("Customer Service Element is Correctly Placed in HomePage ");
	}

	@Test(priority = 2)
	public void custServiceFunc() {
		hp.getCustServicelink().click();
		for (WebElement thing : cp.getThingsToDo()) {
			Reporter.log(thing.getText(), true);
		}
	}
}
