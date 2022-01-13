package com.e2eTests.whereitTest.personnalisationDuDashboard.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.personnalisationDuDashboard.Pages.PersonnalisationDuDashboardPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonnalisationDuDashboardStepDef {
	
	public WebDriver driver;
	private PersonnalisationDuDashboardPage personnalisationDuDashboardPage = new PersonnalisationDuDashboardPage();
	private CommonMethods commonMethods = new CommonMethods();
	public PersonnalisationDuDashboardStepDef() {
		driver= Setup.driver;
		PageFactory.initElements(driver, PersonnalisationDuDashboardPage.class);
	}

	@When("^je clique sur le bouton Menu$")
	public void jeCliqueSurLeBoutonMenu() throws Throwable {
		commonMethods.click(personnalisationDuDashboardPage.menuButt);
	}

	@When("^je clique sur le menu Adminstation$")
	public void jeCliqueSurLeMenuAdminstation() throws Throwable {
	    commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.administration);
	    Thread.sleep(3000);
	}

	@When("^je clique sur le menu Utilisateurs$")
	public void jeCliqueSurLeMenuUtilisateurs() throws Throwable {
	    commonMethods.click(PersonnalisationDuDashboardPage.utilisateurs);
	}

	@When("^je clique sue le bouton modifier details utilisateur$")
	public void jeCliqueSueLeBoutonModifierDetailsUtilisateur() throws Throwable {
	    commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.modifierButt);
	}

	@When("^je decoche la case Afficher les compteurs$")
	public void jeDecocheLaCaseAfficherLesCompteurs() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.obtion_1);
	}

	@When("^je decoche la case Afficher le tableau de disponibilité des équipements$")
	public void jeDecocheLaCaseAfficherLeTableauDeDisponibilitéDesÉquipements() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.obtion_2);
	}

	@When("^je decoche la case Afficher le graphique de distribution par types$")
	public void jeDecocheLaCaseAfficherLeGraphiqueDeDistributionParTypes() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.obtion_3);
	}

	@When("^je decoche la case Afficher le graphique de distribution par étage$")
	public void jeDecocheLaCaseAfficherLeGraphiqueDeDistributionParÉtage() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.obtion_4);
	}

	@When("^je decoche la case Afficher le graphique de distribution par statuts$")
	public void jeDecocheLaCaseAfficherLeGraphiqueDeDistributionParStatuts() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.obtion_5);
	}

	@When("^je decoche la case Afficher le graphique de taux d’utilisations :$")
	public void jeDecocheLaCaseAfficherLeGraphiqueDeTauxDUtilisations() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.obtion_6);
	}

	@When("^je decoche la case Afficher le graphique de monitoring d’entrées/sorties$")
	public void jeDecocheLaCaseAfficherLeGraphiqueDeMonitoringDEntréesSorties() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.obtion_7);
	}

	@When("^je decoche la case Afficher le graphique de disponibilités par statuts$")
	public void jeDecocheLaCaseAfficherLeGraphiqueDeDisponibilitésParStatuts() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.obtion_8);
	}

	@When("^je clique le bouton Enregistrer$")
	public void jeCliqueLeBoutonEnregistrer() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(PersonnalisationDuDashboardPage.saveButt);
	}

	@When("^je clique sur un Batiment de la liste$")
	public void jeCliqueSurUnBatimentDeLaListe() throws Throwable {
	    ;
	}

	@When("^je clique sur le menu tableau de bord$")
	public void jeCliqueSurLeMenuTableauDeBord() throws Throwable {
	   
	}

	@Then("^je verifie que la page est vide$")
	public void jeVerifieQueLaPageEstVide() throws Throwable {
	    
	}

	@When("^je choisis un Type d'équipement du combo$")
	public void jeChoisisUnTypeDÉquipementDuCombo() throws Throwable {
	   
	}

	@When("^je choisis une Affectation du combo$")
	public void jeChoisisUneAffectationDuCombo() throws Throwable {
	    
	}

	@When("^je choisis une Localisation du combo$")
	public void jeChoisisUneLocalisationDuCombo() throws Throwable {
	    ;
	}
}
