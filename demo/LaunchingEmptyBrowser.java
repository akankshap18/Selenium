package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingEmptyBrowser 
{
	public static void main(String[] args) 
	{
//		Case 1:
//		String key="webdriver.chrome.driver";
//		String value="./chromedriver.exe";
//		System.setProperty(key, value);
//		WebDriver driver=new ChromeDriver();
		
//		Case 2: Selenium version 3.141.59 and WebDriverManager version 5.3.6
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver1=new ChromeDriver();
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver1=new EdgeDriver();
		
//		Case 3:
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new FirefoxDriver();
	}
}
