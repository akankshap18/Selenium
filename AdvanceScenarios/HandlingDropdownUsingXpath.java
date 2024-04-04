package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownUsingXpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value=\"18\"]")).click();
		driver.findElement(By.xpath("//option[text()=\"Jul\"]")).click();
		driver.findElement(By.xpath("//option[text()=\"2000\"]")).click();
	}
}
