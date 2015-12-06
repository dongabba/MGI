package ru.fors.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class WebDriverFactory {
	
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String INTERNET_EXPLORER = "ie";
	
	public static WebDriver getInstance(Browser browser) {

        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setJavascriptEnabled(true);
        WebDriver webDriver = null;
        if (webDriver != null) {
            return webDriver;
        }
		String browserName = browser.getName();
		
		if (CHROME.equals(browserName)) {
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", "C:\\mgi_reports\\");
			prefs.put("download.prompt_for_dowload", false);
			options.addArguments("start-maximized");
			options.setExperimentalOption("prefs", prefs);
			capability = DesiredCapabilities.chrome();
			capability.setCapability(ChromeOptions.CAPABILITY, options);
			webDriver = new ChromeDriver(capability);


		} else if (FIREFOX.equals(browserName)) {
			ProfilesIni profiles = new ProfilesIni();
			FirefoxProfile mgiProfile = profiles.getProfile("mgi");
			webDriver = new FirefoxDriver(mgiProfile);

		} else if (INTERNET_EXPLORER.equals(browserName)) {
			webDriver = new InternetExplorerDriver();

		} return webDriver;
	}

}
