package ru.fors.pages;

import java.util.concurrent.TimeUnit;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import org.openqa.selenium.*;
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
	public void clickOnLink(By element, By element1, By element2){
		int count = 0;
		while (count < 5){
			try{
				click(element);
				wait.until(ExpectedConditions.elementToBeClickable(element1));
				click(element1);
				wait.until(ExpectedConditions.elementToBeClickable(element2));
				click(element2);
			} catch (StaleElementReferenceException e){
				System.out.println("Trying to recover from a stale element");
				count = count+1;
			}catch (NoSuchElementException ex){
				System.out.println("Trying to recover from a no such element");
				count = count+1;
			}
			count=count+5;
		}
	}
}
