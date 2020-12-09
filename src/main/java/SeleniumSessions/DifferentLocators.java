package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Open Browser

		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);

		// 1. id: unique
		// 2. name: not unique
		// driver.findElement(By.name("username")).sendKeys("testnaveen");

		// 3. className: not unique
		// driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("form-control private-form__control login-email"))
//								.sendKeys("test@gmail.com");
//		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3

		// 4. xpath: is not an attribute, its a locator (address of the element in DOM):
		// driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("test@gmail.com");

		// 5. css Selector: is not an attribute, its a locator
		// driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");

		// 6. linkText: only for links: having <a> html tag
		// driver.findElement(By.linkText("Sign up")).click();

		// 7. partialLinkText: only for links: for long link text
		// driver.findElement(By.partialLinkText("Sign")).click();
		// sign up
		// sign in

		// 8. tagName
//		String h2_text = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(h2_text);

//		String text = driver.findElement(By.linkText("Sign up")).getText();
//		System.out.println(text);

		By signup_link = By.linkText("Sign up");
		String text = doGetText(signup_link);
		System.out.println(text);

//		boolean b = driver.findElement(By.id("username")).isDisplayed();
//		if(b) {
//			System.out.println("user name is present");
//		}
//		else {
//			System.out.println("user name is not present");
//		}

		By emailId = By.id("username");
		if (doIsDisplayed(emailId)) {
			System.out.println("email id is present");
			doSendKeys(emailId, "test@gmail.com");
		}

		if (doIsDisplayed(signup_link)) {
			System.out.println("signup link is present");
			doClick(signup_link);
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
