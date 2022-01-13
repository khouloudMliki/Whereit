package com.e2eTests.whereitTest.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.authentification.pages.AuthentificationPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinitions extends CommonMethods {

	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthentificationStepDefinitions() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationPage.class);
	}

	@Given("^Je me connecte à l'application Whereit-test$")
	public void jeMeConnecteÀLApplicationWhereitTest() throws Throwable {
		logger.info("Je me connecte à l'application Whereit-test");
		commonMethods.openURLWithConfigFile("whereit-test");
	}

	@When("^Je saisis le username \"([^\"]*)\"$")
	public void jeSaisieLeUsername(String name) throws Throwable {
		logger.info("Je saisis le username");
		authentificationPage.fillUserName(name);
	}

	@When("^Je saisis le password \"([^\"]*)\"$")
	public void jeSaisieLePassword(String password) throws Throwable {
		logger.info("Je saisis le password");
		authentificationPage.fillpasseword(password);
	}

	@When("^je clique sur le bouton Valider$")
	public void jeCliqueSurLeBoutonValider() throws Throwable {
		logger.info("je clique sur le bouton Valider");
		authentificationPage.clickValiderButton();
		Thread.sleep(3000);
	}

	@Then("^Redirection vers le compte admin$")
	public void redirectionVersLeCompteAdmin() throws Throwable {
	}

	@Then("^Je verifie le message d'erreur \"([^\"]*)\"$")
	public void je_verifie_le_message_d_erreur(String msg) throws Throwable {
		String messageDerreur = AuthentificationPage.errorMessage.getText();
		Assert.assertTrue(messageDerreur.contains(msg));
	}
	


}
