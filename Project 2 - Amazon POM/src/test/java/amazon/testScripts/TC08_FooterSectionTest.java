package amazon.testScripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import amazon.Utils.BaseClass;
import amazon.Utils.CommonUtility;
import amazon.Utils.DataUtility;
import amazon.repository.HomePageLocators;

public class TC08_FooterSectionTest extends BaseClass {
	DataUtility du;
	CommonUtility cu;
	HomePageLocators hp;
	List<String> urls;

	@Test(priority = 0)
	public void setUp() {
		du = new DataUtility();
		hp = new HomePageLocators(driver);
		cu = new CommonUtility();
	}

	 @Test(priority = 1, dependsOnMethods = "setUp")
	public void connectWithUsUITest() {
		for (WebElement link : hp.getConnectWithUsSection()) {
			System.out.println(link.getText());
			System.out.println("X " + link.getRect().getX());
			System.out.println("Y " + link.getRect().getY());
			System.out.println("Width " + link.getRect().getWidth());
			System.out.println("Height " + link.getRect().getHeight());
			System.out.println("---****---");
			// Assertion
		}
	}

	@Test(priority = 2, dependsOnMethods = "setUp")
	public void connectWithUsGetLinks() throws InterruptedException {
		for (WebElement link : hp.getConnectWithUsSection()) {
			String url = link.getAttribute("href");
			System.out.println(url);
			urls.add(url);
			System.out.println(urls);
		}
	}

	@Test(priority =3,dependsOnMethods = "connectWithUsGetLinks")
	public void connectWithUsFuncTest() throws InterruptedException {
		for (String url : urls) {
			driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to(url);
		}
	}
}