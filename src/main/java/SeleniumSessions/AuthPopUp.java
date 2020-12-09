package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		String username = "admin";
		String password = "admin";

		driver.get("https://"+username + ":" + password + "@" +"the-internet.herokuapp.com/basic_auth");
		
		
	}

}
