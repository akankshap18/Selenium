package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathByMultipleLocators {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//		
//		driver.findElement(By.xpath("//input[@id=\"user-name\" and @placeholder=\"Username\"]")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//input[@id=\"password\" or @placeholder=\"Password\"]")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@type=\"submit\" or @id=\"login-button\"]")).click();
		
		
//		driver.get("https://www.amazon.in");
//		driver.findElement(By.xpath("//a[@class=\"nav-a  \" and text()=\"Amazon miniTV\"]")).click();
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[contains(@title,\"Search for Products, Brands and More\") and @name=\"q\"] ")).sendKeys("iphone");
		
		
		
	}
}
