package com.e2eTests.whereitTest.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.authentification.pages.AuthentificationPage;
import com.e2eTests.whereitTest.authentification.pages.MultiUsersAuthentificationPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultiUsersAuthentificationStepDefinition {

	public WebDriver driver;
	private AuthentificationPage authPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();
	public MultiUsersAuthentificationStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, MultiUsersAuthentificationPage.class);
	}

	@When("^je saisis l'identifiant \"([^\"]*)\"$")
	public void je_saisie_l_identifiant(String username) throws Throwable {
		authPage.fillUserName(username);
	}

	@When("^je saisis le mot de passe \"([^\"]*)\"$")
	public void je_saisie_le_mot_de_passe(String password) throws Throwable {
		authPage.fillpasseword(password);
	}

	@When("^je clique sur l'icone profile$")
	public void jeCliqueSurLIconeProfile() throws Throwable {
		Thread.sleep(3000);
		commonMethods.click(MultiUsersAuthentificationPage.profile);
		Thread.sleep(3000);
	}

	@Then("^je verifie le role du profile connecté \"([^\"]*)\"$")
	public void jeVerifieLeRoleDuProfileConnecté(String profilName) throws Throwable {
		String userRole = MultiUsersAuthentificationPage.role.getAttribute("value");
		System.out.println("The user role attribute is: "+userRole);
		//Assert.assertTrue(userRole.contains(profilName));
		Assert.assertEquals(userRole, profilName);
	}

}
