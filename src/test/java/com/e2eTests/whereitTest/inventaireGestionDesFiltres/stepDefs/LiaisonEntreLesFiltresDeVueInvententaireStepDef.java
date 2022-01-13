package com.e2eTests.whereitTest.inventaireGestionDesFiltres.stepDefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.inventaireGestionDesFiltres.pages.LiaisonEntreLesFiltresDeVueInvententairePage;
import com.e2eTests.whereitTest.localisation.pages.LocalisationPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.*;

public class LiaisonEntreLesFiltresDeVueInvententaireStepDef {
	
	
	public LiaisonEntreLesFiltresDeVueInvententaireStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, LiaisonEntreLesFiltresDeVueInvententairePage.class);
	}
	
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private LiaisonEntreLesFiltresDeVueInvententairePage inventaireGestionDesFiltresPage = new LiaisonEntreLesFiltresDeVueInvententairePage();
	
	
	
	@Given("^Je clique sur inventaire du site PSSJ$")
	public void jeCliqueSurInventaireDuSitePSSJ() throws Throwable {
		commonMethods.wait(4000);
		commonMethods.click(inventaireGestionDesFiltresPage.pssj);
		commonMethods.wait(4000);
		commonMethods.click(inventaireGestionDesFiltresPage.inv);
	  
	}

	@When("^Je choisie l'option \"([^\"]*)\" du filtre \"([^\"]*)\"$")
	public void jeChoisieLaValeurDuFiltre(String valeur, String filtre) throws Throwable {
    commonMethods.selectDropDownListByVisibleText(valeur,filtre);
 
	}

	


}
