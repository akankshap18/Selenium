package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws Throwable 
	{
//		Inserting data to Properties_File
		Properties pro = new Properties();
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		pro.setProperty("url", "https://www.saucedemo.com/v1/");

		FileOutputStream fos = new FileOutputStream("./PropertiesData1.properties");
		pro.store(fos, "CommonData");
		System.out.println("Data Written Sucessfully");

//		Fetching data from Properties_File
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();driver.manage().window().maximize();

		FileInputStream fis = new FileInputStream("./PropertiesData1.properties");

//		Step2:- Helps to read data from File
		Properties pro1 = new Properties();
//		Step3:-Load data
		pro1.load(fis);
//		Step4:-Fetch data from Properties File
		String URL = pro1.getProperty("url");
		String USERNAME = pro1.getProperty("username");
		String PASSWORD = pro1.getProperty("password");

		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
	}

}
