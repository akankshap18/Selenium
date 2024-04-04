package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingEx {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
	/*	
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Akanksha");
	*/	
		
//		Switching using id() value
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hi");
		
//		Switching using name() value
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hello");
		
//		Switching frame using webelement
//		WebElement txt = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
//		driver.switchTo().frame(txt);
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome!!");
	}
}
