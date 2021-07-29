package org.pages;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement textUserName;

	@FindBy(id = "password")
	private WebElement textPassword;

	@FindBy(id = "login-button")
	private WebElement btnLogin;

	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement invalid;

	public WebElement getTextUserName() {
		return textUserName;
	}

	public WebElement getTextPassword() {
		return textPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getInvalid() {
		return invalid;
	}

	public void login(String userName, String password) {
		typeText(getTextUserName(), userName);
		typeText(getTextPassword(), password);
		buttonClick(getBtnLogin());
		
	}

}
