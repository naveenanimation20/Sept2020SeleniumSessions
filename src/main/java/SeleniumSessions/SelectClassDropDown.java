package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropDown {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// drop down - > HTML TAG: Select
		// we have to Select class in Selenium:

//		WebElement industry_ele = driver.findElement(By.id("Form_submitForm_Industry"));
//		WebElement country_ele = driver.findElement(By.id("Form_submitForm_Country"));
//
//		Select select = new Select(industry_ele);
//		select.selectByVisibleText("Automotive");
//		select.selectByIndex(1);
//		select.selectByValue("health");
//
//		Select select1 = new Select(country_ele);
//		select1.selectByVisibleText("India");
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
//		doSelectDropDownByVisibleText(industry, "Automotive");
//		doSelectDropDownByVisibleText(country, "India");
		
		doSelectDropDownByValue(industry, "media");
		doSelectDropDownByValue(country, "Brazil");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

}
