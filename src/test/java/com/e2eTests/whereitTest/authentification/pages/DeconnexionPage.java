package com.e2eTests.whereitTest.authentification.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeconnexionPage {
	
	public WebDriver driver;
	
	/*Locators*/
	final static String LOGOUT_BUTTON = "logout_nav_button";
	
	/*FindBy*/
	@FindBy(how = How.ID, using = LOGOUT_BUTTON)
	public static WebElement logoutButton;
	
}
