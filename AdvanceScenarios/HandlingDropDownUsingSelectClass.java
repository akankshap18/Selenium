package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingSelectClass 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		Thread.sleep(2000);
		WebElement datelist = driver.findElement(By.id("day"));
		
		Select select = new Select(datelist);
//		select.selectByIndex(18);
		select.selectByVisibleText("18");
		
		Thread.sleep(2000);
		WebElement monthlist = driver.findElement(By.id("month"));
		
	/*	Select selectmonth = new Select(monthlist);
		selectmonth.selectByIndex(5); */
		
		Select selectmonth = new Select(monthlist);
//		selectmonth.selectByValue("6");
		selectmonth.selectByVisibleText("Jul");
		
		Thread.sleep(2000);
		WebElement yearlist = driver.findElement(By.id("year"));
		
	/*	Select selectyear = new Select(yearlist);
		selectyear.selectByIndex(26); */
		
		Select selectyear = new Select(yearlist);
//		selectyear.selectByValue("1998");
		selectyear.selectByVisibleText("2000");
	}
}
