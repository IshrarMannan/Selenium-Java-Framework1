package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasic {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		 // start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
        
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search","Basic test");
        
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case.");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		test1.pass("Entered text in search box");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Presses enter key");
		test1.info("test Completed");
		
		extent.flush();
		System.out.println("completed");
		
	//	driver.close();
	//driver.quit();

		
		
		
		
        // log(Status, details)
        

        // info(details)
        //test1.info("This step shows usage of info(details)");
        
        // log with snapshot
        //test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        //test1.addScreenCaptureFromPath("screenshot.png");
        
        // calling flush writes everything to the log file
       // 



	}

}
