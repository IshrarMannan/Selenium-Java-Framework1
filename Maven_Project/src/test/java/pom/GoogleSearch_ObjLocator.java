package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch_ObjLocator {

		private static WebElement locator=null;
		
		public static WebElement textbox_search(WebDriver driver)
		{
			locator =driver.findElement(By.name("q"));
			return locator;
		}
		public static WebElement button_search(WebDriver driver)
		{
			locator =driver.findElement(By.name("btnK"));
			return locator;
		}




}
