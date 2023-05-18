package PBL;

import org.testng.annotations.Test;

public class TC2 {
	@Test(groups="Smoke")
	public void Class2TC1() {
		System.out.println("TM1-C2");
	}
	@Test(groups="Regression")
	public void Class2TC2() {
		System.out.println("TM2-C2");
	}

}
