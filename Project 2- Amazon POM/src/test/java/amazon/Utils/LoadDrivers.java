package amazon.Utils;

import org.openqa.selenium.WebDriver;

import amazon.repository.CustomerServicePageLocators;
import amazon.repository.HomePageLocators;
import amazon.repository.LangPageLocators;
import amazon.repository.ProductPageLocators;
import amazon.repository.TodaysDealsPageLocators;

public class LoadDrivers {

	WebDriver driver;

	public LoadDrivers(WebDriver driver) {
		CommonUtility cu=new CommonUtility();
		DataUtility du=new DataUtility();
		
		HomePageLocators hp=new HomePageLocators(driver);
		CustomerServicePageLocators cp= new CustomerServicePageLocators(driver);
		LangPageLocators lp=new LangPageLocators(driver);
		ProductPageLocators pp=new ProductPageLocators(driver);
		TodaysDealsPageLocators tp=new TodaysDealsPageLocators(driver);

	}

}
