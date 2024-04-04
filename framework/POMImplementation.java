package framework;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomrepo.LoginPage;

public class POMImplementation 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		//step1:- connecting the file path to test script
		// FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\http://PropertiesData1.properties");
		FileInputStream fis = new FileInputStream("./PropertiesData1.properties");

		//Step2:- Helps to read data from File
		Properties pro = new Properties();
		//Step3:-Load data
		pro.load(fis);
		//Step4:-Fetch data from Properties File
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");

		driver.get(URL);
		/*	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();  */

//		getter methods implementations
	/*	LoginPage login = new LoginPage(driver);
		login.getUserTextField().sendKeys(USERNAME);
		login.getPasswordTextField().sendKeys(PASSWORD);
		login.getLoginButton().click(); */
		
		LoginPage login = new LoginPage(driver);
		login.LogintoApplication(USERNAME, PASSWORD);
	}
}
