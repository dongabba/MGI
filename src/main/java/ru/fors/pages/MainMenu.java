package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by azhaleyko on 02.12.2015.
 */
public class MainMenu extends Page{
    public MainMenu(WebDriver driver) {
        super(driver);
    }
    //=======Меню Отчеты=========
    By reportsLink = By.linkText("Отчеты");

    //=======Меню инспекционные========
    By inspReportsPage = By.linkText("Инспекционные");
    By dataOfDocEnteredInMgiReport = By.linkText("Данные по документам, введенным в ЕИС МЖИ");
    By dataOfInspectionActReport = By.linkText("Данные по актам осмотра");
    By dataOfPrescriptionReport = By.linkText("Данные по предписаниям");
    By listFormedDocsByAddressReport = By.linkText("Список оформленных документов по адресу");
    By listCheckActWithoutPrescriptionReport = By.linkText("Список актов, не имеющих предписаний");
    By inspectionActsReport = By.linkText("Данные по актам осмотра и связанным с ними документам, введенным в ЕИС МЖИ за период");
    By checkInspectionActsReport = By.linkText("Данные по актам поверки и связанным с ними документам, введенным в ЕИС МЖИ за период");
    By statisticDataReport = By.linkText("Статистические данные о проведении проверок МЖИ в отношении ЮЛ");
    By instructionsFizReport = By.linkText("Список распоряжений с истекающим сроком проведения проверки");
    By subjectRequirementsReport = By.linkText("Список документов, выданных на субъект предписания");
    By inspectionReferenceReport = By.linkText("Справка по проведению инспекционных проверок жилищного фонда за период (на субъект)");
    By registryRequirementsReport = By.linkText("Реестр предписаний");

    //=======Меню административные========
    By adminReports = By.linkText("Административные");
    By appliedAdministrativeMeasuresReport = By.linkText("Принятые меры административного воздействия за нарушения требований по раскрытию информации УО");
    By implementationOfControlMeasuresReport = By.linkText("Сводная информация о проведенных контрольных мероприятиях");
    By revealedViolationPageReport = By.linkText("Отчет по выявленным нарушениям");
    By unauthorizedRedevelopmentReport = By.linkText("Отчет по несанкционированным перепланировкам");
    By administrativeViolationsReport = By.linkText("Данные по возвратам административных дел");
    By financialSanctionsReport = By.linkText("Отчет по финансовым санкциям");

    //=======По особым объектам========
    By specialObjectsReports = By.linkText("По особым объектам");
    By exposedPrescriptionsReport = By.linkText("Отчет по выставленным предписаниям");
    By specObjectsRptByChecksReport = By.linkText("Отчет по проверкам");
    By specObjectsRptByInspectionActsReport = By.linkText("Отчет по актам осмотра");

    public void userGoToInspReports(){
        click(reportsLink);
        wait.until(ExpectedConditions.visibilityOfElementLocated(inspReportsPage));
        click(inspReportsPage);
    }

    //Данные по документам, введенным в ЕИС МЖИ
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataOfDocEnteredInMgiReport(){
        clickOnLink(reportsLink, inspReportsPage, dataOfDocEnteredInMgiReport);
        return new ReportsPage(driver);
    }
    //Данные по актам осмотра за период
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataOfInspectionActReport() {
        clickOnLink(reportsLink, inspReportsPage, dataOfInspectionActReport);
        return new ReportsPage(driver);
    }
    //Данные по предписаниям за период
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataOfPrescriptionReport() {
        clickOnLink(reportsLink, inspReportsPage, dataOfPrescriptionReport);
        return new ReportsPage(driver);
    }
    //Список оформленных документов по адресу
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToListFormedDocsByAddressReport() {
        clickOnLink(reportsLink, inspReportsPage, listFormedDocsByAddressReport);
        return new ReportsPage(driver);
    }
    //Список актов, не имеющих предписаний
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToListCheckActWithoutPrescriptionReport() {
        clickOnLink(reportsLink, inspReportsPage, listCheckActWithoutPrescriptionReport);
        return new ReportsPage(driver);
    }

