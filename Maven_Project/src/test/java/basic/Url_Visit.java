package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url_Visit {

	public static void main(String[] args) {
		// chromedriver location setup using webdrivermanager function
		WebDriverManager.chromedriver().setup();
		
		// Webdriver object creation for chrome browser
		WebDriver driver=new ChromeDriver();
		
		// url visit
		driver.get("https://www.bup.edu.bd/");


	}

}
