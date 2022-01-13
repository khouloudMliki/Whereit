package com.e2eTests.whereitTest.recherchePersonalisee.stepDefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.common.stepDefs.Commonsteps;
import com.e2eTests.whereitTest.recherchePersonnalisee.pages.RecherchePersonnaliseePage;
import com.e2eTests.whereitTest.rechercheRapide.pages.RechercheRapidePage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class RecherchePersonnaliseeStepDefs {
	
	public RecherchePersonnaliseeStepDefs() {
		driver = Setup.driver;
		PageFactory.initElements(driver, RecherchePersonnaliseePage.class);
	}

	
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private Commonsteps commonsteps = new Commonsteps();
	private RecherchePersonnaliseePage recherchePersonnaliseePage = new RecherchePersonnaliseePage();
	


	@When("^Je choisis un element parmi la famille des equipements \"([^\"]*)\"$")
	public void jeChoisisUnElementParmiLaFamilleDesEquipements(String familleEquipement) throws Throwable {
	 commonMethods.clickElementWithJavascriptExecutor(recherchePersonnaliseePage.equiMoniteur);
	 commonMethods.wait(20);

	}

	@When("^Le type equipement moniteur s'affiche automatiquement dans la case type des equipements$")
	public void leTypeEquipementMoniteurSAfficheAutomatiquementDansLaCaseTypeDesEquipements () throws Throwable {

	     //	commonMethods.buttonScrollBottom();
	     //boolean typeEquipement = commonMethods.verifyIfElementIsSelected(recherchePersonnaliseePage.equiMoniteurVerf);
	     //assertEquals(typeEquipement,true);
		 String valeur =  recherchePersonnaliseePage.equiMoniteurVerf.getAttribute("style");
		 assertEquals(valeur, "color: white;");
	}
	
	@When("^Je clique sur le bouton suivant$")
	public void jecliquesurleboutonsuivant() throws Throwable {
	 commonMethods.clickElementWithJavascriptExecutor(recherchePersonnaliseePage.btnSuivant);
	}
	
	@When("^Je choisi le batiment B Medecine$")
	public void jechoisilebatimentBMedecine() throws Throwable {
	 commonMethods.clickElementWithJavascriptExecutor(recherchePersonnaliseePage.batB);
	}

	@When("^Je choisi  un etage Med1$")
	public void jechoisiunetageMed1e() throws Throwable {
        Thread.sleep(200);		

	 commonMethods.clickElementWithJavascriptExecutor(recherchePersonnaliseePage.etgM1);
	}
	
	@When("^Le service Med1 apparait automatiquement$")
	public void leserviceMed1apparaitautomatiquement() throws Throwable {
         Thread.sleep(200);		
         String valeur =  RecherchePersonnaliseePage.serviceVerif.getAttribute("style");
		 assertEquals(valeur, "color: white;");
	 
	}
	
	@When("^Je clique sur Rechercher$")
	public void jecliquesurRechercher() throws Throwable {
	 commonMethods.clickElementWithJavascriptExecutor(recherchePersonnaliseePage.btnR);

	}
	
	
	
}
