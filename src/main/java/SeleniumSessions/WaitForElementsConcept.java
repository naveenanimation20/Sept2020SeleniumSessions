package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

		By start = By.cssSelector("#start button");
		By result = By.cssSelector("#finish h4");

//		By footerLinks = By.cssSelector("ul.footer-nav li a");
//
//		getPageLinksText(footerLinks, 10);

		retryingElement(start).click();
		System.out.println(retryingElement(result).getText());

	}

	public static List<WebElement> visibilityOfAllElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public static void getPageLinksText(By locator, int timeOut) {
		visibilityOfAllElements(locator, timeOut).stream().forEach(ele -> System.out.println(ele.getText()));
	}

	public static WebElement retryingElement(By locator) {
		WebElement element = null;
		int attempts = 0;
		while (attempts < 30) {
			try {
				element = driver.findElement(locator);
				break;
			} catch (StaleElementReferenceException e) {
			} catch (NoSuchElementException e) {
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			attempts++;
		}
		return element;
	}

	protected static void clickOnElement(By by) {
		try {
			waitForElementToBeClickableBy(by).click();
		} catch (StaleElementReferenceException e) {
			for (int attempts = 1; attempts < 100; attempts++) {
				try {
					Thread.sleep(500);
					System.out.println("Stale element found retrying:" + attempts);
					waitForElementToBeClickableBy(by).click();
					break;
				} catch (StaleElementReferenceException e1) {
					System.out.println("Stale element found retrying:" + attempts);
				} catch (InterruptedException e1) {

				}
			}
		}

	}

	protected static WebElement waitForElementToBeClickableBy(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

}
