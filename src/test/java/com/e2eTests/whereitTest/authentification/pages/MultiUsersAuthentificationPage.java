package com.e2eTests.whereitTest.authentification.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class MultiUsersAuthentificationPage {
	
	public WebDriver driver;
	
	/*Locators*/
	final static String PROFILE = "profile_nav_button";
	final static String ROLE_NAME = "role_name";
	
	/*FindBy*/
	@FindBy(how = How.ID, using = PROFILE)
	public static WebElement profile;
	//@FindBy(how = How.ID, using = ROLE)
	//public static WebElement role;
	@FindBy(how = How.ID, using = ROLE_NAME)
	public static WebElement role;
	
	/*Methods*/
	

}
