package com.e2eTests.whereitTest.authentification.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.authentification.pages.AuthentificationPage;
import com.e2eTests.whereitTest.authentification.pages.DeconnexionPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeconnexionStepDefinition {
	
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	public DeconnexionStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, DeconnexionPage.class);
	}
	
	@When("^je clique sur le bouton logout$")
	public void jeCliqueSurLeBoutonLogout() throws Throwable {
	    commonMethods.click(DeconnexionPage.logoutButton);
	}

	@Then("^je me redirige vers la page de connexion$")
	public void jeMeRedirigeVersLaPageDeConnexion() throws Throwable {
	 
	}

}
