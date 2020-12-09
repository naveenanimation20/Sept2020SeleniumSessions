package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		
		Thread.sleep(2000);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
//		jsUtil.scrollPageDown();
//		//jsUtil.scrollPageDown("400");
//		
//		jsUtil.scrollPageUp();
		
		WebElement fwdPWdLink = driver.findElement(By.linkText("Forgot Password?"));
		
		jsUtil.scrollIntoView(fwdPWdLink);

	}

}