    //Данные по актам осмотра и связанным с ними документам, введенным в ЕИС МЖИ за период
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToInspectionActsReport() {
        clickOnLink(reportsLink, inspReportsPage, inspectionActsReport);
        return new ReportsPage(driver);
    }

    //Данные по актам поверки и связанным с ними документам, введенным в ЕИС МЖИ за период
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToCheckInspectionActsReport() {
        clickOnLink(reportsLink, inspReportsPage, checkInspectionActsReport);
        return new ReportsPage(driver);
    }
    //Статистические данные о проведении проверок МЖИ в отношении ЮЛ
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToStatisticDataReport() {
        clickOnLink(reportsLink, inspReportsPage, statisticDataReport);
        return new ReportsPage(driver);
    }
    //Список распоряжений с истекающим сроком проведения проверки
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToInstructionsFizlReport() {
        clickOnLink(reportsLink, inspReportsPage, instructionsFizReport);
        return new ReportsPage(driver);
    }
    //Список документов, выданных на субъект предписания
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToSubjectRequirementsReport() {
        clickOnLink(reportsLink, inspReportsPage, subjectRequirementsReport);
        return new ReportsPage(driver);
    }

    //Справка по проведению инспекционных проверок жилищного фонда за период (на субъект)
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToInspectionReferenceReport() {
        clickOnLink(reportsLink, inspReportsPage, inspectionReferenceReport);
        return new ReportsPage(driver);
    }

    //Реестр предписаний
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToRegistryRequirementsReport() {
        clickOnLink(reportsLink, inspReportsPage, registryRequirementsReport);
        return new ReportsPage(driver);
    }
    //Принятые меры административного воздействия за нарушения требований по раскрытию информации УО
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToAppliedAdministrativeMeasuresReport() {
        clickOnLink(reportsLink, adminReports, appliedAdministrativeMeasuresReport);
        return new ReportsPage(driver);
    }

    //Сводная информация о проведенных контрольных мероприятиях
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToImplementationOfControlMeasuresReport() {
        clickOnLink(reportsLink, adminReports, implementationOfControlMeasuresReport);
        return new ReportsPage(driver);
    }

    //Отчет по выявленным нарушениям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToRevealedViolationPageReport() {
        clickOnLink(reportsLink, adminReports, revealedViolationPageReport);
        return new ReportsPage(driver);
    }

    //Отчет по несанкционированным перепланировкам
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToAdministrativeViolationsReport() {
        clickOnLink(reportsLink, adminReports, administrativeViolationsReport);
        return new ReportsPage(driver);
    }

    //Данные по возвратам административных дел
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToFinancialSanctionsReport() {
        clickOnLink(reportsLink, adminReports, financialSanctionsReport);
        return new ReportsPage(driver);
    }

    //Отчет по финансовым санкциям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToUnauthorizedRedevelopmentReport() {
        clickOnLink(reportsLink, adminReports, unauthorizedRedevelopmentReport);
        return new ReportsPage(driver);
    }

    //Отчет по выставленным предписаниям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToExposedPrescriptionsReport() {
        clickOnLink(reportsLink, specialObjectsReports, exposedPrescriptionsReport);
        return new ReportsPage(driver);
    }

    //Отчет по проверкам
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToSpecObjectsRptByChecksReport() {
        clickOnLink(reportsLink, specialObjectsReports, specObjectsRptByChecksReport);
        return new ReportsPage(driver);
    }

    //Отчет по актам осмотра
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToSpecObjectsRptByInspectionActsReport() {
        clickOnLink(reportsLink, specialObjectsReports, specObjectsRptByInspectionActsReport);
        return new ReportsPage(driver);
    }
}
