package com.e2eTests.whereitTest.authentification.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPage {
	
	public WebDriver driver;
	/*Locators*/
	final static String USERNAME = "forgot_password_button";
	final static String FORGOT_PASSWORD = "forgot_password_button";
	final static String ADRESS_MAIL = "mail";
	final static String BUTTON_ENVOYER = "send_button";
	
	/*FindBy*/
	@FindBy(how = How.ID, using = USERNAME)
	public static WebElement username;
	@FindBy(how = How.ID, using = FORGOT_PASSWORD)
	public static WebElement forgotPw;
	@FindBy(how = How.ID, using = ADRESS_MAIL)
	public static WebElement adressMail;
	@FindBy(how = How.ID, using = BUTTON_ENVOYER)
	public static WebElement envoyerButton;
	
	/*Methods*/
	public void fillUserName(String name) {
		username.sendKeys(name);
	}
}
