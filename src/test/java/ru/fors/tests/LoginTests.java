package ru.fors.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ru.fors.pages.LoginPage;
import ru.fors.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import static org.junit.Assert.*;


public class LoginTests extends TestBase {
	
	
	
	@Features("Авторизация в системе")
	@Stories("Вход/Выход из системы")
	@Test
	@Parameters({"username", "password", "role"})
	public void userLogin(String username, String password, String role){
		LoginPage loginPage = new LoginPage(driver);
		MainPage mainPage = loginPage.userLogin(username, password);
		mainPage.waitForPageLoaded();
		assertTrue("Не совпадают роли пользователей", mainPage.getUserRole().contains(role));
		loginPage = mainPage.userLogOut();
		loginPage.waitForPageLoaded();
		assertTrue("Не произведен выход на страницу авторизации", loginPage.getPageTitle().contains("Вход"));
	}
	

}
