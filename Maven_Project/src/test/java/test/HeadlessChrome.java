package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChrome {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		test();

	}
	public static void test()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--headless");
		driver=new ChromeDriver(option);
		
		
		driver.get("https://www.nexchar.com/signin");
	
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		driver.findElement(By.name("Password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.close();
		driver.quit();
		System.out.println("Completed");
		

	}

}
