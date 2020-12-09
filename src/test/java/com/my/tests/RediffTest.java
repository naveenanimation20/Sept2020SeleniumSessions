package com.my.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffTest extends BaseTest {

	public static String TITLE = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

	@Test(priority = 1)
	public void rediffTitleTest() {
		driver.get("https://www.rediff.com");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, RediffTest.TITLE);
	}

	@Test(priority = 2)
	public void rediffUrlTest() {
		driver.get("https://www.rediff.com");
		String url = driver.getCurrentUrl();
		System.out.println("page url is: " + url);
		Assert.assertTrue(url.contains("rediff"));
	}

}
