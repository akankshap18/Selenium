package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingEx1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//a[text()=\"Nested Frames\"]")).click();
		
		WebElement Topframe = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
		driver.switchTo().frame(Topframe);
		
		WebElement leftframe = driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));
		driver.switchTo().frame(leftframe);
		
		String txt = driver.findElement(By.xpath("//body[contains(text(),\"LEFT\")]")).getText();
		System.out.println(txt);
	
		driver.switchTo().parentFrame();  //Switching from child to own parent (left to top)
		WebElement middleframe = driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
		driver.switchTo().frame(middleframe);
	
		String txt1 = driver.findElement(By.xpath("//div[.=\"MIDDLE\"]")).getText();
		System.out.println(txt1);
		
//		WebElement rightframe = driver.findElement(By.xpath("//frame[@name=\"frame-right\"]"));
//		driver.switchTo().frame(rightframe);
//		
//		String txt2 = driver.findElement(By.xpath("//body[contains(text(),\"RIGHT\")]")).getText();
//		System.out.println(txt2);
		
		driver.switchTo().defaultContent();  //Switching from grandchild to grandparent (right to bottom)
		
		WebElement bottomframe = driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
		driver.switchTo().frame(bottomframe);
		String txt4 = driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]")).getText();
		System.out.println(txt4);
		
		
	}
}