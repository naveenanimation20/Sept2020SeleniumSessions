package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	@Test
	public void loginTest() {
		System.out.println("loginTest");
		int i = 9/0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");

	}

	@Test(dependsOnMethods = "loginTest")
	public void homePageUserInfoTest() {
		System.out.println("homePageUserInfoTest");

	}

}
