package com.e2eTests.whereitTest.personnalisationDuDashboard.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonnalisationDuDashboardPage {
	
public WebDriver driver;
	
	/*Locators*/
	final static String MENU_BUTTON = "toggle_menu_nav_button";
	final static String ADMINISTRATION = "menu_Administration_group";
	final static String UTILISATEURS = "menu_Administration_Users";
	final static String MODIFIER_BUTTON = "upd_5eb12a5c2b0051bf643b46ba";
	final static String DASHBOARD_OBTION_1 = "show_widget_counters";
	final static String DASHBOARD_OBTION_2 = "show_widget_availability";
	final static String DASHBOARD_OBTION_3 = "show_widget_distribution_kind";
	final static String DASHBOARD_OBTION_4 = "show_widget_distribution_zone";
	final static String DASHBOARD_OBTION_5 = "show_widget_distribution_status";
	final static String DASHBOARD_OBTION_6 = "show_widget_usage_rate";
	final static String DASHBOARD_OBTION_7 = "show_widget_input_output_monitoring";
	final static String DASHBOARD_OBTION_8 = "show_widget_availability_status";
	final static String SAVE_BUTTON = "save_button";
	
	/*FindBy*/
	@FindBy(how = How.ID, using = MENU_BUTTON)
	public static WebElement menuButt;
	@FindBy(how = How.ID, using = ADMINISTRATION)
	public static WebElement administration;
	@FindBy(how = How.ID, using = UTILISATEURS)
	public static WebElement utilisateurs;
	@FindBy(how = How.ID, using = MODIFIER_BUTTON)
	public static WebElement modifierButt;
	@FindBy(how = How.ID, using = DASHBOARD_OBTION_1)
	public static WebElement obtion_1;
	@FindBy(how = How.ID, using = DASHBOARD_OBTION_2)
	public static WebElement obtion_2;
	@FindBy(how = How.ID, using = DASHBOARD_OBTION_3)
	public static WebElement obtion_3;
	@FindBy(how = How.ID, using = DASHBOARD_OBTION_4)
	public static WebElement obtion_4;
	@FindBy(how = How.ID, using = DASHBOARD_OBTION_5)
	public static WebElement obtion_5;
	@FindBy(how = How.ID, using = DASHBOARD_OBTION_6)
	public static WebElement obtion_6;
	@FindBy(how = How.ID, using = DASHBOARD_OBTION_7)
	public static WebElement obtion_7;
	@FindBy(how = How.ID, using = DASHBOARD_OBTION_8)
	public static WebElement obtion_8;
	@FindBy(how = How.ID, using = SAVE_BUTTON)
	public static WebElement saveButt;
}