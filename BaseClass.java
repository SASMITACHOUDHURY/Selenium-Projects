package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
public void openBrowser()
{  
		String browser="chrome";
		if(browser.equals("firefox"))
		{
	System.setProperty("webdriver.gecko.driver", "D:\\Drivers/geckodriver.exe");
	driver=new FirefoxDriver();
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("http://lenovo-pc:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	@AfterTest
public void closeBrowser()
{
	driver.close();
}
	@BeforeClass
public void login()
{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
}
	@AfterClass
public void logout()
{
		driver.findElement(By.className("logoutImg")).click();
}
}
