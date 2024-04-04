package AdvanceScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationHandling 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.facebook.com");
			
//		wait() ---> Java wait, Implicit wait, Explicit wait and Fluent wait
//		Java wait
//		Thread.sleep(1000);  //---milliseconds
//		Thread.sleep(5000);  //---3sec=2sec -->No Such Element Exception(NSEE)
		
//		Implicit wait  -->NSEE
//		Version 3:
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Version 4:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
//		Explicit wait ---> TimeOutException --> Polling Time -->0.5Sec
	/*	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		driver.findElement(By.xpath("//option[text()=\"10\"]")).click();
	*/
		
//		Fluent wait  ---> TimeoutException --> Polling Time can be customized.
		FluentWait wait = new FluentWait (driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
		driver.findElement(By.xpath("//option[text()=\"10\"]")).click();
		
	}
}
