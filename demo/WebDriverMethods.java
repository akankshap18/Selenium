package demo;

import java.awt.Window;
import java.lang.StackWalker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
	public static void main(String[] args) 
	{
//		Launching empty browser
		WebDriver driver=new ChromeDriver();
		
//		Methods 1: get()
		driver.get("https://www.makemytrip.com"); //Used for launching an application
		
//		Method 2: getTitle()
		String ele = driver.getTitle(); //Fetching the title of application 
		System.out.println(ele);
			
//		Method 3: getCurrentUrl()
		String URL = driver.getCurrentUrl(); //Fetches the URL of current webpage
		System.out.println(URL);
		
//		Method 4: getPageSource()
		String source = driver.getPageSource(); //Fetches the source code of webpage
//		System.out.println(source);
		
//		Method 5: manage()
	/*	Options opt = driver.manage();
		Window win = opt.window();
		win.maximize(); */
//		driver.manage().window().maximize(); //maximize screen of webpage
//		driver.manage().window().minimize(); //minimize screen of webpage
//		driver.manage().window().fullscreen(); //fullscreen of webpage
		
//		Method 6: close() 
		driver.close(); //Close the tab where driver is currently in focus
		
//		Method 7: quit()
		driver.quit(); //Closes all the tabs/windows including browsers
		
		
	}
}
