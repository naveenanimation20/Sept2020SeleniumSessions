package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionConcept {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//v1 -- DOM
		WebElement url_ele = driver.findElement(By.id("Form_submitForm_subdomain"));
		
		url_ele.sendKeys("naveenautomationlabs.com");//v1 -- e1
		
		driver.navigate().refresh();
		//v2 - DOM
		
		url_ele = driver.findElement(By.id("Form_submitForm_subdomain"));//v2 -- e1
		url_ele.sendKeys("naveenautomationlabs.com");
		//StaleElementReferenceException: 
		//stale element reference: element is not attached to the page document
		
		
	}

}
