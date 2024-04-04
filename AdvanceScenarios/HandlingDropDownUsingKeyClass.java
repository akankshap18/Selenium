package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingKeyClass 
{
	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(2000);
		WebElement dateList = driver.findElement(By.id("day"));
		dateList.click();
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_UP);
		dateList.sendKeys(Keys.ARROW_UP);
		WebElement monthList = driver.findElement(By.id("month"));
		monthList.click();
		monthList.sendKeys(Keys.ARROW_DOWN);
		monthList.sendKeys(Keys.ARROW_DOWN);
		monthList.sendKeys(Keys.ARROW_DOWN);
		monthList.sendKeys(Keys.ARROW_UP);
		monthList.sendKeys(Keys.ARROW_UP);
		WebElement yearList = driver.findElement(By.id("year"));
		yearList.click();
		yearList.sendKeys(Keys.ARROW_DOWN);
		yearList.sendKeys(Keys.ARROW_DOWN);
		yearList.sendKeys(Keys.ARROW_UP);
		yearList.sendKeys(Keys.ARROW_UP);
	}
}
