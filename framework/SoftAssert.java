package framework;

import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void m1()
	{
		System.out.println("Step 1");
		System.out.println("Step 2");
		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(false, false);
		System.out.println("Step 3");
		System.out.println("Step 4");
//		soft.assertAll();
	}
	
	@Test
	public void m2()
	{
		String expData = "Akanksha";
		String actData = "Akanksha";
		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(actData, expData);
	}
}
