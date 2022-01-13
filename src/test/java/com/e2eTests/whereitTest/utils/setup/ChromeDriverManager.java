package com.e2eTests.whereitTest.utils.setup;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    @Override
    public void startService() {
        if (null == chService) {
            try {
                chService = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File("src/test/resources/drivers/chromedriver.exe"))
                    .usingAnyFreePort()
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
    	    String path ;
         path = System.getProperty("user.dir")  + "\\downloadedFiles";

          ChromeOptions options = new ChromeOptions();
          HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
          chromePrefs.put("profile.default_content_settings.popups", 0);
          chromePrefs.put("download.default_directory", path);
          options.setExperimentalOption("prefs", chromePrefs);
       
          //options.addArguments("headless");
         //options.addArguments("test-type");
        //options.addArguments("--disable-extensions=true");
         //options.addArguments("--disable-notifications");
          capabilities.setCapability(ChromeOptions.CAPABILITY, options);
          driver = new ChromeDriver(chService, capabilities);
          driver.manage().window().maximize();
    }
}
