package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathFlipkart 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("puma sneakers");
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		String name = driver.findElement(By.xpath("//a[@title=\"Popcat 20 Shower RES Men Slides\"]")).getText();
//		System.out.println(name);
		
//		Syntax 1: //HTMLTag[@AttributeName="AttributeValue"]  ----- Xpath by Attribute
//		driver.findElement(By.xpath("//img[@alt=\"Grocery\"]")).click();
		
//		Syntax 2: //HTMLTag[text()="AttributeValue"]  ----- Xpath by Text
//		driver.findElement(By.xpath("//span[text()=\"Grocery\"]")).click();
//		driver.findElement(By.xpath("//span[text()=\"Travel\"]")).click();
		
//		Xpath by Contains Attribute
//		Syntax 3: //HTMLtag[contains(@AttributeName, "AttributeValue")]
//		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search\")]")).sendKeys("Ikigai book");
//		driver.findElement(By.xpath("//button[contains(@type,\"submit\")]")).click();
		
//		Xpath by Contains Text
//		Syntax 4: //HTMLTag[contains(text(), "AttributeValue")]
//		driver.findElement(By.xpath("//span[contains(text(),\"Mob\")]")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		List<WebElement> allList =driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		List<WebElement> allPrices=driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
//		
		int count=0;
		for(WebElement list : allList)
		{
			System.out.println(list.getText() +allPrices.get(count).getText());
			count++;
		}
		System.out.println("Total number of phones: "+count);
//		Thread.sleep(1000);
//		driver.close();
		
//		int count1=0;
//		for(WebElement list : allPrices)
//		{
//			System.out.println(list.getText());
//			count1++;
//		}
//		System.out.println("Total number of phones: "+count1);
		
	}
}
