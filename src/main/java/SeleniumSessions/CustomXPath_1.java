package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//xpath: is not an attribute, its a locator
		//address of the element in the DOM
		//two types:
			//1. Abs Xapth : html/body/div/div[2]/div[3]/form/div/div[3]/div/input
			//2. Relative Xpath: Custom Xpath
		
		//tag[@attr = 'value']
		//input[@id='username']
		
		//tag[@attr1='value' and @attr2='value']
		//input[@id='username' and @type='email']
		
		//button[@id]--3
		//button[@id = 'loginBtn'] --1
		//button[@id='loginBtn' and @type]
		//button[@id='loginBtn' and @type='submit']
		
		//input[@class='form-control private-form__control login-email']
		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"));
		//driver.findElement(By.className("form-control private-form__control login-email"));
		
		//a[@href='https://register.freecrm.com/register/']
		//a[@target='_blank']
		
		//text():
		//tag[text()='textvalue']
		//a[text()='Sign Up']
		//h3[text()='Companies & Contacts']
		//h2[text()='Refreshing business software that your teams will love']
		
		//contains():
		//htmlTag[contains(@attr,'value')]
		//input[contains(@id,'username')]
		//input[contains(@id,'user')]
		//input[contains(@id,'name')]
		
		//dynamic ID: //input[@id='test_123']
//		<input id = test_123>
//		<input id = test_456>
//		<input id = test_890>
		
		//input[contains(@id,'test_')]
		
		//contains() with text():
		//htmltag[contains(text(),'textvalue')]
		//h3[contains(text(),'Companies')]
		//a[contains(text(),'Sign')]
		
		//input[contains(@type,'submit') and @value='Login']
		//input[contains(@type,'submit') and contains(@value,'Login')]
		
		//a[@href='https://register.freecrm.com/register/' and contains(text(),'Sign')]
		//input[starts-with(@id,'username')]
		
		//* -- total nodes in HTML DOM
		//*[@id='username']--1
		//input[@id='username']--1
		
		//parent to child:
		//direct child: //div[@class='private-form__input-wrapper']/input[@id='username']
		//div/div -- 16 (only direct child)
		
		//indirect child
		//div//div --24 (direct+Indirect)
		
		//child to parent:
		//backward traversing in xapth:
		//input[@id='username']/../../../../../../../../../..
		
		//input[@id='username']/..
		//input[@id='username']//parent::div
		
		// (//div[@class='private-form__input-wrapper']/input)[1]
		
		// (//input[@type='text'])[6]
		// (//input[@type='text'])[position()=1]
		driver.findElement(By.xpath("(//input[@type='text'])[position()=1]"));
		
		// (//input[@type='text'])[last()]
		
	}

}
