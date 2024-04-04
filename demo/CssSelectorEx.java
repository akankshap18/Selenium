package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	
//		Syntax 1: [AttributeName = "AttributeValue"]
//		driver.findElement(By.cssSelector("[data-test=\"username\"]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("standard_user");
		
//		Syntax 2: HTMLTag[AttributeName = "AttributeValue"]
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("secret_sauce");
		
//		driver.findElement(By.className("btn_action")).click();
		
//		Syntax 3: #Attribute  ----> Supports only id() locator. 
//		driver.findElement(By.cssSelector("#login-button")).click();
		
//		Syntax 4: HTMLTag#AttributeValue ----> Supports only id() locators/AttributeName
		driver.findElement(By.cssSelector("input#login-button")).click();
				
//		Syntax 5: .AttributeValue 
//		className = "AttributeValue"  ----> Supports only className
//		driver.findElement(By.cssSelector(".btn_action")).click();
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
	}

}
