package com.e2eTests.whereitTest.recherchePersonnalisee.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RecherchePersonnaliseePage {
	/*Locators*/
	final static String EQUIPEMENT_MONITEUR = "//*[text()='MONITEURS']";
	final static String EQUIPEMENT_MONITEUR_VER= "//*[@id=\"select_equipment_kinds\"]/div/div[2]/div/div/div[2]";
	final static String  BOUTON_SUIVANT ="next_button";
	final static String  BATIMENT_B ="//*[@id=\"select_buildings\"]/div/div[2]/div/div[1]/div[2]";
	final static String ETAGE_M1 ="//*[@id=\"select_floors\"]/div/div[2]/div/div[3]/div[2]";
	final static String SERVICE_VERF ="//*[@id=\"select_departments\"]/div/div[2]/div/div/div[2]";
	final static String BOUTON_RECHERCHER ="search_button";
	
	
	/*FindBy*/
	@FindBy(how = How.XPATH, using = EQUIPEMENT_MONITEUR)
	public static WebElement equiMoniteur;
	@FindBy(how = How.ID, using = BOUTON_SUIVANT)
	public static WebElement btnSuivant;
	@FindBy(how = How.XPATH, using = BATIMENT_B)
	public static WebElement batB;
	@FindBy(how = How.XPATH, using = ETAGE_M1)
	public static WebElement etgM1;
	@FindBy(how = How.ID, using = BOUTON_RECHERCHER)
	public static WebElement btnR;
	@FindBy(how = How.XPATH, using = SERVICE_VERF)
	public static WebElement serviceVerif;
	@FindBy(how = How.XPATH, using = EQUIPEMENT_MONITEUR_VER)
	public static WebElement equiMoniteurVerf;

}
