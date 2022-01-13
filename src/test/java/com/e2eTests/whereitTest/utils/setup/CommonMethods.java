package com.e2eTests.whereitTest.utils.setup;

import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.e2e.whereit.page.AbstractPage;
import com.e2eTests.whereitTest.mursDesraccourcis.Pages.MursDesraccourcisPages;

/***
 * 
 * @author stephane.joyeux
 *
 */

public class CommonMethods {
	private MursDesraccourcisPages mursDesraccourcisPages = new MursDesraccourcisPages();

	public static WebDriver driver;
	public static Properties prop;

	private static final String CONFIG_PROPERTIES = "src/main/resources/configs/config.properties";

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public CommonMethods() {
		driver = Setup.driver;
	}

	public void buttonScrollBottom() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}


	public void openURLWithConfigFile(String url) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(CONFIG_PROPERTIES);
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}

	public void clickElementWithJavascriptExecutor(WebElement web_element) {
		WebElement element = web_element;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	// Click Methodby usingJAVA Generic
	public <T> void click(T elementAttr) {
		if (elementAttr.getClass().getName().contains("By")) {
			driver.findElement((By) elementAttr).click();
		} else {
			((WebElement) elementAttr).click();
		}
	}

	// Write Text by using JAVA Generic
	public <T> void writeText(T elementAttr, String text) {
		if (elementAttr.getClass().getName().contains("By")) {
			driver.findElement((By) elementAttr).sendKeys(text);
		} else {
			((WebElement) elementAttr).sendKeys(text);
		}
	}

	// Read Text by using JAVA Generic
	public <T> String readText(Object object) {
		if (object.getClass().getName().contains("By")) {
			return driver.findElement((By) object).getText();
		} else {
			return ((WebElement) object).getText();
		}
	}

	public void selectDropDownListByVisibleText(String text, String sufixFiltre) {
		Select dropDownList = new Select(driver.findElement(By.id("ribbon_" + sufixFiltre + "_filter")));
		dropDownList.selectByVisibleText(text);
	}

	public void selectDropDownListByVisibleTextin(WebElement element, String value) {
		Select dropDownList = new Select(element);
		dropDownList.selectByVisibleText(value);
	}
	//***************************************************************
	public void selectDropDownListByVisibleIndex(WebElement element, int index) {
		Select dropDownIndex = new Select(element);
		dropDownIndex.selectByIndex(index);
	}
	

	public static String dropDownIndexgetFirstSelectedOption(WebElement element) {
		Select dropDownIndex = new Select(element);
		String content= dropDownIndex.getFirstSelectedOption().getText();
		return content;
	}
	

	public void selectDropDownListByValue(WebElement element, String text) {
		Select dropDownValue = new Select(element);
		dropDownValue.selectByVisibleText(text);
	}
	
	public String selectDropDownListGetOptions(WebElement element) {
		Select dropDownValue = new Select(element);
		java.util.List<WebElement>   values = dropDownValue.getOptions();
		
		System.out.println(values.size());

	    String listeEquipement= "";
	    
	    int j = values.size()-1;
	   while (j > 0) {
	 
	    	listeEquipement= values.get(j).getText() +", "+listeEquipement;
         j= j-1;
	    }
		
	    return listeEquipement;	
      
	}

	//***************************************************************
	public void dragAndDrop(WebElement element1, WebElement element2) {

		Actions actions = new Actions(driver);
		WebElement from = element1;
		WebElement to = element2;
		actions.dragAndDrop(from, to).perform();
	}

	public boolean verifyIfElementIsDisplayed(WebElement element) {

		WebElement displayedElement = element;
		boolean status = displayedElement.isDisplayed();
		return status;
	}

	public boolean isFileDownloaded(String downloadPath) {
		String check = "États des capteurs";
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();

		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().contains(check)) {
				// dirContents[i].delete();
				System.out.println(dirContents[i].length());
				return true;
			}
		}
		return false;
	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void refrech() {
		driver.navigate().refresh();
	}
	
	
	public void wait(int time) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS) ;
	}
	
	
	public static boolean isAlertPresent(){
        try{
            driver.switchTo().alert();
            return true;
            }catch(NoAlertPresentException ex){
                  return false;
            }
	}
	public static String handleAlert(){
           Alert alert = driver.switchTo().alert();
           String msg= alert.getText();
            alert.accept();
            return msg; 
		}       
	
	
	public boolean verifyIfElementIsSelected(WebElement element) {

		WebElement selectedElement = element;
		boolean status = selectedElement.isSelected();
		return status;
	}
	
	
	
	public int getNombreEquipementLibres(String value, int v) {
		String[] vals = value.split(" ");
		System.out.println (vals[v]);
		int a = Integer.valueOf(vals[v]);
	    return a;  
		
	}

	public WebElement genrateElm(String value1, String value2) {
		return driver.findElement(By.id(value1 + value2));
		
	}

	
	public int getNombreRow (java.util.List<WebElement> rowTable) {
		
	 int  rows = rowTable.size();
	return rows;
   }
	
	
	public int getIndexPagination () {
		
		String nombmreEquipementLibre = this.readText(mursDesraccourcisPages.nbreEquiLibre);
		int nbreEquipementLibreInt = this.getNombreEquipementLibres(nombmreEquipementLibre, 0);
		
		int index;
		if (nbreEquipementLibreInt == 0) {
		
			index=2;	
		}
			else {
				index=4;
			}
			 return index;
		}
	
	


	public  int  getNombreTableRows(WebElement btnPsuivant, java.util.List<WebElement> rows) {
		
		boolean statut = btnPsuivant.isEnabled();
		int nombreDeLigne = this.getNombreRow(rows);
		this.buttonScrollBottom();
		this.clickElementWithJavascriptExecutor(btnPsuivant);
	
		    while ( statut==true ) {

		statut = btnPsuivant.isEnabled();
		nombreDeLigne = this.getNombreRow(rows)  + nombreDeLigne;
		this.clickElementWithJavascriptExecutor(btnPsuivant);
		
	}
				
		
		return nombreDeLigne;
	}
	
	
	
	public boolean  verifyContentRowsContains(WebElement btnPsuivant, java.util.List<WebElement> rows, String equipement, int column) throws InterruptedException {
		boolean statutResult = true;
		boolean statutButton = btnPsuivant.isEnabled();
	    while ( statutResult ==true &&  statutButton ==true   ) {
	    	int nombreDeLigne = this.getNombreRow(rows);
	    	for (int i = 0; i <= nombreDeLigne - 1 ; i++) {
	    	 WebElement column2 = rows.get(i).findElements(By.tagName("td")).get(column);
	    	 String columnText = column2.getText();
	    	  if (equipement.contains(columnText)  ) {
	       	   statutResult = true;     	   
	              }
	          else {

	       	   statutResult = false;
	          }
	 
	    }
	  	  this.clickElementWithJavascriptExecutor(btnPsuivant);
	  	statutButton = btnPsuivant.isEnabled();

	}

	    return statutResult;
	}
	
	
	public boolean  verifyContentRowsEquals(WebElement btnPsuivant, java.util.List<WebElement> rows, String equipement, int column) throws InterruptedException {
		boolean statutResult = true;
		boolean statutButton = btnPsuivant.isEnabled();
	    while ( statutResult ==true &&  statutButton ==true   ) {
	    	int nombreDeLigne = this.getNombreRow(rows);
	    	for (int i = 0; i <= nombreDeLigne - 1 ; i++) {
	    	 WebElement column2 = rows.get(i).findElements(By.tagName("td")).get(column);
	    	 String columnText = column2.getText();
	    	  if (equipement.equals(columnText)) {
	       	   statutResult = true;     	   
	              }
	          else {

	       	   statutResult = false;
	          }
	 
	    }
	  	  this.clickElementWithJavascriptExecutor(btnPsuivant);
	  	statutButton = btnPsuivant.isEnabled();

	}

	    return statutResult;
	}
	
	
	
	//****************************************************************************************************
	
	
public String[] getListeTypeEquipement(String value) {
		
		String[] vals = value.split(" ");
	    return vals;  	  
	}


public WebElement getEquipement(java.util.List<WebElement> elms, int i) {
	return elms.get(i);
		
	}

public void selectFamilyEquipement(String Filtre) {
	this.clickElementWithJavascriptExecutor(driver.findElement(By.id("family_"  + Filtre)));

}

public void selectTypeEquipement(String Filtre) {
	this.clickElementWithJavascriptExecutor(driver.findElement(By.id("equipment_kind_"+ Filtre)));

}
	


public  void selectCheckBox(WebElement box) {

	this.clickElementWithJavascriptExecutor(box);
	
}

public String readTextEqp(String filtre) {
		return driver.findElement(By.id("equipment_kind_"+ filtre)).getText();
}
	
	
}

	
	













