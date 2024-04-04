package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindowsPopupEx1 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement txt = driver.findElement(By.xpath("//div[text()=\"Jobs\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(txt).perform();
		
		driver.findElement(By.xpath("//div[text()=\"Jobs by skill\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Services\"]")).click();
//		driver.findElement(By.xpath("//span[text()=\"RESUME WRITING\"]")).click();
		
		String mainwin = driver.getWindowHandle();  //Fetches current window ID
		System.out.println(mainwin);
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);  //Win1, Win2
		
		for (String win : allwin) 
		{
			if(!mainwin.equals(win))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()=\"RESUME WRITING\"]")).click();
			}
		}	
		
	}
}
