package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//url visit
		driver.get("https://www.nexchar.com/signin");
		
		// input box testing
		
		//ID: edit username input box using id locator
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		//driver.findElement(By.id("Email")).clear();
		
		//Name: edit Password input box using name locator
		driver.findElement(By.name("Password")).sendKeys("12345");
		
		// checkbox testing
		
		//Xpath: remember me checkbox using Xpath locator
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		// button testing
		Thread.sleep(3000);
		//CSSselector: SIgnin button testing using CSSselector
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		List<WebElement> list= driver.findElements(By.xpath("//input"));
		int count = list.size();
		System.out.println(count);

	}

}
