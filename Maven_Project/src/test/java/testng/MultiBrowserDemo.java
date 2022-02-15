package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowserDemo {
	WebDriver driver=null;
	String ProjectPath= System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void Setup(String browserName)
	{
		
		System.out.println("Browser:" +browserName);
		System.out.println("Thread id:" +Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ProjectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();

		}

	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown()
	{

		System.out.println("Test Completed");

		driver.close();
	}
}
