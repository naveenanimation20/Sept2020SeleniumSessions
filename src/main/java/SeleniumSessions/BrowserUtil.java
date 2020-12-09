package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * 
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver init_driver(String browserName) {

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("please pass the correct browser: " + browserName);
		}

		return driver;

	}

	/**
	 * Thi is used to launch the url using get method
	 * 
	 * @param url
	 */
	public void launchUrl(String url) {
		System.out.println("url = " + url);
		driver.get(url);
	}

	/**
	 * 
	 * @param url
	 */
	public void navigateToUrl(String url) {
		System.out.println("url = " + url);
		driver.navigate().to(url);
	}

	/**
	 * 
	 * @return this returns page title
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
