package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods 
{
	public static void main(String[] args) throws Throwable 
	{
		//Launching empty browser
		WebDriver driver = new ChromeDriver();
		//Launching an application
		driver.get("https://www.facebook.com");
		
//		driver.navigate().to("https://facebook.com");
		
//		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().back(); //Used for navigating backward button
		
		Thread.sleep(2000);
		driver.navigate().forward(); //Used for navigating forward button
		
		Thread.sleep(2000);
		driver.navigate().refresh(); //Used for navigating refresh button
		
		Thread.sleep(3000);
	
//		Method 6: Close the tab where driver is currently in focus
		driver.close();
	}
}
