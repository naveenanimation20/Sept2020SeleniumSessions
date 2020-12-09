package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose_SessionsId {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Documents/binary/chromedriver");
		WebDriver driver = new ChromeDriver(); // Open Browser
		// 123
		driver.get("http://google.com");
		// 123
		String title = driver.getTitle();
		System.out.println(title);// Google

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.quit();// close the browser //123
		// driver.close();//123

		// id = null

		driver = new ChromeDriver();// 456
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

		// NoSuchSessionException: invalid session id

	}

}
