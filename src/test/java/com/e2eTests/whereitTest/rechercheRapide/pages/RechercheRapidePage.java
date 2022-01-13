package com.e2eTests.whereitTest.rechercheRapide.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheRapidePage {
	/*Locators*/
	final static String RECHERCHER_PAR_NOM = "search-equipment-name";
	final static String RECHERCHER_BUTTON = "search-equipment-name-button"; 
	final static String ALERTE_MSG ="*//app-message/div/div[1]/label";
	final static String ALERTE_BUTTON ="*//app-message/div/div[2]/div/div/button";
	
	
	/*FindBy*/
	@FindBy(how = How.ID, using = RECHERCHER_PAR_NOM)
	public static WebElement rechName;
	@FindBy(how = How.ID, using = RECHERCHER_BUTTON)
	public static WebElement rechBtn;
	@FindBy(how = How.XPATH, using = ALERTE_MSG)
	public static WebElement alertMSG;
	@FindBy(how = How.XPATH, using = ALERTE_BUTTON )
	public static WebElement alertBtn;
	

}

