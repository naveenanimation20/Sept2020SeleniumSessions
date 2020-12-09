package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClickEle).perform();
		
		List<WebElement> optionsList = 
				driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-item context-menu-icon')]"));
		
		System.out.println(optionsList.size());
		
//		for(int i=0; i<optionsList.size(); i++) {
//			String text = optionsList.get(i).getText();
//			System.out.println(text);
//		}
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			
				if(text.equals("Copy")) {
					e.click();
					break;
				}
		}
		
		
	}

}
