package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//switch case -- cross browser testing -- webdrivermanager 
		//switch case -- cross browser testing -- binary path  

		String browser = "safari";

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("Please pass the correct browser..." + browser);
		}

		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println(title);// Google

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.quit();

	}

}
