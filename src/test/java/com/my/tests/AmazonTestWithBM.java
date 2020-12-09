package com.my.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestWithBM extends BaseTest {

	public static String TITLE = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

	@Test(priority = 1)
	public void amazonTitleTest() {
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, AmazonTest.TITLE);
	}

	@Test(priority = 2)
	public void amazonUrlTest() {
		driver.get("https://www.amazon.in/");
		String url = driver.getCurrentUrl();
		System.out.println("page url is: " + url);
		Assert.assertTrue(url.contains("amazon"));
	}

	@Test(priority = 3)
	public void mobilesLinkPresentTest() {
		driver.get("https://www.amazon.in/");
		Assert.assertTrue(driver.findElement(By.linkText("Mobiles")).isDisplayed());
	}

}
