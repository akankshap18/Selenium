package AdvanceScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingJavaScriptExecutor 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.in");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		Scroll bar down
		for(int i=0; i<3; i++)
		{
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,500)");
		}
//		Scroll by up
		for(int i=0; i<3; i++)
		{
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,-500)");
		}
	}
}
