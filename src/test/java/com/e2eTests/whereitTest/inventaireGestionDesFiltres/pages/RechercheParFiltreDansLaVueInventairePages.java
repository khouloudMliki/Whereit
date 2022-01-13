package com.e2eTests.whereitTest.inventaireGestionDesFiltres.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheParFiltreDansLaVueInventairePages {
	final static String  PSSJ =  "button_PSSJ";  
	final static String  INVENTAIRE =  "button_inventory";
	final static String  BATIMENT  =  "ribbon_building_filter";
	final static String  Etage  =  "ribbon_floor_filter";
	final static String  FILTRE_FAMILLE_EQUIPEMENT =  "ribbon_equipment_family_filter";
	final static String  FILTRE_TYPE_EQUIPEMENT  =  "ribbon_equipment_kind_filter";
	final static String TABLEAU_EQUIPEMENT_ROW="//*[@id=\"events-list-list\"]/div/table/tbody/tr";
	final static String BOUTTON_PAGINATION_SUIVANT="//button[@class=\"mat-paginator-navigation-next mat-icon-button\"]";
	final static String EQUIPEMENT ="ribbon_equipment_name_filter";
	/*FindBy*/


	@FindBy(how = How.ID, using = PSSJ)
	public static WebElement pssj;
	@FindBy(how = How.ID, using = INVENTAIRE)
	public static WebElement inv;
	@FindBy(how = How.ID, using = FILTRE_FAMILLE_EQUIPEMENT)
	public static WebElement filtreFamille;
	@FindBy(how = How.ID, using = FILTRE_TYPE_EQUIPEMENT)
	public static WebElement filtreType ;
	@FindBy(how = How.ID, using = BATIMENT )
	public static WebElement batiment ;
	@FindBy(how = How.ID, using = Etage )
	public static WebElement etage ;
	@FindBy(how = How.XPATH, using =TABLEAU_EQUIPEMENT_ROW)
	public static List<WebElement> tableEqRow;
	@FindBy(how = How.XPATH, using = BOUTTON_PAGINATION_SUIVANT)
	public static WebElement btnPsuivant;
	@FindBy(how = How.ID, using = EQUIPEMENT)
	public static WebElement eqp;

}
