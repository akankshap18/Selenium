package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindowPopupEx2 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement txt = driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]"));
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		String mainWin = driver.getWindowHandle();//fetches current window Id
		System.out.println(mainWin);//win1
	
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);//win1, win2
	
		for (String win : allWin)
		{
			if(!mainWin.equals(win))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()=\"Downloads\"]")).click();
			}
		}
	}
}
