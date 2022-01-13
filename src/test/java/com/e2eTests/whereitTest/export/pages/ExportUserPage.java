package com.e2eTests.whereitTest.export.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExportUserPage {
	
public WebDriver driver;
	
	/*Locators*/
	final static String EXPORT_MENU_BUTTON = "menu_Administration_Exports";
	final static String BAT_NAME = "sensor_state_building_id";
	final static String SENSOR_EXPORTER_BUTTON = "sensor_state_export_button"; 
	final static String EQUIP_EXPORTER_BUTTON = "equipment_status_export_button";
	final static String SENSOR_START_DATE = "//*[@id=\"sensor_state_start_date\"]/div/input[1]";
	final static String SENSOR_END_DATE = "//*[@id=\"sensor_state_end_date\"]/div/input[1]";
	final static String CHAMP_PERSO_BOX = "equipment_status_show_customs_checkbox";
	final static String STATUS_BOX = "equipment_status_show_statuses_checkbox"; 
	final static String EQUIP_START_DATE = "sensor_state_start_date";
	final static String EQUIP_END_DATE = "sensor_state_end_date";
	
	
	/*FindBy*/
	@FindBy(how = How.ID, using = EXPORT_MENU_BUTTON)
	public static WebElement exportMenuButt;
	@FindBy(how = How.ID, using = BAT_NAME)
	public static WebElement batName;
	@FindBy(how = How.ID, using = SENSOR_EXPORTER_BUTTON)
	public static WebElement sensorExportButt;
	@FindBy(how = How.ID, using = EQUIP_EXPORTER_BUTTON)
	public static WebElement equipExportButt;
	@FindBy(how = How.ID, using = CHAMP_PERSO_BOX)
	public static WebElement champPreso;
	@FindBy(how = How.ID, using = STATUS_BOX)
	public static WebElement statusBox;
	@FindBy(how = How.XPATH, using = SENSOR_START_DATE)
	public static WebElement sensorStartDate;
	@FindBy(how = How.XPATH, using = SENSOR_END_DATE)
	public static WebElement sensorEndDate;
	@FindBy(how = How.ID, using = EQUIP_START_DATE)
	public static WebElement equipStartDate;
	@FindBy(how = How.ID, using = EQUIP_END_DATE)
	public static WebElement equipEndDate;
}
