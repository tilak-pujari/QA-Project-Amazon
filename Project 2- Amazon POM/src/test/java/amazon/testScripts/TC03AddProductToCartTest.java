package amazon.testScripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.Utils.CommonUtility;
import amazon.Utils.DataUtility;
import amazon.repository.HomePageLocators;
import amazon.repository.ProductPageLocators;

public class TC03AddProductToCartTest extends BaseClass {

	CommonUtility cu;
	DataUtility du;
	HomePageLocators hp;
	ProductPageLocators pp;
	String product_Name;
	String name;

	@Test(priority = 0)
	public void setUp() throws IOException {
		cu = new CommonUtility();
		du = new DataUtility();
		product_Name = du.getDataFromPropertiesFile("product_name");
		name = du.getDataFromPropertiesFile("name");
		hp = new HomePageLocators(driver);
		pp = new ProductPageLocators(driver);
	}

	@Test(priority = 1)
	public void SearchProduct() {
		hp.getSearch().sendKeys(product_Name, Keys.ENTER);
		cu.waitUsingVisibilityOfWebElement(driver, hp.getWaitResult());
		Reporter.log("Product Page Title:" + driver.getTitle());

		hp.getProduct().click();
		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			if (!(id.equals(parentId))) {
				driver.switchTo().window(id);
			}
		}

		pp.getAddToCartBtn().click();
		pp.getCheckoutBtn().click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
	}
}