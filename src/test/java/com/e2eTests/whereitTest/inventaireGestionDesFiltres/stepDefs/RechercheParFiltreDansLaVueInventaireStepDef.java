package com.e2eTests.whereitTest.inventaireGestionDesFiltres.stepDefs;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.inventaireGestionDesFiltres.pages.LiaisonEntreLesFiltresDeVueInvententairePage;
import com.e2eTests.whereitTest.inventaireGestionDesFiltres.pages.RechercheParFiltreDansLaVueInventairePages;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.*;

public class RechercheParFiltreDansLaVueInventaireStepDef {
	
	
	public RechercheParFiltreDansLaVueInventaireStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, RechercheParFiltreDansLaVueInventairePages.class);
	}
	
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private RechercheParFiltreDansLaVueInventairePages rechercheParFiltreDansLaVueInventairePages = new RechercheParFiltreDansLaVueInventairePages();
	
	List<String> tableEquipementList = Arrays.asList("Équipement", "Type d'équipement", "État équipement", "Bâtiment", "Étage" ,"Service", "À proximité de", "Mise à jour", "Précision", "Actions");

	@Then("^Je vérifie les valeurs de la colonne \"([^\"]*)\" appartiennent \"([^\"]*)\"$")
	public void jeVérifieLesValeursDeLaColonneAppartiennent(String colonne, String typesAssocies ) throws Throwable {
		commonMethods.wait(4000);
		int column =tableEquipementList.indexOf(colonne);
		Boolean result= commonMethods.verifyContentRowsContains(rechercheParFiltreDansLaVueInventairePages.btnPsuivant, rechercheParFiltreDansLaVueInventairePages.tableEqRow , typesAssocies, column );
	
	}
	
	@Then("^Je vérifie le contenu de la colonne \"([^\"]*)\" selon le filtre \"([^\"]*)\"$")
	public void jeVérifieLeContenuDeLaColonneSelonLeFiltre (String colonne, String result) throws Throwable {
	commonMethods.wait(4000);
	int column =tableEquipementList.indexOf(colonne);
	Boolean resultobtenu= commonMethods.verifyContentRowsEquals(rechercheParFiltreDansLaVueInventairePages.btnPsuivant, rechercheParFiltreDansLaVueInventairePages.tableEqRow , result, column );

	}
	

	@When("^Je cherche equipement par nom \"([^\"]*)\" dans la colonne \"([^\"]*)\"$")
	public void jeChercheEquipementParNomDansLaColonne(String Nom, String colonne) throws Throwable {
		 commonMethods.writeText(rechercheParFiltreDansLaVueInventairePages.eqp, Nom);
		  int column =tableEquipementList.indexOf(colonne);
		  commonMethods.verifyContentRowsEquals(rechercheParFiltreDansLaVueInventairePages.btnPsuivant, rechercheParFiltreDansLaVueInventairePages.tableEqRow, Nom , column);
		 
	}

	
}
