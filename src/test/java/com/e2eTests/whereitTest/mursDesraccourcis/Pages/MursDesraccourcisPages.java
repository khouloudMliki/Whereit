package com.e2eTests.whereitTest.mursDesraccourcis.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MursDesraccourcisPages{

final static String  NOMBRE_EQUIPEMENT_LIBRE ="//*[contains(@id,'equipment_kind_')]/div/div[1]";
final static String  NOMBRE_EQUIPEMENT_LIBRE_TABLEAU = "mat-paginator-range-label";
final static String  PSSJ =  "button_PSSJ"; 
public final static String  MONITEUR =  "family_";
final static String  TABLEAU_EQUIPEMENT=  "mat-table";
final static String TABLE="//*[@id=\"events-list-list\"]";
final static String BOUTTON_PAGINATION_SUIVANT="//button[@class=\"mat-paginator-navigation-next mat-icon-button\"]";
final static String TABLEAU_EQUIPEMENT_ROW="//*[@id=\"events-list-list\"]/div/table/tbody/tr";
final static String ROW_EQP="*//td[2]";
final static String  EQUIPEMENT=  "//*[contains(@id,'family_')]";
final static String HORS_SITE  = "ribbon_out_site_filter";

/*FindBy*/
@FindBy(how = How.XPATH, using = NOMBRE_EQUIPEMENT_LIBRE)
public static WebElement nbreEquiLibre;
@FindBy(how = How.CLASS_NAME, using = NOMBRE_EQUIPEMENT_LIBRE_TABLEAU)
public static WebElement nbreEquiLibreTab;

@FindBy(how = How.ID, using = PSSJ)
public static WebElement pssj;
@FindBy(how = How.ID, using = MONITEUR)
public static WebElement moniteur;
@FindBy(how = How.CLASS_NAME, using = TABLEAU_EQUIPEMENT)
public static WebElement tableEquipement;
@FindBy(how = How.XPATH, using = TABLE)
public static WebElement tableLine1;
@FindBy(how = How.XPATH, using = BOUTTON_PAGINATION_SUIVANT)
public static WebElement btnPsuivant;
@FindAll(@FindBy(how = How.XPATH, using =TABLEAU_EQUIPEMENT_ROW))
public static List<WebElement> tableEqRow;
@FindBy(how = How.XPATH, using = ROW_EQP)
public static WebElement rowEqp;
@FindAll(@FindBy(how = How.XPATH, using =EQUIPEMENT))
public static List<WebElement> eqps;
@FindAll(@FindBy(how = How.ID, using =HORS_SITE))
public static WebElement horsSite;
}