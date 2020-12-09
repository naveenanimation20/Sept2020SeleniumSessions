package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//windows:
		//System.setProperty("webdriver.chrome.driver", "c:\\myfolder\\drivers\\chromedriver.exe");

		//Automation Steps:
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Documents/binary/chromedriver");
		WebDriver driver = new ChromeDriver(); //Open Browser
		
		driver.get("http://google.com");//Launch URL
		
		String title = driver.getTitle();//Get the page title
		
		System.out.println("page title is : " + title);
		
		//checkpoint/verification point:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in correct title");
		}
		
		//get the current url:
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("google")) {
			System.out.println("url is correct");
		}
		
		//get the page source:
		//System.out.println(driver.getPageSource());
		
		driver.quit();//close the browser
		//driver.close();
		
		
	}

}
