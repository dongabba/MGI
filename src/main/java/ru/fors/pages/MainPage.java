package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPage extends MainMenu {

	public MainPage(WebDriver driver) {
		super(driver);
	}
	By userInformationContainer = By.cssSelector(".user-information");
	By userRole = By.cssSelector(".user-information span");
	By logoutLink = By.linkText("Выход");

	public MainPage waitForPageLoaded(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(userInformationContainer));
		return this;
	}

	@Step("Проверяем роль пользователя")
	public String getUserRole(){
		return getElementText(userRole);
	}
	
	@Step("Пользователь выходит из системы")
	public LoginPage userLogOut(){
		click(logoutLink);
		return new LoginPage(driver);
	}

}
