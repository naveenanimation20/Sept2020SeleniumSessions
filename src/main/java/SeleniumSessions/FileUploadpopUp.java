package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		// File Upload pop up:
		// type="file" should be there
		WebElement chooseFile = driver.findElement(By.name("upfile"));

		chooseFile.sendKeys("/Users/naveenautomationlabs/Documents/POM_July.png");

	}

}
