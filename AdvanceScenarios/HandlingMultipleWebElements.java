package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.flipkart.com");
		driver.get("https://www.amazon.com");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		int count=0;
		for (WebElement link : allLinks) 
		{
//			System.out.println(link.getText()); //Prints all the visible visible texts
			System.out.println(link.getAttribute("class"));
//			System.out.println(link.getDomAttribute("href"));
			count++;
		}
		System.out.println("Total number of links present are: "+count);
	}

}
