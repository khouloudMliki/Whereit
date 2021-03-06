package com.e2eTests.whereitTest.gestionDeRole.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.export.pages.ExportUserPage;
import com.e2eTests.whereitTest.gestionDeRole.Pages.CreationDeRolePage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;
import com.mongodb.operation.CreateCollectionOperation;

import cucumber.api.java.en.When;

public class CreationDeRoleStepDef {
	
	public WebDriver driver; 
	private CommonMethods commonMethods = new CommonMethods();
	public CreationDeRoleStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, ExportUserPage.class);
	}
	
	@When("^je clique sur le menu Role$")
	public void jeCliqueSurLeMenuRole() throws Throwable {
		Thread.sleep(3000);
		commonMethods.buttonScrollBottom();
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.roleMenu);
	}
	
	@When("^je clique sur le bouton plus$")
	public void jeCliqueSurLeBoutonPlus() throws Throwable {	
	   commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.plusButton);
	}

	@When("^je remplis le champ role \"([^\"]*)\"$")
	public void jeRemplisLeChampRole(String ruleName) throws Throwable {
		commonMethods.writeText(CreationDeRolePage.fieldRole, ruleName);
	}

	@When("^je remplis le champ description \"([^\"]*)\"$")
	public void jeRemplisLeChampDescription(String texte) throws Throwable {
		commonMethods.writeText(CreationDeRolePage.fieldDescription, texte);
	}
	
	@When("^je coche la case de Gestion des r√©gions$")
	public void jeCocheLaCaseDeGestionDesR√©gions() throws Throwable {
	   commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesRegions);
	}

	@When("^je coche la case de Gestion des sites$")
	public void jeCocheLaCaseDeGestionDesSites() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesSites);
	}

	@When("^je coche la case de Gestion des passerelles$")
	public void jeCocheLaCaseDeGestionDesPasserelles() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesPasserelles);
	}

	@When("^je coche la case de Gestion des capteurs$")
	public void jeCocheLaCaseDeGestionDesCapteurs() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesCapteurs);
	}

	@When("^je coche la case de Gestion des types d‚Äô√©quipements$")
	public void jeCocheLaCaseDeGestionDesTypesD√Čquipements() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesTypesDequipements);
	}

	@When("^je coche la case de Gestion des √©quipements$")
	public void jeCocheLaCaseDeGestionDes√Čquipements() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesEquipements);
	}

	@When("^je coche la case de Gestion des r√®gles / alertes$")
	public void jeCocheLaCaseDeGestionDesR√®glesAlertes() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesRegles);
	}

	@When("^je coche la case de Gestion de la customisation d'interface$")
	public void jeCocheLaCaseDeGestionDeLaCustomisationDInterface() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDeCustomisationDinterface);
	}

	@When("^je coche la case de Gestion des profils de droit / r√īles$")
	public void jeCocheLaCaseDeGestionDesProfilsDeDroitR√īles() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesProfilsDroits);
	}

	@When("^je coche la case de Gestion des utilisateurs$")
	public void jeCocheLaCaseDeGestionDesUtilisateurs() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDesUtilisateurs);
	}

	@When("^je coche la case de Recherche √©quipement$")
	public void jeCocheLaCaseDeRecherche√Čquipement() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.rechercheEquipement);
	}

	@When("^je coche la case de Localisation √©quipement$")
	public void jeCocheLaCaseDeLocalisation√Čquipement() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.localisationEquipement);
	}

	@When("^je coche la case de Historique √©quipement$")
	public void jeCocheLaCaseDeHistorique√Čquipement() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.historiqueEquipement);
	}

	@When("^je coche la case de R√©servation √©quipement$")
	public void jeCocheLaCaseDeR√©servation√Čquipement() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.reservationEquipement);
	}

	@When("^je coche la case de Export de donn√©es$")
	public void jeCocheLaCaseDeExportDeDonn√©es() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.exportDonnees);
	}

	@When("^je coche la case de Tableau de bord$")
	public void jeCocheLaCaseDeTableauDeBord() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.dashboard);
	}

	@When("^je coche la case de Module de gestion de la carte thermique$")
	public void jeCocheLaCaseDeModuleDeGestionDeLaCarteThermique() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.gestionDeCarteThermique);
	}

	@When("^je coche la case de API$")
	public void jeCocheLaCaseDeAPI() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.api);
	}
	
	@When("^je clique sur le bouton enregistrer$")
	public void jeCliqueSurLeBoutonEnregistrer() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(CreationDeRolePage.saveButton);
	}
}
