package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class TestNGListenerDemo2 {
	WebDriver driver=null;
	
	@Test
	public void test4()
	{
		System.out.println("Test4");
	}
	@Test
	public void test5()
	{
		System.out.println("Test5");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.nexchar.com/signin");
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		driver.findElement(By.name("Password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.close();


	}
	@Test
	public void test6()
	{
		System.out.println("Test6");
		throw new SkipException("skipped");
	}



}
