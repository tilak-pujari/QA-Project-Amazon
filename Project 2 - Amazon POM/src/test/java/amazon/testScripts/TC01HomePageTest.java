package amazon.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.Utils.DataUtility;
import amazon.Utils.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class TC01HomePageTest extends BaseClass {
	DataUtility du;
	String expUrl;
	String expHomePageTitle;

	@Test(priority = 0)
	public void setUp() throws IOException {
		du = new DataUtility();
		expUrl = du.getDataFromPropertiesFile("url");
		expHomePageTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	}

	@Test(priority = 1, dependsOnMethods = "setUp")
	public void homePageTest() {
		String actHomePageTitle = driver.getTitle();
		String actUrl = driver.getCurrentUrl();

		Assert.assertEquals(expHomePageTitle, actHomePageTitle);
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("Home Page is Visible and Loading As Mentioned", true);

	}

}
