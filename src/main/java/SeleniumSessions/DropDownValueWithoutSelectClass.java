package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		By industry_options = By.xpath("//select[@id='Form_submitForm_Industry']/option");

		// Dropdown html tag is: Select
		// but do not use Select class from Selenium
		// and select the value from the drop down
		selectDropDownValueWithoutSelectClass(industry_options, "Electronics");
	}

	public static void selectDropDownValueWithoutSelectClass(By locator, String value) {
		List<WebElement> industryList = driver
				.findElements(locator);

		System.out.println(industryList.size());

		for (WebElement e : industryList) {

			String text = e.getText();

			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}

}
