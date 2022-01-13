package com.e2eTests.whereitTest.export.stepDefs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.whereitTest.export.pages.ExportUserPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ExportUserStepDefs extends CommonMethods{
	
	
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private ExportUserPage exportUserPage = new ExportUserPage();
	
	public ExportUserStepDefs() {
		driver = Setup.driver;
		PageFactory.initElements(driver, ExportUserPage.class);
	}

	@When("^je clique sur le menu Export$")
	public void jeCliqueSurLeMenuExport() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(ExportUserPage.exportMenuButt);
	     
	}

	@When("^je choisis un batiment$")
	public void jeChoisisUnBatiment() throws Throwable {
	commonMethods.wait(4);
	commonMethods.selectDropDownListByVisibleTextin(ExportUserPage.batName, "Tous");
	}

	@When("^je clique sur le bouton Exporter$")
	public void jeCliqueSurLeBoutonExporter() throws Throwable {
		commonMethods.wait(4);
		commonMethods.clickElementWithJavascriptExecutor(ExportUserPage.sensorExportButt);
        Thread.sleep(5000);
	}

	@Then("^je verifie que le fichier est bien telechargé$")
	public void jeVerifieQueLeFichierEstBienTelecharge() throws Throwable {
		String path ;
	    path = System.getProperty("user.dir")  + "\\downloadedFiles";
		// Récupérer le répertoire de téléchargement du poste en fonction du système d'exploitation.
		commonMethods.isFileDownloaded(path);
		
		
	}

	@When("^je choisis une date de debut \"([^\"]*)\"$")
	public void jeChoisisUneDateDeDebut(String Date) throws Throwable {
		logger.info("Je saisis une date de debut");
		commonMethods.writeText(exportUserPage.sensorStartDate, Date);
		
	}

	@When("^je choisis une date de fin \"([^\"]*)\"$")
	public void jeChoisisUneDateDeFin(String Date) throws Throwable {
		logger.info("Je saisis une date de fin");
		commonMethods.writeText(exportUserPage.sensorEndDate, Date);
		commonMethods.wait(3000);
		
	}

	@When("^je coche la case de champs personnalisés$")
	public void jeCocheLaCaseDeChampsPersonnalisés() throws Throwable {
		//commonMethods.isCheckboxSelected(ExportUserPage.champPreso);
	}
	
	@When("^je decoche la case de status$")
	public void jeDecocheLaCaseDeStatus() throws Throwable {
		commonMethods.wait(10);
	    commonMethods.clickElementWithJavascriptExecutor(ExportUserPage.statusBox);
	}
	
	@When("^je clique sur le bouton Exporter des Status des equipements$")
	public void jeCliqueSurLeBoutonExporterDesStatusDesEquipements() throws Throwable {
	   
	}
	
}
