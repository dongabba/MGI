package ru.fors.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.fors.pages.FinControlPage;
import ru.fors.pages.ReportsPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.junit.Assert.assertTrue;

/**
 * Created by Alexander Zhaleyko on 11.12.2015.
 */
public class FinControlTests extends TestBase {
    @BeforeMethod
    @Parameters({"username", "password"})
    public void testStatus(String username, String password){
        System.out.println("This is before method in test");
        if (driver == null){
            init();
            userLogin(username, password);
        } if (driver.getTitle().equals("МЖИ — Вход")){
            userLogin(username, password);
        }
    }

    @Features("Финансовый контроль")
    @Stories("Начисления")
    @Test
    public void profitTest() throws InterruptedException {
        FinControlPage finControlPage = new FinControlPage(driver);
        finControlPage.userGoToProfitPage();
        finControlPage.waitForProfitPageLoaded();
        finControlPage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", finControlPage.isProfitPageFormed());
    }

    @Features("Финансовый контроль")
    @Stories("Платежи")
    @Test
    public void paymentsTest() throws InterruptedException {
        FinControlPage finControlPage = new FinControlPage(driver);
        finControlPage.userGoToPaymentsPage();
        finControlPage.waitForPaymentsPageLoaded();
        finControlPage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", finControlPage.isPaymentsPageFormed());
    }

    @Features("Финансовый контроль")
    @Stories("Заявки на возврат")
    @Test
    public void applicationsForRefundTest() throws InterruptedException {
        FinControlPage finControlPage = new FinControlPage(driver);
        finControlPage.userGoToApplicationsForRefundPage();
        finControlPage.waitForApplicationsForRefundPageLoaded();
        finControlPage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", finControlPage.isApplicationsForRefundPageFormed());
    }

    @Features("Финансовый контроль")
    @Stories("Связывание начислений и платежей")
    @Test
    public void profitAndPaymentsTest() throws InterruptedException {
        FinControlPage finControlPage = new FinControlPage(driver);
        finControlPage.userGoToProfitAndPaymentsPage();
        finControlPage.waitForProfitAndPaymentsPageLoaded();
        finControlPage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", finControlPage.isProfitAndPaymentsPageFormed());
    }

    @Features("Финансовый контроль")
    @Stories("Финансовые показатели")
    @Test
    public void financeTest() throws InterruptedException {
        FinControlPage finControlPage = new FinControlPage(driver);
        finControlPage.userGoToFinancePage();
        finControlPage.waitForFinancePageLoaded();
        finControlPage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", finControlPage.isFinancePageFormed());
    }
}
