package ru.fors.tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import ru.fors.utils.Browser;
import ru.fors.utils.PropertyLoader;
import ru.fors.utils.WebDriverFactory;

public class TestBase {
	
	protected static WebDriver driver;
	public String baseUrl;

	DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY");
	Date date = new Date();
	

	@BeforeTest
	public void init(){
		System.out.println("This is before test INIT method");
		baseUrl = PropertyLoader.loadProperty("site.url");
		Browser browser = new Browser();
		browser.setName(PropertyLoader.loadProperty("browser.name"));
		driver = WebDriverFactory.getInstance(browser);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
	
	
	@AfterTest
	public static void tearDown() {
		if (driver != null) {
			System.out.println("This is after test method");
			driver.quit();
			driver = null;
		}
	}

	
	public static WebDriver getWebDriver(){
		return driver;
	}

	
	
	

}
