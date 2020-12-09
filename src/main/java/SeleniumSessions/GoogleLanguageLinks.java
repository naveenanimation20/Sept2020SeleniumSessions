package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		// get the text of each lang link
		// click on link one by one
		// come back
		// and click on next link

		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println("total lang links count: " + langList.size());

		for (WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals("मराठी")) {
				e.click();
				break;
			}

		}

	}

}
