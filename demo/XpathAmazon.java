package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAmazon {

	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
//		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav_cs_0\"]")).click();
		
//		Syntax 3: //HTMLtag[contains(@AttributeName, "AttributeValue")]
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		List<WebElement> allNames = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		int count=0;
		for (WebElement names : allNames) 
		{
			System.out.println(names.getText());
			count++;
		}
		System.out.println("Number of phones are: "+count);
	}

}
