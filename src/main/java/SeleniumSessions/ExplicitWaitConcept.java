package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		// ExplicitWait:
		// 1. WebDriverWait extends FluentWait
		// 2. FluentWait
		// both are implementing wait Interface

		// WebDriverWait: is a class:
		// its a dynamic wait
		//its a custom wait for a specific webelement
		//not a global wait
		//can be applied for non webelements (title, url, alerts)

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://app.hubspot.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 3, 200);
		//wait.until(ExpectedConditions.titleContains("Login"));
		wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		
		System.out.println(driver.getTitle());

	}

}
