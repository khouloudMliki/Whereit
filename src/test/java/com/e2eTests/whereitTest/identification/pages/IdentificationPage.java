package com.e2eTests.whereitTest.identification.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IdentificationPage {
	
	public WebDriver driver;
	
	/*Locators*/
	final static String BATIMENT_ID = "button_Polyclinique Saint Jean";
	final static String RACCOURCI_IDENT_ID = "button_identification";
	final static String TITLE_IDENT_ID = "page_title";
	final static String BUTTON_IDENT_ID = "touch_button";
	final static String MESSAGE_IDENT_ID = "touch_message";
	
	/*FindBy*/
	@FindBy(how = How.ID, using = BATIMENT_ID)
	public static WebElement batId;
	@FindBy(how = How.ID, using = RACCOURCI_IDENT_ID)
	public static WebElement raccourciIdentId;
	@FindBy(how = How.ID, using = TITLE_IDENT_ID)
	public static WebElement titleIdentId;
	@FindBy(how = How.ID, using = BUTTON_IDENT_ID)
	public static WebElement buttonIdentId;
	@FindBy(how = How.ID, using = MESSAGE_IDENT_ID)
	public static WebElement messageIdentId;
	
	/*Methods*/
}
