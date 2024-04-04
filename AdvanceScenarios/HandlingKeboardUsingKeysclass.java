package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeboardUsingKeysclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
/*		
//		Normal approach
//		Syntax: AttributeName="AttributeValue"
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
*/
	/*
//		Case 1:
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement PASSWORD = driver.findElement(By.id("password"));
		PASSWORD.sendKeys("secret_sauce");
		PASSWORD.sendKeys(Keys.ENTER);
	*/
	/*
//		Case 2:
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement PASSWORD = driver.findElement(By.id("password"));
		PASSWORD.sendKeys("secret_sauce", Keys.ENTER);
	*/
//		Case 3:
		driver.findElement(By.id("user-name")).sendKeys("standard_user", Keys.TAB, "secret_sauce", Keys.ENTER);
	}

}
