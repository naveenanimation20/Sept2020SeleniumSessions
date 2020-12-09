package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	// testNG --> unit testing framework
	// is used to design, maintain and run the test cases
	// Annotations to write the test steps and test cases

	// Pre condition --> Test Case steps (Actual vs Expected Result) ---> Post steps
	// launch chrome --> enter the url (google vs google) --> close the browser
	
	
//	BS - connect with DB
//	BT -- create user in db
//	BC -- launch Browser and url
	
//	BM -- login to app
//		T1 -- checkUserIsActiveTest
//	AM -- user is logged out
	
//	BM -- login to app
//		T2 -- checkUserProfile
//	AM -- user is logged out
	
//	BM -- login to app
//		T3 -- getUserInfoTest
//	AM -- user is logged out
	
	
//	AC -- close the browser
//	AT -- deleteUserInDB
//	AS -- disconnectDB

	@BeforeSuite
	public void connectDB() {
		System.out.println("BS - connect with DB");
	}

	@BeforeTest
	public void createUserInDB() {
		System.out.println("BT -- create user in db");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch Browser and url");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- login to app");
	}

	@Test
	public void getUserInfoTest() {
		System.out.println("getUserInfoTest");
	}

	@Test
	public void checkUserIsActiveTest() {
		System.out.println("checkUserIsActiveTest");
	}

	@Test
	public void checkUserProfileTest() {
		System.out.println("checkUserProfileTest");
		int i = 9/0;
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM -- user is logged out");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close the browser");
	}

	@AfterTest
	public void deleteUserInDB() {
		System.out.println("AT -- deleteUserInDB");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS -- disconnectDB");
	}

}
