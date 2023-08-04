package amazon.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.Utils.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class TC01HomePageTest extends BaseClass {

	@Test(priority = 1)
	public void homePageTest() {
		String homePageTitle = driver.getTitle();
		String url = driver.getCurrentUrl();

		Assert.assertEquals(homePageTitle, homePageTitle);
		Assert.assertEquals(url, url);
		Reporter.log("Home Page is Visible and Loading As Mentioned");

	}

}
