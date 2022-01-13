package com.e2eTests.whereitTest.rechercheRapide.stepDefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.authentification.pages.AuthentificationPage;
import com.e2eTests.whereitTest.common.pages.CommonPage;
import com.e2eTests.whereitTest.rechercheRapide.pages.RechercheRapidePage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.*;

public class RechercheRapideStepDef {
	
	
	public RechercheRapideStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, RechercheRapidePage.class);
	}

	
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private RechercheRapidePage rechercheRapidePage = new RechercheRapidePage();
	
	@When("^Je saisis la valeur \"([^\"]*)\" dans la barre de recherche$")
	public void jeSaisisLaValeurDansLaBarreDeRecherche(String namEquip) throws Throwable {
		commonMethods.writeText(rechercheRapidePage.rechName, namEquip);
	   
	}

	@When("^Je clique sur le bouton rechercher$")
	public void jeCliqueSurLeBoutonRechercher() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(rechercheRapidePage.rechBtn);
		commonMethods.wait(1000);  
	}

	@Then("^Message d'alerte apparait \"([^\"]*)\"$")
	public void messageDAlerteApparait(String expectedMsg) throws Throwable {
     Thread.sleep(400);
     String actualMsg = commonMethods.readText(rechercheRapidePage.alertMSG);
     assertEquals(expectedMsg,actualMsg);
      commonMethods.clickElementWithJavascriptExecutor(rechercheRapidePage.rechBtn);
      
	}


}
