package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("puma");
//		driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.partialLinkText("Today's D")).click();
		driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]")).sendKeys("bluetooth");
	}
}
