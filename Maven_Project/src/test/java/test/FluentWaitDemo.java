package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		test();

	}

	public static void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	//	driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			//	.withTimeout(5, TimeUnit.SECONDS)
			//	.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement ele= driver.findElement(By.className("LC20lb MBeuO DKV0Md"));
				
				if(ele.isEnabled())
				{
					System.out.println("found");
					
				}
				return ele;
			}
		});
		
		foo.click();

		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
