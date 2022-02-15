package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest2 {
	WebDriver driver=null;

	@BeforeTest
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Test (priority=1)
	public void Test1()
	{
		driver.get("https://www.nexchar.com/signin");


		driver.findElement(By.id("Email")).sendKeys("gift_shop");


		driver.findElement(By.name("Password")).sendKeys("12345");


		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();

		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Test (priority=2)
	public void Tes2()
	{
		driver.get("https://www.nexchar.com/contactus");
		driver.findElement(By.id("FullName")).sendKeys("Abc");
	}
	public void Test3()
	{
		driver.get("https://www.nexchar.com/signin");


		driver.findElement(By.id("Email")).sendKeys("gift_shop");


		driver.findElement(By.name("Password")).sendKeys("12345");


		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();

		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@AfterTest
	public void tearDown()
	{

		System.out.println("Test Completed");

		driver.close();
	}

}
