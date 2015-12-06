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

	public void clickOnLink(By element, By element1, By element2){
		int count = 0;
		while (count < 5) {
			try {
				click(element);
				wait.until(ExpectedConditions.elementToBeClickable(element1));
				click(element1);
				wait.until(ExpectedConditions.elementToBeClickable(element2));
				click(element2);
				break;
			} catch (Exception e) {
				System.out.println("Count: " + count + " click exception" );
				count = count + 1;
			}
		}
	}
}
