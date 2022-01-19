package com.e2eTests.whereitTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/specs/features" }, plugin = { "pretty", "html:target/cucumber-html-report",
		"json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Whereit.html" }, snippets = SnippetType.CAMELCASE,tags = {("@valid-cnx") }, monochrome = true)

public class TestRunner2 extends AbstractTestNGCucumberTests {

	@Parameters({ "profileName" })
	@BeforeClass
	public void getDevice(String profileName) {
		
		System.out.println(profileName);
		
		try {
			String urlFile = "";
			if (profileName.equals("preprod")) {
				urlFile = "src/test/resources/testData/configFilePreprod.json";
			} else {
				urlFile = "src/test/resources/testData/configFileQualif.json";
			}

			PrintWriter writer = new PrintWriter("src/test/resources/testData/configFile.json");
			writer.print("");
			writer.close();

			FileReader fr = new FileReader(urlFile);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("src/test/resources/testData/configFile.json", true);

			String s;

			while ((s = br.readLine()) != null) {
				fw.write(s);
				fw.flush();
			}

			br.close();
			fw.close();
			System.out.println("configFile copied");

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			PrintWriter writer2 = new PrintWriter("src/test/resources/testData/configFileLocators.json");
			writer2.print("");
			writer2.close();
			String urlFile = "";
			if (profileName.equals("preprod")) {
				urlFile = "src/test/resources/testData/configFileLocatorsPreprod.json";
			} else {
				urlFile = "src/test/resources/testData/configFileLocatorsQualif.json";
			}

			FileReader fr = new FileReader(urlFile);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("src/test/resources/testData/configFileLocators.json", true);

			String s;

			while ((s = br.readLine()) != null) {
				fw.write(s);
				fw.flush();
			}

			br.close();
			fw.close();

			System.out.println("ConfigFileLocators copied");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}
}