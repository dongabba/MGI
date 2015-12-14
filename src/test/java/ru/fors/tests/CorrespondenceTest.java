package ru.fors.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.fors.pages.CorrespondencePage;
import ru.fors.pages.FinControlPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.junit.Assert.assertTrue;

/**
 * Created by Alexander Zhaleyko on 11.12.2015.
 */
public class CorrespondenceTest extends TestBase {

    @BeforeMethod
    @Parameters({"username", "password"})
    public void testStatus(String username, String password){
        if (driver == null){
            init();
            userLogin(username, password);
        } if (driver.getTitle().equals("МЖИ — Вход")){
            userLogin(username, password);
        }
    }

    @Features("Корреспонденция")
    @Stories("Реестры исходящей корреспонденции")
    @Test
    public void sentCorrespondenceTest() throws InterruptedException {
        CorrespondencePage correspondencePage = new CorrespondencePage(driver);
        correspondencePage.userGoToSentCorrespondencePage();
        correspondencePage.waitForSentCorrespondencePageLoaded();
        correspondencePage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", correspondencePage.isSentCorrespondencePageFormed());
    }

    @Features("Корреспонденция")
    @Stories("Вручение документов")
    @Test
    public void deliveryDocsTest() throws InterruptedException {
        CorrespondencePage correspondencePage = new CorrespondencePage(driver);
        correspondencePage.userGoToDeliveryDocsPage();
        correspondencePage.waitForDeliveryDocsPageLoaded();
        correspondencePage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", correspondencePage.isDeliveryDocsPageFormed());
    }

    @Features("Корреспонденция")
    @Stories("Регистрация уведомлений")
    @Test
    public void registerNotificationsTest() throws InterruptedException {
        CorrespondencePage correspondencePage = new CorrespondencePage(driver);
        correspondencePage.userGoToRegisterNotificationsPage();
        correspondencePage.waitForRegisterNotificationsPageLoaded();
        correspondencePage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", correspondencePage.isRegisterNotificationsPageFormed());
    }
}
