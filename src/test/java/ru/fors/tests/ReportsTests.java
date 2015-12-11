package ru.fors.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.fors.pages.LoginPage;
import ru.fors.pages.MainPage;
import ru.fors.pages.ReportsPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import java.io.File;

import static org.junit.Assert.assertTrue;

/**
 * Created by azhaleyko on 02.12.2015.
 */
public class ReportsTests extends TestBase{



    @BeforeClass
    public void cleanWorkingDirectory(){
        System.out.println("This is before class method");
        File file = new File("C:\\mgi_reports\\");
        File [] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                File f1 = files[i];
                    f1.delete();
            }
    }

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

    @Features("Отчеты")
    @Stories("Отчет \"Данные по документам, введенным в ЕИС МЖИ, за период\"")
    @Test
    public void dataOfDocEnteredInMgiReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataOfDocEnteredInMgiReport();
        reportsPage.userBuildDataOfDocEnteredInMgiReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isDataOfDocEnteredInMgiReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по актам осмотра за период\"")
    @Test
    public void dataOfInspectionActReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataOfInspectionActReport();
        reportsPage.userBuildDataOfInspectionActReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isDataOfInspectionActReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по предписаниям за период\"")
    @Test
    public void dataOfDataOfPrescriptionReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataOfPrescriptionReport();
        reportsPage.userBuildDataOfPrescriptionReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isDataOfPrescriptionReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Список оформленных документов по адресу\"")
    @Test
    public void listFormedDocsByAddressReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToListFormedDocsByAddressReport();
        reportsPage.userBuildListFormedDocsByAddressReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isListFormedDocsByAddressReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Список актов, не имеющих предписаний\"")
    @Test
    public void listCheckActWithoutPrescriptionReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToListCheckActWithoutPrescriptionReport();
        reportsPage.userBuildListCheckActWithoutPrescriptionReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isListCheckActWithoutPrescriptionReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по актам осмотра и связанным с ними документам, введенным в ЕИС МЖИ за период\"")
    @Test
    public void inspectionActsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToInspectionActsReport();
        reportsPage.userBuildInspectionActsReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isInspectionActsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по актам поверки и связанным с ними документам, введенным в ЕИС МЖИ за период\"")
    @Test
    public void checkInspectionActsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToCheckInspectionActsReport();
        reportsPage.userBuildCheckInspectionActsReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isCheckInspectionActsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Статистические данные о проведении проверок МЖИ в отношении ЮЛ\"")
    @Test
    public void statisticDataReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToStatisticDataReport();
        reportsPage.userBuildStatisticDataReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isStatisticDataReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Список распоряжений с истекающим сроком проведения проверки\"")
    @Test
    public void instructionsFizReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToInstructionsFizlReport();
        reportsPage.userBuildInstructionsFizReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isInstructionsFizReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Список документов, выданных на субъект предписания\"")
    @Test
    public void subjectRequirementsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToSubjectRequirementsReport();
        reportsPage.userBuildSubjectRequirementsReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isSubjectRequirementsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Справка по проведению инспекционных проверок жилищного фонда за период (на субъект)\"")
    @Test
    public void inspectionReferenceReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToInspectionReferenceReport();
        reportsPage.userBuildInspectionReferenceReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isInspectionReferenceReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Реестр предписаний\"")
    @Test
    public void registryRequirementsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToRegistryRequirementsReport();
        reportsPage.userBuildRegistryRequirementsReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isRegistryRequirementsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Принятые меры административного воздействия за нарушения требований по раскрытию информации УО\"")
    @Test
    public void appliedAdministrativeMeasuresReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToAppliedAdministrativeMeasuresReport();
        reportsPage.userBuildAppliedAdministrativeMeasuresReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isAppliedAdministrativeMeasuresReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Сводная информация о проведенных контрольных мероприятиях\"")
    @Test
    public void implementationOfControlMeasuresReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToImplementationOfControlMeasuresReport();
        reportsPage.userBuildImplementationOfControlMeasuresReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isImplementationOfControlMeasuresReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по выявленным нарушениям\"")
    @Test
    public void revealedViolationPageReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToRevealedViolationPageReport();
        reportsPage.userBuildRevealedViolationPageReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isRevealedViolationPageReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по несанкционированным перепланировкам\"")
    @Test
    public void unauthorizedRedevelopmentReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToUnauthorizedRedevelopmentReport();
        reportsPage.userBuildUnauthorizedRedevelopmentReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isUnauthorizedRedevelopmentReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по выставленным предписаниям\"")
    @Test
    public void exposedPrescriptionsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToExposedPrescriptionsReport();
        reportsPage.userBuildExposedPrescriptionsReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isExposedPrescriptionsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по проверкам\"")
    @Test
    public void specObjectsRptByChecksReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToSpecObjectsRptByChecksReport();
        reportsPage.userBuildSpecObjectsRptByChecksReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isSpecObjectsRptByChecksReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по актам осмотра\"")
    @Test
    public void specObjectsRptByInspectionActsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToSpecObjectsRptByInspectionActsReport();
        reportsPage.userBuildSpecObjectsRptByInspectionActsReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isSpecObjectsRptByInspectionActsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по возвратам административных дел\"")
    @Test
    public void administrativeViolationsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToAdministrativeViolationsReport();
        reportsPage.userBuildAdministrativeViolationsReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isAdministrativeViolationsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по финансовым санкциям\"")
    @Test
    public void financialSanctionsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToFinancialSanctionsReport();
        reportsPage.userBuildFinancialSanctionsReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isFinancialSanctionsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Выполнение плана проведения плановых проверок\"")
    @Test
    public void planOfScheduledInspectionsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToPlanOfScheduledInspectionsReport();
        reportsPage.userBuildPlanOfScheduledInspectionsReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isPlanOfScheduledInspectionsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по внеплановым проверкам\"")
    @Test
    public void dataForNonRoutineInspectionsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataForNonRoutineInspectionsReport();
        reportsPage.userBuildDataForNonRoutineInspectionsReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isDataForNonRoutineInspectionsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Данные по плановым проверкам\"")
    @Test
    public void dataForPlannedInspectionsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataForPlannedInspectionsReport();
        reportsPage.userBuildDataForPlannedInspectionsReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isDataForPlannedInspectionsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по обращениям подразделений в прокуратуру для согласования проведения внеплановых проверок ЮЛ\"")
    @Test
    public void appealsToTheProsecutorReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToAppealsToTheProsecutorReport();
        reportsPage.userBuildAppealsToTheProsecutorReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isAppealsToTheProsecutorReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Сведения о работе Государственной жилищной инспекции города Москвы\"")
    @Test
    public void dataGZHIWorkReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataGZHIWorkReport();
        reportsPage.userBuildDataGZHIWorkReport(dateFormat.format(date));
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isDataGZHIWorkReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Сведения об осуществлении государственного контроля (надзора) и муниципального контроля\"")
    @Test
    public void dataGosControlReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToDataGosControlReport();
        reportsPage.userBuildDataGosControlReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isDataGosControlReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Дела, переданные на рассмотрение по подведомственности\"")
    @Test
    public void casesRefferedForConsiderationReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToCasesRefferedForConsiderationReport();
        reportsPage.userBuildCasesRefferedForConsiderationReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isCasesRefferedForConsiderationReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по неврученным постановлениям\"")
    @Test
    public void nonDeliveryResolutionsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToNonDeliveryResolutionsReport();
        reportsPage.userBuildNonDeliveryResolutionsReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isNonDeliveryResolutionsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по неоплаченным постановлениям\"")
    @Test
    public void unPaidResolutionsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToUnPaidResolutionsReport();
        reportsPage.userBuildUnPaidResolutionsReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isUnPaidResolutionsReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по количеству проверенных дел\"")
    @Test
    public void numberOfVerifiedCasesReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToNumberOfVerifiedCasesReport();
        reportsPage.userBuildNumberOfVerifiedCasesReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isNumberOfVerifiedCasesReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Дела на проверке в ОАП\"")
    @Test
    public void casesPendingVerificationOAPReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToCasesPendingVerificationOAPReport();
        reportsPage.userBuildCasesPendingVerificationOAPReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isCasesPendingVerificationOAPReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Протоколы, составленные по статьям\"")
    @Test
    public void protocolsCreatedByArticlesReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToProtocolsCreatedByArticlesReport();
        reportsPage.userBuildProtocolsCreatedByArticlesReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isProtocolsCreatedByArticlesReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по работе с ССП. Сводный\"")
    @Test
    public void onSSPWorkConsolidPageReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToOnSSPWorkConsolidPageReportReport();
        reportsPage.userBuildOnSSPWorkConsolidPageReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isOnSSPWorkConsolidPageReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по работе с ССП. Детализированный\"")
    @Test
    public void onSSPWorkDetailedPageReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToOnSSPWorkDetailedPageReport();
        reportsPage.userBuildOnSSPWorkDetailedPageReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isOnSSPWorkDetailedPageReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Сведения о просроченной дебиторской задолженности по административным штрафам\"")
    @Test
    public void administrativePenaltiesReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToAdministrativePenaltiesReport();
        reportsPage.userBuildAdministrativePenaltiesReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isAdministrativePenaltiesReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Отчет по обжалованиям\"")
    @Test
    public void reportOfAppealReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToReportOfAppealReport();
        reportsPage.userBuildReportOfAppealReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isReportOfAppealReportFormed());
    }

    @Features("Отчеты")
    @Stories("Отчет \"Протоколы и постановления  по подразделениям МЖИ\"")
    @Test
    public void protocolsAndResolutionsReportTest() throws InterruptedException {
        ReportsPage reportsPage = new ReportsPage(driver);
        reportsPage.userGoToProtocolsAndResolutionsReport();
        reportsPage.userBuildProtocolsAndResolutionsReport();
        assertTrue("Файл с отчетом не сформировался за 1 минуту", reportsPage.isProtocolsAndResolutionsReportFormed());
    }
}
