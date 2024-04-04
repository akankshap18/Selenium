package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPopUp 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://www.makemytrip.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
//		driver.findElement(By.xpath("//div[text()=\"March 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"15\"]")).click();

		String month="March 2024";
		String date="18";
		driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\""+date+"\"]")).click();
	*/
		
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class=\"sc-gsFSXq bGTcbn\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
		driver.findElement(By.xpath("//div[text()=\"March 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"18\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Done\"]")).click();
//		String month="March 2024";
//		String date="18";
//		driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\""+date+"\"]")).click();
	}
}
