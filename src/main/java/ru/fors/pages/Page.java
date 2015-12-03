package ru.fors.pages;

import java.util.concurrent.TimeUnit;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.fors.utils.PropertyLoader;

public class Page {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public Page(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Long.parseLong(PropertyLoader.loadProperty("wait")));
	}
	
	public void type(By element, String string){
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(string);
	}

	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public void click(By element){
		driver.findElement(element).click();
	}
	
	public String getElementText(By element){
		return driver.findElement(element).getText();
	}
	
	public String getUrl(){
		return driver.getCurrentUrl();
	}
	
	public static Boolean isElementPresent(WebDriver driver, By element) {
		try {
			driver.findElement(element);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}
	
	public static Object waitForElementPresent(WebDriver driver, By locator, int timeout) {
		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

			new WebDriverWait(driver, timeout) {
			}.until(ExpectedConditions.presenceOfElementLocated(locator));

			driver.manage().timeouts().implicitlyWait(Long.parseLong(PropertyLoader.loadProperty("imp.wait")), TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Object waitForAjaxIndicatorOff(WebDriver driver, int timeout) {
		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

			new WebDriverWait(driver, timeout) {
			}.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajax-indicator")));

			driver.manage().timeouts().implicitlyWait(Long.parseLong(PropertyLoader.loadProperty("imp.wait")), TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void waitAllAjaxRequest(){
		new WebDriverWait(driver, 30).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return (Boolean) js.executeScript("return window.jQuery != undefined && jQuery.active === 0");
			}

		});
	}
}
