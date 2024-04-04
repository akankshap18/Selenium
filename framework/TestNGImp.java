package framework;

import org.testng.annotations.Test;

public class TestNGImp 
{
//	@Test (priority = 1)
//	@Test
	@Test (invocationCount = 3)
	public void createContact() throws Throwable
	{
		Thread.sleep(1000);
		System.out.println("contact created");
	}
	
//	@Test (priority = 2)
//	@Test (dependsOnMethods = "createContact")
//	@Test (enabled = false)
	@Test
	public void modifyContact() {
		System.out.println("contact modified");
	}
	
//	@Test (priority = 3)
	@Test (dependsOnMethods = "createContact")
	public void deleteContact() 
	{
		System.out.println("contact deleted");
	}
}
