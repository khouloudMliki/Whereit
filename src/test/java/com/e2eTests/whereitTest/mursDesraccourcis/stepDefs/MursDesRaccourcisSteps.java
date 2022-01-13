
package com.e2eTests.whereitTest.mursDesraccourcis.stepDefs;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.common.stepDefs.Commonsteps;
import com.e2eTests.whereitTest.mursDesraccourcis.Pages.MursDesraccourcisPages;
import com.e2eTests.whereitTest.recherchePersonnalisee.pages.RecherchePersonnaliseePage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.*;



public class MursDesRaccourcisSteps {

public MursDesRaccourcisSteps() {
driver = Setup.driver;
PageFactory.initElements(driver, MursDesraccourcisPages.class);
}


public WebDriver driver;
private CommonMethods commonMethods = new CommonMethods();
private MursDesraccourcisPages mursDesraccourcisPages = new MursDesraccourcisPages();
List<String> tableEquipementList = Arrays.asList("Équipement", "Type d'équipement", "État équipement", "Bâtiment", "Étage" ,"Service", "À proximité de", "Mise à jour", "Précision", "Actions");


@Given("^Je clique sur site PSSJ$")
public void jeCliqueSurPSSJ() throws Throwable {
Thread.sleep(1000);
commonMethods.click(mursDesraccourcisPages.pssj);
}

@When("^Je clique sur famille equipement \"([^\"]*)\"$")
public void jeCliqueSurFamilleEquipement(String Feqp) throws Throwable {
Thread.sleep(8000);
commonMethods.selectFamilyEquipement(Feqp);
}




@Then("^Je verifie le nombre des equipements libres et la nature des equipements affiches \"([^\"]*)\"$")
public void jeVerifieLeNombreDesEquipementsLibres(String Teqp) throws Throwable {

commonMethods.wait(1000);
String nombreEquipementLibre = commonMethods.readTextEqp(Teqp);
int nbreEquipementLibreInt = commonMethods.getNombreEquipementLibres(nombreEquipementLibre, 0);
commonMethods.wait(1000);

int index = commonMethods.getIndexPagination();
commonMethods.wait(1000);
commonMethods.selectTypeEquipement(Teqp);
Thread.sleep(4000);
commonMethods.selectCheckBox(mursDesraccourcisPages.horsSite);
Thread.sleep(4000);
String paginationTab = commonMethods.readText(mursDesraccourcisPages.nbreEquiLibreTab);
int paginationTabInt = commonMethods.getNombreEquipementLibres(paginationTab, index);
Thread.sleep(4000);
int nombreRowsTab = commonMethods.getNombreTableRows(mursDesraccourcisPages.btnPsuivant, mursDesraccourcisPages.tableEqRow);
System.out.println("************************************************"+"nombre de ligne dans le tableau "+nombreRowsTab+"nombre de ligne en pagination " +paginationTabInt+"nombre de ligne murs des raccourcis "+nbreEquipementLibreInt);
assertEquals(nbreEquipementLibreInt, paginationTabInt);
assertEquals(nombreRowsTab, paginationTabInt);

}



}
