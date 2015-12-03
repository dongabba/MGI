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

    @Features("Отчеты")
    @Stories("Отчет \"Данные по предписаниям за период\"")
    @Test
    public void dataOfDataOfPrescriptionReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataOfPrescriptionReport();
        reportsPage.userBuildDataOfPrescriptionReport(dateFormat.format(date));
        assertTrue(reportsPage.isDataOfPrescriptionReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Список оформленных документов по адресу\"")
    @Test
    public void listFormedDocsByAddressReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToListFormedDocsByAddressReport();
        reportsPage.userBuildListFormedDocsByAddressReport(dateFormat.format(date));
        assertTrue(reportsPage.isListFormedDocsByAddressReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Список актов, не имеющих предписаний\"")
    @Test
    public void listCheckActWithoutPrescriptionReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToListCheckActWithoutPrescriptionReport();
        reportsPage.userBuildListCheckActWithoutPrescriptionReport(dateFormat.format(date));
        assertTrue(reportsPage.isListCheckActWithoutPrescriptionReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по актам осмотра и связанным с ними документам, введенным в ЕИС МЖИ за период\"")
    @Test
    public void inspectionActsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToInspectionActsReport();
        reportsPage.userBuildInspectionActsReport(dateFormat.format(date));
        assertTrue(reportsPage.isInspectionActsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по актам поверки и связанным с ними документам, введенным в ЕИС МЖИ за период\"")
    @Test
    public void checkInspectionActsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToCheckInspectionActsReport();
        reportsPage.userBuildCheckInspectionActsReport(dateFormat.format(date));
        assertTrue(reportsPage.isCheckInspectionActsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Статистические данные о проведении проверок МЖИ в отношении ЮЛ\"")
    @Test
    public void statisticDataReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToStatisticDataReport();
        reportsPage.userBuildStatisticDataReport(dateFormat.format(date));
        assertTrue(reportsPage.isStatisticDataReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Список распоряжений с истекающим сроком проведения проверки\"")
    @Test
    public void instructionsFizReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToInstructionsFizlReport();
        reportsPage.userBuildInstructionsFizReport();
        assertTrue(reportsPage.isInstructionsFizReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Список документов, выданных на субъект предписания\"")
    @Test
    public void subjectRequirementsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToSubjectRequirementsReport();
        reportsPage.userBuildSubjectRequirementsReport(dateFormat.format(date));
        assertTrue(reportsPage.isSubjectRequirementsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Справка по проведению инспекционных проверок жилищного фонда за период (на субъект)\"")
    @Test
    public void inspectionReferenceReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToInspectionReferenceReport();
        reportsPage.userBuildInspectionReferenceReport(dateFormat.format(date));
        assertTrue(reportsPage.isInspectionReferenceReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Реестр предписаний\"")
    @Test
    public void registryRequirementsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToRegistryRequirementsReport();
        reportsPage.userBuildRegistryRequirementsReport(dateFormat.format(date));
        assertTrue(reportsPage.isRegistryRequirementsReportFormed());
    }
}
