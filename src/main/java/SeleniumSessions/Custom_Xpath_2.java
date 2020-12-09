package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// a[text()='Aanuj
		// D']//parent::td//preceding-sibling::td/input[@type='checkbox']
		// a[text()='Aashish
		// P']//parent::td//preceding-sibling::td/input[@type='checkbox']

		String checkbox_xpath = "//span[text()='Pratik Jain']"
				+ "//ancestor::td//preceding-sibling::td//input[@type='checkbox']//parent::span";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/home-beta");
		Thread.sleep(6000);

		driver.findElement(By.id("username")).sendKeys("pratikj048@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123123");
		driver.findElement(By.id("loginBtn")).click();

		Thread.sleep(6000);

		driver.navigate().to("https://app.hubspot.com/contacts/8689294/contacts/list/view/all/");

		Thread.sleep(4000);

		selectContact("Pratik Jain");
		selectContact("Dev Pawar");
		
		System.out.println(getContactEmail("Dev Pawar"));
		System.out.println(getContactEmail("Pratik Jain"));

	}

	public static void selectContact(String name) {
		String checkbox_xpath = "//span[text()='" + name + "']"
				+ "//ancestor::td//preceding-sibling::td//input[@type='checkbox']//parent::span";
		driver.findElement(By.xpath(checkbox_xpath)).click();

	}
	
	public static String getContactEmail(String name) {
		//span[text()='Pratik Jain']//ancestor::td//following-sibling::td/a
		return driver.
		findElement
		(By.xpath("//span[text()='"+name+"']//ancestor::td//following-sibling::td/a")).getText();
		
	}
	

}
