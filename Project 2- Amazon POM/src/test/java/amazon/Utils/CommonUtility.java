package amazon.Utils;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {

	public int getRandom(int num) {
		Random r = new Random();
		int value = r.nextInt(num);
		return value;
	}

	public void selectDropdownByIndex(WebElement wb, int index) {
		Select s = new Select(wb);
		s.selectByIndex(index);
	}

	public void selectDropdownByValue(WebElement wb, String value) {
		Select s = new Select(wb);
		s.selectByValue(value);
	}

	public void selectDropdownByVisibleText(WebElement wb, String text) {
		Select s = new Select(wb);
		s.selectByVisibleText(text);
	}

	public void deSelectDropdownByIndex(WebElement wb, int index) {
		Select s = new Select(wb);
		s.deselectByIndex(index);
	}

	public void deSelectDropdownByValue(WebElement wb, String value) {
		Select s = new Select(wb);
		s.deselectByValue(value);
	}

	public void deSelectDropdownByVisibleText(WebElement wb, String text) {
		Select s = new Select(wb);
		s.deselectByVisibleText(text);
	}

	public void deSelectAll(WebElement wb) {
		Select s = new Select(wb);
		s.deselectAll();
	}

	public List<WebElement> getAllSelectedOptionsFromTable(WebElement wb) {
		Select s = new Select(wb);
		return s.getAllSelectedOptions();
	}

	public String getFirstSelectedOption(WebElement wb) {
		Select s = new Select(wb);
		return s.getFirstSelectedOption().getText();
	}

	public List<WebElement> getAllOptionsFromTable(WebElement wb) {
		Select s = new Select(wb);
		return s.getOptions();
	}

	public boolean checkDropDownIsMultiSelect(WebElement wb) {
		Select s = new Select(wb);
		return s.isMultiple();
	}
	
	
	public void waitUsingVisibilityOfWebElement(WebDriver driver,WebElement wb) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(wb));
		
	}

}