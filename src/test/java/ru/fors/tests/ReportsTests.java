package ru.fors.tests;

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

    @Features("Отчеты")
    @Stories("Отчет \"Данные по документам, введенным в ЕИС МЖИ, за период\"")
    @Test
    @Parameters({"username", "password"})
    public void dataOfDocEnteredInMgiReportTest(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.userLogin(username, password);
        mainPage.waitForPageLoaded();
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataOfDocEnteredInMgiReport();
        reportsPage.userBuildDataOfDocEnteredInMgiReport(dateFormat.format(date));
        Thread.sleep(5000);
        assertTrue(reportsPage.isDataOfDocEnteredInMgiReportFormed());

    }
}
