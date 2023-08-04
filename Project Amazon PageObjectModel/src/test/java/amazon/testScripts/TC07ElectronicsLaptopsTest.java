package amazon.testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.repository.HomePageLocators;

public class TC07ElectronicsLaptopsTest extends BaseClass {

	// WebDriver driver;
	HomePageLocators hp;// = new HomePageLocators(driver);

	@Test
	public void clickElectronics() {
		hp = new HomePageLocators(driver);

		hp.getElectronicsBtn().click();

	}

}
