package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch_Object_Locator {
	
    WebDriver driver=null;
	
	By textbox_search= By.name("q");
	By button_search= By.name("btnK");
	
	public GoogleSearch_Object_Locator(WebDriver driver){
		this.driver=driver;
	}
	
	public void setTextInSearchbox(String text){
		
		driver.findElement(textbox_search).sendKeys(text);
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
		
	}
	public void clickSearchButton(){
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
		
	}



}
