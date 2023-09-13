package org.stepdef;

import org.Pages.LoginPage;
import org.Pages.SearchHotel;
import org.base.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdef extends UtilityClass{
	UtilityClass ucc;
	
	@Given("User is on Facebook page in chrome browser")
	public void user_is_on_facebook_page_in_chrome_browser() throws InterruptedException {
		
		ucc = new UtilityClass();
		ucc.getDriver();
		ucc.launchUrl("http://adactinhotelapp.com/");
		}
	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
	   
		LoginPage page = new LoginPage();
		page.doLogin(string, string2);				
	}	   
	@When("user enter login button")
	public void userClickOnLoginbutton() {
		
		SearchHotel htl = new SearchHotel();
		htl.doSearchPage("Melboutne", "3- three", "24-08-2023", "25-08-2023", "2 - Two");				
		}	
	@Then("user do validation")
	public void user_do_validation() {
		
		System.out.println("valid username");
	}

}