package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchData 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");

		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();

		String country = "India";

		WebElement ele1 = driver.findElement(By.xpath("//span[text()='"+country+"']/../following-sibling::div[@title='Gold'][1]/span/span"));
		String gold = ele1.getText();
		System.out.println("Number of Gold Medals: "+gold);

		WebElement ele2 = driver.findElement(By.xpath("//span[text()='"+country+"']/../following-sibling::div[@title=\"Silver\"][1]/span/span"));
		String silver = ele2.getText();
		System.out.println("Number of Silver Medals: "+silver);

		WebElement ele3 = driver.findElement(By.xpath("//span[text()='"+country+"']/../following-sibling::div[@title='Bronze'][1]/span/span"));
		String bronze = ele3.getText();
		System.out.println("Number of Bronze Medals:  "+bronze);
	}
}
