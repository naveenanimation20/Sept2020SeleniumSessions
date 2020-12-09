package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Documents/binary/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);// Google

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.quit();

	}

}
