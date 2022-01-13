package com.e2eTests.whereitTest.authentification.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.authentification.pages.ForgotPasswordPage;
import com.e2eTests.whereitTest.authentification.pages.MultiUsersAuthentificationPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.When;

public class ForgotPasswordStepDefinition {
	
	public WebDriver driver;
	private ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
	private CommonMethods commonMethods = new CommonMethods();
	public ForgotPasswordStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, ForgotPasswordPage.class);
	}
	
	@When("^je saisis l'Identifiant \"([^\"]*)\"$")
	public void jeSaisisLIdentifiant(String nom) throws Throwable {
	    commonMethods.writeText(ForgotPasswordPage.username, nom);		
	}
	
	@When("^je clique sur le texte mot de passe oubié\\?$")
	public void jeCliqueSurLeTexteMotDePasseOubié() throws Throwable {
	    commonMethods.click(ForgotPasswordPage.forgotPw);
	}

	@When("^je saisis l'adresse email \"([^\"]*)\"$")
	public void jeSaisisLAdresseEmail(String arg1) throws Throwable {
		commonMethods.click(ForgotPasswordPage.adressMail);
	}

	@When("^je clique sur le bouton envoyer$")
	public void jeCliqueSurLeBoutonEnvoyer() throws Throwable {
		commonMethods.click(ForgotPasswordPage.envoyerButton);
	}

}
