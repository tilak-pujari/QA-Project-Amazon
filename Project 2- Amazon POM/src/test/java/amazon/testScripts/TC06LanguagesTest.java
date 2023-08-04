package amazon.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.Utils.CommonUtility;
import amazon.repository.HomePageLocators;
import amazon.repository.LangPageLocators;

public class TC06LanguagesTest extends BaseClass {

	CommonUtility cu;
	HomePageLocators hp;
	LangPageLocators lp;

	@Test(priority = 1)
	public void languageUITest() {
		cu = new CommonUtility();
		hp = new HomePageLocators(driver);
		lp = new LangPageLocators(driver);

		Rectangle rect = hp.getLangLink().getRect();
		int height = rect.height, width = rect.width, x = rect.x, y = rect.y;

		Assert.assertTrue(true);
		System.out.println(" " + height + " " + width + " " + x + " " + y);
		Assert.assertEquals(height, 50);
		Assert.assertEquals(width, 74);
		Assert.assertEquals(x, 1128);
		Assert.assertEquals(y, 5);
		Reporter.log("Choose Language link is Correctly Located in UI", true);
	}

	@Test(priority = 2)
	public void chooseLangFunc() {
		hp.getLangLink().click();
		for (WebElement lang : lp.getAllLang()) {
			System.out.println(lang.getText().trim());
		}
	}
}