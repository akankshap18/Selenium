package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

//		Method 1,2,3: sendKeys(),clear(),submit().
/*
		driver.get("https://www.amazon.in");
		WebElement bar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		bar.sendKeys("nike");
		Thread.sleep(1000);
		bar.clear();
		Thread.sleep(1000);
		bar.sendKeys("puma");
		bar.submit();//--->works only for searchBar
*/
//		driver.get("https://www.facebook.com");
//		Method 4: getLocation()
		WebElement ele = driver.findElement(By.xpath("//a[.=\"Instagram\"]"));
	/*	Point loc = ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		*/
		/*
//		Method 5: getSize()
		Dimension elem = ele.getSize();
		System.out.println(elem.getHeight());
		System.out.println(elem.getWidth());
		*/
//		Method 6: getRect()
		Rectangle elements = ele.getRect();
	    System.out.println(elements.getX());
	    System.out.println(elements.getY());
	    System.out.println(elements.getHeight());
	    System.out.println(elements.getWidth());
		
//		Method 7: getCssValue()
	/*	WebElement ele = driver.findElement(http://By.id("email"));
	    System.out.println(ele.getCssValue("color"));
	    System.out.println(ele.getCssValue("font-size"));*/
		
//		Method 8: getTagName()
//		WebElement elem = driver.findElement(http://By.id("email"));
//	    System.out.println(elem.getTagName());
	    
//		Method 9: getAttribute()
//		driver.get("https://www.flipkart.com");
//	    WebElement search = driver.findElement(http://By.name("q"));
//		System.out.println(search.getAttribute("class"));
	
//		Method 10: getDomAttribute()
//		System.out.println(search.getDomAttribute("placeholder"));
	
//		Method 11: getDomProperty()
//		WebElement txt = driver.findElement(By.xpath("//span[text()=\"Grocery\"]"));
//		System.out.println(txt.getDomProperty("tagName"));
	
//		Method 12: isDisplayed()
		/*		
 		WebElement text = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
		if(text.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo not displayed");
		}
		*/
	    
//		Method 13: isEnabled()
		/*
 		WebElement search1 = driver.findElement(By.name("q"));
		if(search1.isEnabled())
		{
			search1.sendKeys("mask");
		}
		else
		{
			System.out.println("ele not enabled");
		}
		*/
		
//		driver.get("https://www.facebook.com");
		
//		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
//		Thread.sleep(2000);
//		Method 14: isSelected()
		/*	
		WebElement radio = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		http://radio.click();
		if(radio.isSelected())
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button is not selected");
		}
		*/
		
//		Method 15: getAriaRole()
//		WebElement value = driver.findElement(http://By.name("firstname"));
		/*
		System.out.println(value.getAriaRole());
		
		Thread.sleep(2000);
		WebElement xy = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		System.out.println(xy.getAriaRole());
		
//		Method 16: getAccessibleName()
		System.out.println(value.getAccessibleName());
		*/
		
//		driver.get("https://www.flipkart.com");
		
		/*	
		WebElement txt = driver.findElement(By.xpath("//a[@aria-label=\"Grocery\"]"));
	    System.out.println(txt.getAccessibleName());
	    */
	
//		Method 17: getText()
		/*
		 * WebElement txt = driver.findElement(By.name("q")); txt.sendKeys("Nike");
		 * txt.submit(); String name =
		 * driver.findElement(By.xpath("//a[@title=\"NIKE Western Wear Legging\"]")).
		 * getText(); System.out.println(name);
		 */
	}
}
