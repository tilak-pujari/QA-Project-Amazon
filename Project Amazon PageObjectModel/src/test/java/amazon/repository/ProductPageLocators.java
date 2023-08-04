package amazon.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageLocators {

	WebDriver driver;

	public ProductPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "add-to-cart-button")
	private WebElement addToCartBtn;

	@FindBy(id = "attach-sidesheet-checkout-button")
	private WebElement checkoutBtn;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}
	
}
