package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertPopUp
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/*	driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	*/
		
	/*	driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Alert alt = driver.switchTo().alert();
//		alt.accept();
//		alt.dismiss();
		String txt = alt.getText();
		System.out.println(txt);
	*/
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("QSpiders");
		alt.accept();
	}
}
