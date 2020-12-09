package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://app.hubspot.com/");

		By emailid = By.id("username");
		By signUpLink = By.linkText("Sign up");

		// An expectation for checking that an element is present on the DOM of a page.
		// This does not necessarily mean that the element is visible.

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
//
//		email_ele.sendKeys("test@gmail.com");

		waitForElementToBeLocated(emailid, 10).sendKeys("test@gmail.com");
		//waitForElementToBeVisible(emailid, 10).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();
		
		//waitForElementToBeLocated(signUpLink, 10).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(signUpLink)).click();
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//An expectation for checking that an element is present on the DOM of a page.
	//This does not necessarily mean that the element is visible.
	public static WebElement waitForElementToBeLocated(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	//An expectation for checking that an element, known to be present on the DOM of a page, is visible. 
	//Visibility means that the element is not only displayed 
	//but also has a height and width that is greater than 0.
	public static WebElement waitForElementToBeVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
	
	
	public static void clickWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	

}
