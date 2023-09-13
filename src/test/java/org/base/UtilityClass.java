package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class UtilityClass {
	
	public WebDriver driver;
	public void getDriver() {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);	
		}
		
		public void launchUrl (String url) {
			driver.get(url);			
		}
		public void typeText (WebElement element, String data) {
			element.sendKeys(data);		
			
		}
			
		public void btnClick (WebElement element) {
			element.click();		
		}

		
		public void dropbyVisibleText(WebElement element, String data) {
			
			Select se = new Select (element);
			se.deselectByVisibleText(data);
		}
		
	

}
