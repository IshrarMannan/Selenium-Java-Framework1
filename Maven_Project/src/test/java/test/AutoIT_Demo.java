package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT_Demo {

	static WebDriver driver=null;
	public static void main(String[] args) throws IOException, InterruptedException {
		test();

	}
	public static void test() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://imgbb.com/upload?fbclid=IwAR3u9a-osxlykSe8aJddmqqSaOGlsQy90eOMD3d4oPlAnnJso658urMNzlI");
		driver.findElement(By.xpath("//a[contains(text(),'browse from your computer')]")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\BS784\\OneDrive\\Documents\\AutoIT\\FileUploadScript.exe");
		Thread.sleep(3000);
		
		//driver.close();
	}
}
