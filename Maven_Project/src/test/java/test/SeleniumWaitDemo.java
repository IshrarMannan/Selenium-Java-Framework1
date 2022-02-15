package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {
	static WebDriver driver=null;
	public static void main(String[] args) {
		seleniumWaits();

	}
	
	public static void seleniumWaits()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.get("https://www.nexchar.com/signin");
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		driver.findElement(By.name("Password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.id("abcdef")));

		driver.findElement(By.name("abc")).click();
		
		driver.close();
		driver.quit();
	}

}
