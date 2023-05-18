package PBL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 extends Base {
	@Test(priority=1)
	public void testCase1() {
		System.out.println("C1-TC1");
	}

	@Test(priority=1)
	public void testCase2() {
		System.out.println("C1-TC2");

	}

	@Test(priority=0)
	public void testCase3() {

		System.out.println("C1-TC3");
	}

	@Test(priority=-1)
	public void testCase4() {
		System.out.println("C1-TC4");

	}

	@Test(priority=0)
	public void testCase5() {
		System.out.println("C1-TC5");

	}
}
