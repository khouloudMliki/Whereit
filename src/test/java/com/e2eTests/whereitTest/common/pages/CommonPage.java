package com.e2eTests.whereitTest.common.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {
	public WebDriver driver;

	/*Locators*/
	final static String NAME_PAGE = "page_title";
	final static String  BUTON_PSEARCH = "search-custom-button";

	
	/*FindBy*/
	@FindBy(how = How.ID, using = NAME_PAGE)
	public static WebElement namPage;
	
	@FindBy(how = How.ID, using = BUTON_PSEARCH)
	public static WebElement btnPSearch;
	
}
