package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWAitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://app.hubspot.com/");
		
		//Thread.sleep(5000);
		
		//Imp wait:
		//is only for webelements
		//its a global wait - will be applied for all the web elements by default
		//its not applicable for non webelements -- title, alert, url

		
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();

		//e4
		//e5
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//e6
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		//e7
		//e8
		

	}

}
