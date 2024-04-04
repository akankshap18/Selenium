package framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert 
{
	@Test
	public void m1()
	{
		System.out.println("Step 1");
		System.out.println("Step 2");
//		HardAssert
//		Assert.assertEquals(false, false);
		
//		SoftAssert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(false, false);
		System.out.println("Step 3");
		System.out.println("Step 4");
		soft.assertAll();
	}
	
	@Test
	public void m2()
	{
		String expData = "Akanksha";
		String actData = "Akanksha";
//		Assert.assertEquals(actData, expData);
		
//		SoftAssert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actData, expData);
	}
}
