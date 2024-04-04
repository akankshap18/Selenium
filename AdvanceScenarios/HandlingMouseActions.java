package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseActions 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	/*
		driver.get("https://www.amazon.in");
		
		WebElement txt = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(txt).perform();
		act.contextClick(txt).perform();
	*/
	/*	
		driver.get("https://www.saucedemo.com/v1");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	*/
		
//		WebElement USERNAME = driver.findElement(By.id("user-name"));
//		WebElement PASSWORD = driver.findElement(By.id("password"));
//		WebElement LOGIN = driver.findElement(By.id("login-button"));
//		
//		Actions act = new Actions(driver);
	/*	act.sendKeys(USERNAME, "standard_user").perform();
		act.sendKeys(PASSWORD, "secret_sauce").perform();
		act.click(LOGIN).perform();
	
		act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(LOGIN).build().perform();
	*/
//		driver.get("https://www.jqueryui.com/resources/demos/droppable/default.html");
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
		
//		Actions act = new Actions(driver);
	/*	act.dragAndDrop(drag, drop).perform();
		
		act.clickAndHold(drag).perform();
		act.release(drop).perform();
	*/	
//		act.clickAndHold(drag).release(drop).perform();
	/*	
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	*/	
	/*	
		driver.get("https://www.goibibo.com/");
		Actions act = new Actions(driver);
		act.moveByOffset(20, 10).click().perform();
	*/
	}
}
