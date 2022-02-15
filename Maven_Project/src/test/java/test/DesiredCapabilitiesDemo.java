package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		String ProjectPath= System.getProperty("user.dir");
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("addCustomRequestHeaders", true);

		System.setProperty("webdriver.gecko.driver", ProjectPath+"\\drivers\\geckodriver\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver(caps);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		

	}

}
