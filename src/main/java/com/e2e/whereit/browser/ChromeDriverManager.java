package com.e2e.whereit.browser;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {

	private ChromeDriverService chService;
	
	private static final String FOLDER_TO_DRIVER = "src/main/resources/drivers/windows/chromedriver.exe";

	@Override
	public void startService() {
		if (null == chService) {
			try {
				chService = new ChromeDriverService.Builder()
						.usingDriverExecutable(new File(FOLDER_TO_DRIVER)).usingAnyFreePort()
						.build();
				chService.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void stopService() {
		if (null != chService && chService.isRunning())
			chService.stop();
	}

	@Override
	public void createDriver() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("test-type");
		// options.addArguments("--disable-extensions=true");
		// options.addArguments("--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(chService, capabilities);
		driver.manage().window().maximize();
	}

}
