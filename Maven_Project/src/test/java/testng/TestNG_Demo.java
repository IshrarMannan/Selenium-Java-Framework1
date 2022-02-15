package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {
	WebDriver driver=null;
	
	@BeforeTest
	public void setupTestNG()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	
    @Test
	public void googleSearch(){
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}
    
    @AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}

}
