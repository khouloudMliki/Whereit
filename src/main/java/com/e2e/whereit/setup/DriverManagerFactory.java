package com.e2e.whereit.setup;

import com.e2e.whereit.browser.ChromeDriverManager;
import com.e2e.whereit.browser.DriverManager;
import com.e2e.whereit.browser.EdgeDriverManager;
import com.e2e.whereit.browser.FirefoxDriverManager;
import com.e2e.whereit.browser.IeDriverManager;
import com.e2e.whereit.utils.DriverType;

public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager;
		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		case IE:
			driverManager = new IeDriverManager();
			break;
		default:
			driverManager = new EdgeDriverManager();
			break;
		}
		return driverManager;

	}
}