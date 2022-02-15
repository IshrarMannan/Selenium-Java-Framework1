package basic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class Url_Visit_SetProperty {

	public static void main(String[] args) {
		
		String ProjectPath= System.getProperty("user.dir");
		System.out.println("ProjectPath: "+ProjectPath);
		
		// firefox location setup using setProperty function
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\BS784\\Documents\\Automation\\Maven_Project\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", ProjectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		
		// webdriver object creation for firefox browser
		WebDriver driver=new FirefoxDriver();
		//url visit
		driver.get("https://wwe.2k.com/");
	}

}
