package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityTestCases {

	@Test
	public void atest() {
		System.out.println("a test");
	}

	@Test
	public void btest() {
		System.out.println("b test");
	}

	@Test(priority = 1)
	public void ctest() {
		System.out.println("c test");
	}

	@Test(priority = 2)
	public void dtest() {
		System.out.println("d test");
	}

	@Test(priority = 3)
	public void etest() {
		System.out.println("e test");
	}

}
