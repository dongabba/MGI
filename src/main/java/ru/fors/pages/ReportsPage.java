package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

/**
 * Created by Alexander Zhaleyko on 02.12.2015.
 */
public class ReportsPage extends MainMenu {

    public ReportsPage(WebDriver driver) {
        super(driver);
    }
    By dateFromField = By.cssSelector("input[name*='from:date']");
    By dateToField = By.cssSelector("input[name*='to:date']");
    By buildButton = By.cssSelector("button[class*=\"form-btn_position_left\"]");
    By dataOfDocEnteredInMgiReportTitle = By.xpath("//h3[text()='Данные по документам, введенным в ЕИС МЖИ, за период']");
    By dataOfInspectionActReportTitle = By.xpath("//h3[text()='Данные по актам осмотра за период']");
    By dataOfPrescriptionReportTitle = By.xpath("//h3[text()='Данные по предписаниям за период']");
    By listFormedDocsByAddressReportTitle = By.xpath("//h3[text()='Список оформленных документов по адресу']");
    By listCheckActWithoutPrescriptionReportTitle = By.xpath("//h3[text()='Список актов, не имеющих предписаний']");
    By inspectionActsReportTitle = By.xpath("//h3[text()='Данные по актам осмотра и связанным с ними документам, введенным в ЕИС МЖИ за период']");
    By checkInspectionActsReportTitle = By.xpath("//h3[text()='Данные по актам поверки и связанным с ними документам, введенным в ЕИС МЖИ за период']");
    By statisticDataReportTitle = By.xpath("//h3[text()='Статистические данные о проведении проверок МЖИ в отношении ЮЛ']");
    By instructionsFizReportTitle = By.xpath("//h3[text()='Список распоряжений с истекающим сроком проведения проверки']");
    By subjectRequirementsReportTitle = By.xpath("//h3[text()='Список документов, выданных на субъект предписания']");
    By inspectionReferenceReportTitle = By.xpath("//h3[text()='Справка по проведению инспекционных проверок жилищного фонда за период (на субъект)']");
    By registryRequirementsReportTitle = By.xpath("//h3[text()='Реестр предписаний']");
    By orgNameSelectLocator = By.cssSelector("div[class*=\"select2-container\"]");
    By orgNameInputFieldLocator = By.cssSelector("input[class*='select2-focused']");

    public ReportsPage waitForReportLoaded(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return this;
    }
    @Step("Устанавливаем дату с")
    public void userSetDataFrom(String date){
        type(dateFromField, date);
    }
    @Step("Устанавливаем дату по")
    public void userSetDataTo(String date){
        type(dateToField, date);
    }
    @Step("Строим отчет")
    public void userBuildReport(){
        click(buildButton);
    }

    public void userBuildDataOfDocEnteredInMgiReport(String date) throws InterruptedException {
        waitForReportLoaded(dataOfDocEnteredInMgiReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildDataOfInspectionActReport(String date) throws InterruptedException {
        waitForReportLoaded(dataOfInspectionActReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildDataOfPrescriptionReport(String date) throws InterruptedException {
        waitForReportLoaded(dataOfPrescriptionReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildListFormedDocsByAddressReport(String date) throws InterruptedException {
        waitForReportLoaded(listFormedDocsByAddressReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(30000);
    }

    public void userBuildListCheckActWithoutPrescriptionReport(String date) throws InterruptedException {
        waitForReportLoaded(listCheckActWithoutPrescriptionReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildInspectionActsReport(String date) throws InterruptedException {
        waitForReportLoaded(inspectionActsReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildCheckInspectionActsReport(String date) throws InterruptedException {
        waitForReportLoaded(checkInspectionActsReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildStatisticDataReport(String date) throws InterruptedException {
        waitForReportLoaded(statisticDataReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildInstructionsFizReport() throws InterruptedException {
        waitForReportLoaded(instructionsFizReportTitle);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildSubjectRequirementsReport(String date) throws InterruptedException {
        waitForReportLoaded(subjectRequirementsReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userSetOrganization("Государственная жилищная инспекция города Москвы");
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildInspectionReferenceReport(String date) throws InterruptedException {
        waitForReportLoaded(inspectionReferenceReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userSetOrganization("Государственная жилищная инспекция города Москвы");
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(sleep);
    }

    public void userBuildRegistryRequirementsReport(String date) throws InterruptedException {
        waitForReportLoaded(registryRequirementsReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
        //waitAllAjaxRequest();
        //Thread.sleep(40000);
    }

    private void userSetOrganization(String orgName) {
        click(orgNameSelectLocator);
        wait.until(presenceOfElementLocated(By.cssSelector("input[class*='select2-focused']")));
        type(orgNameInputFieldLocator, orgName);
        wait.until(textToBePresentInElementLocated(By.className("select2-match"), orgName));
        driver.findElement(orgNameInputFieldLocator).sendKeys(Keys.ENTER);
    }



    public boolean isReportFormed(String reportName) throws InterruptedException {
        File file = new File("C:\\mgi_reports\\");
        int count=0;
        for (int time = 0; time<118; time++) {
            File [] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                File f1 = files[i];
                if (f1.getName().startsWith(reportName)) {
                    f1.delete();
                    count++;
                    break;
                }
            }
            Thread.sleep(500);
            if (count>0)break;
        }
        if (count>0){
            return true;

        }else{
            return false;
        }
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isDataOfDocEnteredInMgiReportFormed()throws InterruptedException {
        return isReportFormed("dataOfDocEnteredInMg");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isDataOfInspectionActReportFormed()throws InterruptedException {
        return isReportFormed("dataOfInspectionAct");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isDataOfPrescriptionReportFormed()throws InterruptedException {
        return isReportFormed("dataOfPrescription");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isListFormedDocsByAddressReportFormed()throws InterruptedException {
        return isReportFormed("listFormedDocsByAddress");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isListCheckActWithoutPrescriptionReportFormed()throws InterruptedException {
        return isReportFormed("listCheckActWithoutPrescription");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isInspectionActsReportFormed()throws InterruptedException {
        return isReportFormed("inspectionActs_9");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isCheckInspectionActsReportFormed()throws InterruptedException {
        return isReportFormed("inspectionActs_10");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isStatisticDataReportFormed()throws InterruptedException {
        return isReportFormed("statisticData");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isInstructionsFizReportFormed()throws InterruptedException {
        return isReportFormed("instructions_13");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isSubjectRequirementsReportFormed()throws InterruptedException {
        return isReportFormed("subjectRequirements");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isInspectionReferenceReportFormed()throws InterruptedException {
        return isReportFormed("inspectionReference");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isRegistryRequirementsReportFormed()throws InterruptedException {
        return isReportFormed("registryRequirements");
    }

}
