package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch_ActionPage {
	
	private static WebDriver driver=null;

	public static void main(String[] args) {
		
		googleSearch();
		
	}
	public static void googleSearch(){
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		GoogleSearch_Object_Locator searchObj=new GoogleSearch_Object_Locator(driver);
		
		driver.get("https://www.google.com/");
		
		searchObj.setTextInSearchbox("Selenium");
		searchObj.clickSearchButton();
				
		driver.close();
		
		
	}

}
