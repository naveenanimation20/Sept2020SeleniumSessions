package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLogingTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		br.launchUrl("https://app.hubspot.com/");
		Thread.sleep(6000);

		By email = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		if(eleUtil.doIsDisplayed(email)) {
			eleUtil.doSendKeys(email, "test@gmail.com");
		}
		
		eleUtil.doSendKeys(pwd, "test@123");
		eleUtil.doClick(loginButton);

		br.closeBrowser();

	}

}
