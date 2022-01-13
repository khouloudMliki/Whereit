package com.e2eTests.whereitTest;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/specs/features" },
		// glue = {""},
		plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Whereit.html" }, snippets = SnippetType.CAMELCASE, tags = {
						("@MursDesRaccourcis") }, monochrome = true)

public class testRunner {

	@AfterClass
	public static void writeExtentReport() {
	   Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}
	
}
