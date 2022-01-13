package com.e2eTests.whereitTest.gestionDeRole.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreationDeRolePage {
	
	public WebDriver driver; 
	
	/*Locaters*/
	final static String ROLE_MENU = "menu_Administration_Roles";
	final static String PLUS_BUTTON = "add_null";
	final static String FIELD_ROLE = "name";
	final static String FIELD_DESCRIPTION = "description";
	final static String GESTION_DES_REGIONS= "district";
	final static String GESTION_DES_SITES = "gateway";
	final static String GESTION_DES_PASSERELLES = "gateway";
	final static String GESTION_DES_CAPTEURS = "sensor";
	final static String GESTION_DES_TYPE_DEQUIPEMENTS = "equipment_kind";
	final static String GESTION_DES_EQUIPEMENTS = "equipment";
	final static String GESTION_DES_REGLES = "rules";
	final static String GESTION_DE_CUSTOMISATION_DINTERFACE = "customization";
	final static String GESTION_DES_PROFILS_DROITS = "role";
	final static String GESTION_DES_UTILISATEURS = "user";
	final static String RECHERCHE_EQUIPEMENT = "equipment_seek";
	final static String LOCALISATION_EQUIPEMENT = "equipment_localization";
	final static String HISTORIQUE_EQUIPEMENT = "equipment_history";
	final static String RESERVATION_EQUIPEMENT = "equipment_booking";
	final static String EXPORT_DONNEES = "export_data";
	final static String DASHBOARD = "dashboard";
	final static String GESTION_DES_CARTE_THERMIQUE = "thermic_map";
	final static String API = "api";
	final static String SAVE_BUTTON = "//*[@id=\"main\"]/app-role-upd/div/form/button[1]"; 
	
	
	/*FindBy*/
	@FindBy(how = How.ID, using = ROLE_MENU)
	public static WebElement roleMenu;
	@FindBy(how = How.ID, using = PLUS_BUTTON)
	public static WebElement plusButton;
	@FindBy(how = How.ID, using = FIELD_ROLE)
	public static WebElement fieldRole;
	@FindBy(how = How.ID, using = FIELD_DESCRIPTION)
	public static WebElement fieldDescription;
	@FindBy(how = How.ID, using = GESTION_DES_REGIONS)
	public static WebElement gestionDesRegions;
	@FindBy(how = How.ID, using = GESTION_DES_SITES)
	public static WebElement gestionDesSites;
	@FindBy(how = How.ID, using = GESTION_DES_PASSERELLES)
	public static WebElement gestionDesPasserelles;
	@FindBy(how = How.ID, using = GESTION_DES_CAPTEURS)
	public static WebElement gestionDesCapteurs;
	@FindBy(how = How.ID, using = GESTION_DES_TYPE_DEQUIPEMENTS)
	public static WebElement gestionDesTypesDequipements;
	@FindBy(how = How.ID, using = GESTION_DES_EQUIPEMENTS)
	public static WebElement gestionDesEquipements;
	@FindBy(how = How.ID, using = GESTION_DES_REGLES)
	public static WebElement gestionDesRegles;
	@FindBy(how = How.ID, using = GESTION_DE_CUSTOMISATION_DINTERFACE)
	public static WebElement gestionDeCustomisationDinterface;
	@FindBy(how = How.ID, using = GESTION_DES_PROFILS_DROITS)
	public static WebElement gestionDesProfilsDroits;
	@FindBy(how = How.ID, using = GESTION_DES_UTILISATEURS)
	public static WebElement gestionDesUtilisateurs;
	@FindBy(how = How.ID, using = RECHERCHE_EQUIPEMENT)
	public static WebElement rechercheEquipement;
	@FindBy(how = How.ID, using = LOCALISATION_EQUIPEMENT)
	public static WebElement localisationEquipement;
	@FindBy(how = How.ID, using = HISTORIQUE_EQUIPEMENT)
	public static WebElement historiqueEquipement;
	@FindBy(how = How.ID, using = RESERVATION_EQUIPEMENT)
	public static WebElement reservationEquipement;
	@FindBy(how = How.ID, using = EXPORT_DONNEES)
	public static WebElement exportDonnees;
	@FindBy(how = How.ID, using = DASHBOARD)
	public static WebElement dashboard;
	@FindBy(how = How.ID, using = GESTION_DES_CARTE_THERMIQUE)
	public static WebElement gestionDeCarteThermique;
	@FindBy(how = How.ID, using = API)
	public static WebElement api;
	@FindBy(how = How.XPATH, using = SAVE_BUTTON)
	public static WebElement saveButton;
	

}
