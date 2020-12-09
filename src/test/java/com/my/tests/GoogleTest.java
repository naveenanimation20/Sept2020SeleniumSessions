package com.my.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	public static String TITLE = "Google";

	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, GoogleTest.TITLE);
	}

	@Test(priority = 2)
	public void googleUrlTest() {
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println("page url is: " + url);
		Assert.assertTrue(url.contains("google"));
	}

}
