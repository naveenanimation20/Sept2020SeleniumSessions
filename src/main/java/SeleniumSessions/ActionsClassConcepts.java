package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcepts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://app.hubspot.com/");
		Thread.sleep(6000);
		
		By email = By.id("username");
		By Password = By.id("password");
		By Login = By.id("loginBtn");

		Actions act = new Actions(driver);
		
		act.sendKeys(driver.findElement(email), "test@gmail.com").perform();;
		act.sendKeys(driver.findElement(Password), "test@123").perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
		//act.moveToElement(driver.findElement(email)).sendKeys("test@gmail.com").build().perform();
//		
//		act.sendKeys(driver.findElement(email), "test@gmail.com").perform();
//		act.sendKeys(driver.findElement(Password), "test@123").perform();
//		act.click(driver.findElement(Login)).perform();
		
//		doActionsSendKeys(email, "test@gmail.com");
//		doActionsSendKeys(Password, "test@123");
//		doActionsClick(Login);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	
	public static void doSendKeysWithMoveToElement(By locator, String value) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}
	
	public static void doClickWithMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click().build().perform();
	}
	
	
}
