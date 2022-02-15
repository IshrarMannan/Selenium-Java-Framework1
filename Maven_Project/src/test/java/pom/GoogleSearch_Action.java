package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pom.GoogleSearch_ObjLocator;

public class GoogleSearch_Action {
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		googleSearch();
		
	}
	public static void googleSearch(){
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		GoogleSearch_ObjLocator.textbox_search(driver).sendKeys("selenium");
		GoogleSearch_ObjLocator.textbox_search(driver).sendKeys(Keys.RETURN);
		GoogleSearch_ObjLocator.button_search(driver).sendKeys(Keys.RETURN);

		
		driver.close();
		
		
	}

}
