package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);
		
		//id --> #{id}
		//class -> .classname
		//#username
		//.c1.c2.c3....
		
		// .form-control.private-form__control.login-email
		//.login-email
		// #username.login-email
		// .login-email#username
		// .form-control.private-form__control.login-email#username
		// #username.form-control.private-form__control.login-email
		
		//tag#id
		//tag.classname
		
		// input#username
		// input.form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email#username
				
		By.cssSelector(".form-control.private-form__control.login-email");
		By.className("form-control private-form__control login-email"); //-- wrong
		By.xpath("//input[@class='form-control private-form__control login-email']");
		
		//input[@id='username']

		//tag[attr = 'value']
		// input[id='username']
		By.cssSelector("input[id='username']");
		
		// input[type='email']
		// input[id='username'][type='email']
		
		//parent to child:
		// div.private-form__input-wrapper input[id='username']
		// div.private-form__input-wrapper > input[id='username']
		
		// .private-form__input-wrapper > input[id='username']
		// .private-form__input-wrapper > input#username
		// .private-form__input-wrapper > #username
		
		//id = "test_1234"
		//id = "test_2345"
		// input[id*='test_']
		
		// input[id*=user] -- contains
		// input[id^='user'] -- starts with
		// input[id$='name'] -- ends with
		
		//child to parent: not possible
		//child to ancestor: no
		
		//comma in css:
		// input#username, input#password
		
		int loginMandatoryElements = driver.findElements
			(By.cssSelector("input#username, input#password, #checkbox-content-4, #loginBtn"))
				.size();
		
		if(loginMandatoryElements == 4) {
			
		}
		
		//nth-of-type:
		// ul.footer-nav li:nth-of-type(3) -- specific index
		// ul.footer-nav li:nth-of-type(n) - all elements
		
		//sibling in css:
		// div.private-form__input-wrapper + div
		
		//not operator in CSS:
		
	//	form-control private-form__control login-email
	//	form-control private-form__control login-password m-bottom-3
		
		// input.form-control.private-form__control:not(#password)
		// input.form-control.private-form__control:not(.login-email)
		
		
	}

}
