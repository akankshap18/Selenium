package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/"); //Launching an application
		
		String title = driver.getTitle(); //Fetching the application title
		System.out.println(title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String source = driver.getPageSource();
		System.out.println(source);
		
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.flipkart.com/"); //Launching an application
//		String title = driver.getTitle(); //Fetching the application title
//		System.out.println(title);
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.flipkart.com/"); //Launching an application
//		String title = driver.getTitle(); //Fetching the application title
//		System.out.println(title);
		
//		Method 2: getTitle() ---->Fetching the application title
//		String title = driver.getTitle();
//		System.out.println(title);
	}
}
