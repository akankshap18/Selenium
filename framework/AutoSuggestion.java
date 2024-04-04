package framework;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomrepo.FlipKartPage;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        
       FlipKartPage page = new FlipKartPage(driver);
     
   //    driver.findElement(http://By.name("q")).sendKeys("bluetooth");
         page.passValue("bluetooth");
     
         Thread.sleep(2000);
// List<WebElement> allList = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
//
//	for (WebElement ele : allList)
//	{
//		 Thread.sleep(1000);
//		String data = ele.getText();
//		System.out.println(data);
//		if(data.contains("bluetooth headphones"))
//		{
//			http://ele.click();
//			break;
//		}
//		
//	}
      page.handleMultipleElements(driver);
	
	
	
	}

}