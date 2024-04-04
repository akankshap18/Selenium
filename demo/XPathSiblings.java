package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSiblings {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/QSpiders/Selenium/WebTable.html");
		driver.findElement(By.xpath("//td[text()=\"Kanthara\"]/../td[text()=\"10cr\"]"));
		
	}

}
