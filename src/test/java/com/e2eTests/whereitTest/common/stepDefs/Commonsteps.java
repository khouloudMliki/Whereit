package com.e2eTests.whereitTest.common.stepDefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.whereitTest.common.pages.CommonPage;
import com.e2eTests.whereitTest.utils.setup.CommonMethods;
import com.e2eTests.whereitTest.utils.setup.Setup;

import cucumber.api.java.en.*;

public class Commonsteps extends CommonMethods {
	
	public WebDriver driver;
	private CommonMethods commonMethods = new CommonMethods();
	private CommonPage commonPage = new CommonPage();
	
	public Commonsteps() {
		driver = Setup.driver;
		PageFactory.initElements(driver, CommonPage.class);
	}
	
	@Given("^Je suis sur la page \"([^\"]*)\"$")
	public void jeSuisSurLaPage(String expectedNamePage) throws Throwable {
		Thread.sleep(2000);
		String actualNamePage = commonMethods.readText(commonPage.namPage);
		assertEquals(expectedNamePage, actualNamePage);
		Thread.sleep(3000);

	}

	@When("^Je clique sur le bouton recherche personnalisee$")
	public void jeCliqueSurLeBoutonRechercher() throws Throwable {
		commonMethods.clickElementWithJavascriptExecutor(commonPage.btnPSearch);
		Thread.sleep(400);  
	}
	


}


