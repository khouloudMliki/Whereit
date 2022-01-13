package com.e2e.whereit.browser;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void startService() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
	}

	@Override
	protected void stopService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		FirefoxOptions opts = new FirefoxOptions();
		opts.addArguments("--headless");
		opts.addArguments("--no-sandbox");
	}

}