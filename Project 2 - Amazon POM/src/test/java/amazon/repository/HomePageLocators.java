package amazon.repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import amazon.Utils.LoadDrivers;

public class HomePageLocators {

	public WebDriver driver;

	public HomePageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCompleteSearchBar() {
		return completeSearchBar;
	}

	public WebElement getSearch() {
		return search;
	}

	public List<WebElement> getSuggestions() {
		return suggestions;
	}

	public WebElement getWaitResult() {
		return waitResult;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getTodayDealsLink() {
		return todayDealsLink;
	}

	public WebElement getCustServicelink() {
		return custServicelink;
	}

	public WebElement getLangLink() {
		return langLink;
	}

	@FindBy(id = "nav-search-bar-form")
	private WebElement completeSearchBar;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;

	@FindBys({ @FindBy(className = "autocomplete-results-container") })
	private List<WebElement> suggestions;

	@FindBy(xpath = "//span[contains(text(),'results for')]")
	private WebElement waitResult;

	@FindBy(xpath = "//span[contains(text(),'Apple iPhone')]")
	private WebElement product;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	private WebElement todayDealsLink;

	@FindBy(linkText = "Customer Service")
	private WebElement custServicelink;

	@FindBy(css = "[aria-label='Choose a language for shopping.']")
	private WebElement langLink;

	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicsBtn;
	
	
	
	//Footer Section
	@FindBys({@FindBy(xpath="//div[text()='Get to Know Us']/../ul[1]/li/a[1]")})
	private List<WebElement> getToKnowUsSection;
	
	@FindBys({@FindBy(xpath="//div[text()='Connect with Us']/../ul[1]/li/a[1]")})
	private List<WebElement> connectWithUsSection;
	
	@FindBys({@FindBy(xpath="//div[text()='Make Money with Us']/../ul[1]/li/a[1]")})
	private List<WebElement> makeMoneyWithUsSection;
	
	@FindBys({@FindBy(xpath="//div[text()='Let Us Help You']/../ul[1]/li/a[1]")})
	private List<WebElement> letUsHelpYouSection;
	
	
	

	public WebElement getElectronicsBtn() {
		return electronicsBtn;
	}
}
