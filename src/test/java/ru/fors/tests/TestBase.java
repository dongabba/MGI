package ru.fors.tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import ru.fors.pages.LoginPage;
import ru.fors.pages.MainPage;
import ru.fors.utils.Browser;
import ru.fors.utils.PropertyLoader;
import ru.fors.utils.WebDriverFactory;

public class TestBase {
	
	protected static WebDriver driver;

	public String baseUrl;
	public String gridHubUrl;
	public String dir;

	DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY");
	Date date = new Date();
	

	@BeforeTest
	public void init(){
		baseUrl = PropertyLoader.loadProperty("site.url");
		gridHubUrl = PropertyLoader.loadProperty("grid2.hub");
		dir = PropertyLoader.loadProperty("downloadDir");
		Browser browser = new Browser();
		browser.setName(PropertyLoader.loadProperty("browser.name"));
		driver = WebDriverFactory.getInstance(browser, dir, gridHubUrl);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
	
	
	@AfterTest
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public void userLogin(String username, String password){
		LoginPage loginPage = new LoginPage(driver);
		MainPage mainPage = loginPage.userLogin(username, password);
		mainPage.waitForPageLoaded();
	}



	
	public static WebDriver getWebDriver(){
		return driver;
	}

	
	
	

}
