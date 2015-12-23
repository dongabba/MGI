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
	protected WebDriverWait wait1;

	public Page(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Long.parseLong(PropertyLoader.loadProperty("wait")));
		wait1 = new WebDriverWait(driver, 5);
	}
	
	public void type(By element, String string){
		wait1.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(string);
	}

	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public void click(By element){
		wait1.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(element).click();
	}

	public void clickMenu(By element){
		driver.findElement(element).click();
	}
	
	public String getElementText(By element){
		return driver.findElement(element).getText();
	}
	
	public String getUrl(){
		return driver.getCurrentUrl();
	}

	public void clickOn3Link(By element, By element1, By element2){
		int count = 0;
		while (count < 5) {
			try {
				clickMenu(element);
				wait1.until(ExpectedConditions.elementToBeClickable(element1));
				clickMenu(element1);
				wait1.until(ExpectedConditions.elementToBeClickable(element2));
				clickMenu(element2);
				break;
			} catch (Exception e) {
				System.out.println("Count: " + count + " click exception" );
				count = count + 1;
			}
		}
	}

	public void clickOn2Link(By element, By element1){
		int count = 0;
		while (count < 5) {
			try {
				clickMenu(element);
				wait1.until(ExpectedConditions.elementToBeClickable(element1));
				clickMenu(element1);
				break;
			} catch (Exception e) {
				System.out.println("Count: " + count + " click exception" );
				count = count + 1;
			}
		}
	}
}
