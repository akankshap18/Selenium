package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitEx {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		Implicit wait
	/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	*/
		
//		Explicit wait
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

//		wait.until(ExpectedConditions.attributeContains(loginButton, "id", "login-button"));
//		loginButton.click();
		
		wait.until(ExpectedConditions.titleContains("Swag Labs"));
		driver.findElement(By.xpath("//div[.=\"Sauce Labs Backpack\"]")).click();
		
//		FluentWait:
	/*	driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.id("login-button"));
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	*/
	}
}
