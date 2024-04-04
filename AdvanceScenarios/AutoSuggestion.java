package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion 
{
	@Test
	public void autoSuggestion() 
//	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	/*
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
		
		for (WebElement ele : allList) 
		{
			String data = ele.getText();
			System.out.println(data);
			if(data.contains("bluetooth headphones"))
			{
				ele.click();
				break;
			}
		}
	*/
	/*	
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("bluetooth");
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));
		
		for (WebElement ele : allList) 
		{
			String data = ele.getText();
			System.out.println(data);
			if(data.contains("bluetooth headphones"))
			{
				ele.click();
				break;
			}
		}
	*/
//		google -> search selenium -> selenium webdriver
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium");
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@id=\"Zrbbw\"]"));
		
		for (WebElement ele : allList) 
		{
			String data = ele.getText();
			System.out.println(data);
			if(data.contains("selenium webdriver"))
			{
				ele.click();
				break;
			}
		}
	}
	
}
