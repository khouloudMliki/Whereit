package com.e2e.whereit.browser;

public class IeDriverManager extends DriverManager {

	@Override
	protected void startService() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","src/test/resources/BrowserDriver/IEDriverServer.exe");

	}

	@Override
	protected void stopService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
		// TODO Auto-generated method stub

		//driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}

}