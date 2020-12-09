package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		System.out.println(jsUtil.getTitleByJS());

		// jsUtil.refreshBrowserByJS();

		// jsUtil.generateAlert("Hi Testing Selenium");

		// System.out.println(jsUtil.getPageInnerText());

		WebElement signupLink = driver.findElement(By.linkText("Sign up"));
//		jsUtil.clickElementByJS(signupLink);

		//jsUtil.sendKeysUsingWithId("username", "admin@gmail.com");
		
		//jsUtil.drawBorder(signupLink);
		
		WebElement loginForm = driver.findElement(By.id("hs-login"));
		jsUtil.drawBorder(loginForm);
		
	}

}
