package com.e2eTests.whereitTest.authentification.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {
	
	public WebDriver driver;
	
	/*Locators*/
	final static String USERNAME_ID = "user_name";
	final static String PASSEWORD_ID = "password";
	final static String BUTTON_VALIDER_ID = "login_button";
	final static String PARAMETERS_ID = "Administration_group";
	final static String ERROR_MSG = "error_message";
	
	/*FindBy*/
	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement userNameId;
	@FindBy(how = How.ID, using = PASSEWORD_ID)
	public static WebElement passewordId;
	@FindBy(how = How.ID, using = BUTTON_VALIDER_ID)
	public static WebElement validerButtonId;
	@FindBy(how = How.ID, using = PARAMETERS_ID)
	public static WebElement parametersBtn;
	@FindBy(how = How.ID, using = ERROR_MSG)
	public static WebElement errorMessage;
	
	/*Methods*/
	public void fillUserName(String name) {
		userNameId.sendKeys(name);
	}
	
	public void fillpasseword(String password) {
		passewordId.sendKeys(password);
	}
	
	public void clickValiderButton() {
		validerButtonId.click();
	}
	
}
