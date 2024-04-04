package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitEx 
{
	@Test
	public void explicitWait() 
//	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[.=\"Create new account\"]")).click();
	
	/*	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Facebook - log in or sign up"));
		driver.findElement(By.name("firstname")).sendKeys("Akanksha");
	*/
		
		FluentWait wait = new FluentWait (driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.pollingEvery(Duration.ofSeconds(10));
//		wait.withTimeout();
		
	}
}
