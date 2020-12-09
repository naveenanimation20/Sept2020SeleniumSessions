package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		By start = By.cssSelector("div#start button");
		By helloWorldText = By.xpath("//div[@id='finish']/h4");

		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.retryingElement(start).click();
		
		WebElement ele = eleUtil.retryingElement(helloWorldText);
		System.out.println(ele);
		System.out.println(ele.getText());
		
		
	}

}
