package ru.fors.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.fors.pages.LoginPage;
import ru.fors.pages.MainPage;
import ru.fors.pages.ReportsPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.junit.Assert.assertTrue;

/**
 * Created by azhaleyko on 02.12.2015.
 */
public class ReportsTests extends TestBase{

    public void userLogin(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.userLogin(username, password);
        mainPage.waitForPageLoaded();
    }

    @BeforeMethod
    @Parameters({"username", "password"})
    public void testStatus(String username, String password){
        System.out.println("This is before method in test");
        if (driver == null){
            init();
            System.out.println("null" + driver.getCurrentUrl());
            userLogin(username, password);
        } if (driver.getTitle().equals("МЖИ — Вход")){
            userLogin(username, password);
        }
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по документам, введенным в ЕИС МЖИ, за период\"")
    @Test
    public void dataOfDocEnteredInMgiReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataOfDocEnteredInMgiReport();
        reportsPage.userBuildDataOfDocEnteredInMgiReport(dateFormat.format(date));
        assertTrue(reportsPage.isDataOfDocEnteredInMgiReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по актам осмотра за период\"")
    @Test
    public void dataOfInspectionActReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataOfInspectionActReport();
        reportsPage.userBuildDataOfInspectionActReport(dateFormat.format(date));
        assertTrue(reportsPage.isDataOfInspectionActReportFormed());
    }
}
