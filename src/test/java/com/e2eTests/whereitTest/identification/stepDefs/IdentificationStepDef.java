package com.e2eTests.whereitTest.identification.stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.e2eTests.whereitTest.identification.pages.IdentificationPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IdentificationStepDef {
	
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	
	public IdentificationStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver,IdentificationPage.class);
	}
	
	@When("^Je sélectionne un bâtiment$")
	public void jeSélectionneUnBâtiment() throws Throwable {
		Thread.sleep(3000);
	    commonMethods.click(IdentificationPage.batId);
	}

	@When("^Je clique sur le raccourci Identification$")
	public void jeCliqueSurLeRaccourciIdentification() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(IdentificationPage.raccourciIdentId);
	}

	@Then("^Je vérifie que je suis bien sur la page Identification \"([^\"]*)\"$")
	public void jeVérifieQueJeSuisBienSurLaPageIdentification(String title) throws Throwable {
		String titlePageIdent = IdentificationPage.titleIdentId.getText();
		System.out.println("La page actuelle est : " + titlePageIdent);
		Assert.assertEquals(title, titlePageIdent);
	}

	@When("^Je clique sur le bouton Identification capteur$")
	public void jeCliqueSurLeBoutonIdentificationCapteur() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(IdentificationPage.buttonIdentId);
	}

	@Then("^Je vérifie que le décompte s'affiche bien$")
	public void jeVérifieQueLeDécompteSAfficheBien() throws Throwable {
		String counter = IdentificationPage.messageIdentId.getText();
		System.out.println(counter);
	}
	
}
