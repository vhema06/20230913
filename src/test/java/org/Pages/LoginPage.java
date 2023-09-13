package org.Pages;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UtilityClass {
	
	
	public LoginPage() {
	PageFactory.initElements(driver, this);	}
	
	@FindBy (id = "username")
	private WebElement txtUsername;
	
	@FindBy (id = "password")
	private WebElement txtPassword;
	
	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void doLogin(String username, String password) {
	WebElement txtUsername2 = getTxtUsername();
	typeText(txtUsername2, username);
	
	WebElement txtPassword2 = getTxtPassword();
	typeText(txtPassword2, password);
	
	WebElement btnLogin2 = getBtnLogin();
	btnClick(btnLogin2);
}
}
