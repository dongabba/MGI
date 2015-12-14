package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    By appliedAdministrativeMeasuresReportTitile = By.xpath("//h3[text()='Принятые меры административного воздействия за нарушения требований по раскрытию информации УО']");
    By implementationOfControlMeasuresReportTitle = By.xpath("//h3[text()='Сводная информация о проведенных контрольных мероприятиях']");
    By revealedViolationPageReportTitle = By.xpath("//h3[text()='Отчет по выявленным нарушениям']");
    By unauthorRemodelingReportTitle = By.xpath("//h3[text()='Отчет по несанкционированным перепланировкам']");
    By administrativeViolationsReportTitle = By.xpath("//h3[text()='Данные по возвратам административных дел']");
    By financialSanctionsReportTitle = By.xpath("//h3[text()='Отчет по финансовым санкциям']");
    By exposedPrescriptionsReportTitle = By.xpath("//h3[text()='Отчет по выставленным предписаниям']");
    By specObjectsRptByChecksReportTitle = By.xpath("//h3[text()='Отчет по проверкам']");
    By specObjectsRptByInspectionActsReportTitle = By.xpath("//h3[text()='Отчет по актам осмотра']");
    By planOfScheduledInspectionsReportTitle = By.xpath("//h3[text()='Выполнение плана проведения плановых проверок']");
    By dataForNonRoutineInspectionsReportTitle = By.xpath("//h3[text()='Данные по внеплановым проверкам']");
    By dataForPlannedInspectionsReportTitle = By.xpath("//h3[text()='Данные по плановым проверкам']");
    By appealsToTheProsecutorReportTitle = By.xpath("//h3[text()='Отчет по обращениям подразделений в прокуратуру для согласования проведения внеплановых проверок ЮЛ']");
    By dataGZHIWorkReportTitle = By.xpath("//h3[text()='Сведения о работе Государственной жилищной инспекции города Москвы']");
    By dataGosControlReportTitle = By.xpath("//h3[text()='Сведения об осуществлении государственного контроля (надзора) и муниципального контроля']");
    By casesRefferedForConsiderationReportTitle = By.xpath("//h3[text()='Дела, переданные на рассмотрение по подведомственности']");
    By nonDeliveryResolutionsReportTitle = By.xpath("//h3[text()='Дела об административных правонарушениях, постановления по которым не вручены']");
    By unPaidResolutionsReportTitle = By.xpath("//h3[text()='Отчет по неоплаченным постановлениям']");
    By numberOfVerifiedCasesReportTitle = By.xpath("//h3[text()='Дела, проверенные в ОАП за указанный период']");
    By casesPendingVerificationOAPReportTitle = By.xpath("//h3[text()='Дела на проверке в ОАП']");
    By protocolsCreatedByArticlesReportTitle = By.xpath("//h3[text()='Протоколы, составленные по статьям']");
    By onSSPWorkConsolidPageReportTitle = By.xpath("//h3[text()='Отчет по работе с ССП. Сводный']");
    By onSSPWorkDetailedPageReportTitle = By.xpath("//h3[text()='Отчет по работе с ССП. Детализированный']");
    By administrativePenaltiesReportTitle = By.xpath("//h3[text()='Сведения о просроченной дебиторской задолженности по административным штрафам']");
    By reportOfAppealReportTitle = By.xpath("//h3[text()='Отчет по обжалованиям']");
    By protocolsAndResolutionsReportTitle = By.xpath("//h3[text()='Протоколы и постановления  по подразделениям МЖИ']");

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

    public void userBuildAppliedAdministrativeMeasuresReport() throws InterruptedException {
        waitForReportLoaded(appliedAdministrativeMeasuresReportTitile);
        userBuildReport();
    }

    public void userBuildImplementationOfControlMeasuresReport() throws InterruptedException {
        waitForReportLoaded(implementationOfControlMeasuresReportTitle);
        userBuildReport();
    }

    public void userBuildRevealedViolationPageReport(String date) throws InterruptedException {
        waitForReportLoaded(revealedViolationPageReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
    }

    public void userBuildUnauthorizedRedevelopmentReport(String date) throws InterruptedException {
        waitForReportLoaded(unauthorRemodelingReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
    }

    public void userBuildExposedPrescriptionsReport() throws InterruptedException {
        waitForReportLoaded(exposedPrescriptionsReportTitle);
        userBuildReport();
    }

    public void userBuildSpecObjectsRptByChecksReport() throws InterruptedException {
        waitForReportLoaded(specObjectsRptByChecksReportTitle);
        userBuildReport();
    }


    public void userBuildSpecObjectsRptByInspectionActsReport() throws InterruptedException {
        waitForReportLoaded(specObjectsRptByInspectionActsReportTitle);
        userBuildReport();
    }

    public void userBuildAdministrativeViolationsReport() throws InterruptedException {
        waitForReportLoaded(administrativeViolationsReportTitle);
        userBuildReport();
    }

    public void userBuildFinancialSanctionsReport() throws InterruptedException {
        waitForReportLoaded(financialSanctionsReportTitle);
        userBuildReport();
    }

    public void userBuildPlanOfScheduledInspectionsReport(String date) throws InterruptedException {
        waitForReportLoaded(planOfScheduledInspectionsReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
    }

    public void userBuildDataForNonRoutineInspectionsReport(String date) throws InterruptedException {
        waitForReportLoaded(dataForNonRoutineInspectionsReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
    }
    public void userBuildDataForPlannedInspectionsReport(String date) throws InterruptedException {
        waitForReportLoaded(dataForPlannedInspectionsReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
    }

    public void userBuildAppealsToTheProsecutorReport(String date) throws InterruptedException {
        waitForReportLoaded(appealsToTheProsecutorReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
    }

    public void userBuildDataGZHIWorkReport(String date) throws InterruptedException {
        waitForReportLoaded(dataGZHIWorkReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
    }

    public void userBuildDataGosControlReport() throws InterruptedException {
        waitForReportLoaded(dataGosControlReportTitle);
        userBuildReport();
    }

    public void userBuildCasesRefferedForConsiderationReport() throws InterruptedException {
        waitForReportLoaded(casesRefferedForConsiderationReportTitle);
        userBuildReport();
    }

    public void userBuildNonDeliveryResolutionsReport() throws InterruptedException {
        waitForReportLoaded(nonDeliveryResolutionsReportTitle);
        userBuildReport();
    }

    public void userBuildUnPaidResolutionsReport() throws InterruptedException {
        waitForReportLoaded(unPaidResolutionsReportTitle);
        userBuildReport();
    }

    public void userBuildNumberOfVerifiedCasesReport() throws InterruptedException {
        waitForReportLoaded(numberOfVerifiedCasesReportTitle);
        userBuildReport();
    }

    public void userBuildCasesPendingVerificationOAPReport() throws InterruptedException {
        waitForReportLoaded(casesPendingVerificationOAPReportTitle);
        userBuildReport();
    }

    public void userBuildProtocolsCreatedByArticlesReport() throws InterruptedException {
        waitForReportLoaded(protocolsCreatedByArticlesReportTitle);
        userBuildReport();
    }

    public void userBuildOnSSPWorkConsolidPageReport() throws InterruptedException {
        waitForReportLoaded(onSSPWorkConsolidPageReportTitle);
        userBuildReport();
    }

    public void userBuildOnSSPWorkDetailedPageReport() throws InterruptedException {
        waitForReportLoaded(onSSPWorkDetailedPageReportTitle);
        userBuildReport();
    }

    public void userBuildAdministrativePenaltiesReport() throws InterruptedException {
        waitForReportLoaded(administrativePenaltiesReportTitle);
        userBuildReport();
    }

    public void userBuildReportOfAppealReport() throws InterruptedException {
        waitForReportLoaded(reportOfAppealReportTitle);
        userBuildReport();
    }

    public void userBuildProtocolsAndResolutionsReport() throws InterruptedException {
        waitForReportLoaded(protocolsAndResolutionsReportTitle);
        userBuildReport();
    }

    private void userSetOrganization(String orgName) {
        int count = 0;
        while(count < 5 ) {
            try {
                click(orgNameSelectLocator);
                WebDriverWait wait1 = new WebDriverWait(driver, 5);
                wait1.until(presenceOfElementLocated(By.cssSelector("input[class*='select2-focused']")));
                break;
            } catch (Exception e) {
                System.out.println("Count: " + count + " SetOrganization exception" );
                count = count + 1;
            }
        }
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

    @Step("Проверяем наличие файла с отчетом")
    public boolean isAppliedAdministrativeMeasuresReportFormed()throws InterruptedException {
        return isReportFormed("appliedAdministrativeMeasures");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isImplementationOfControlMeasuresReportFormed()throws InterruptedException {
        return isReportFormed("implementationOfControlMeasures");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isRevealedViolationPageReportFormed()throws InterruptedException {
        return isReportFormed("revealedViolationPage");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isUnauthorRemodelingReportFormed()throws InterruptedException {
        return isReportFormed("unauthorRemodeling");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isExposedPrescriptionsReportFormed()throws InterruptedException {
        return isReportFormed("exposedPrescriptions");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isSpecObjectsRptByChecksReportFormed()throws InterruptedException {
        return isReportFormed("specObjectsRptByChecks");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isSpecObjectsRptByInspectionActsReportFormed()throws InterruptedException {
        return isReportFormed("specObjectsRptByInspectionActs");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isAdministrativeViolationsReportFormed()throws InterruptedException {
        return isReportFormed("administrativeViolations");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isFinancialSanctionsReportFormed()throws InterruptedException {
        return isReportFormed("financialSanctions");
    }

    @Step("Проверяем наличие файла с отчетом")
    public boolean isPlanOfScheduledInspectionsReportFormed()throws InterruptedException {
        return isReportFormed("copmlitePlanCarryingPlanCheck");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isDataForNonRoutineInspectionsReportFormed()throws InterruptedException {
        return isReportFormed("dataOfOutPlanCheckByRequest");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isDataForPlannedInspectionsReportFormed()throws InterruptedException {
        return isReportFormed("dataOfPlanCheck");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isAppealsToTheProsecutorReportFormed()throws InterruptedException {
        return isReportFormed("statementsToTheProsecutor");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isDataGZHIWorkReportFormed()throws InterruptedException {
        return isReportFormed("workMGI_byYear");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isDataGosControlReportFormed()throws InterruptedException {
        return isReportFormed("DataForMgiControl");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isCasesRefferedForConsiderationReportFormed()throws InterruptedException {
        return isReportFormed("casesRefferedForConsideration");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isNonDeliveryResolutionsReportFormed()throws InterruptedException {
        return isReportFormed("nonDeliveryResolutions");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isUnPaidResolutionsReportFormed()throws InterruptedException {
        return isReportFormed("unPaidResolutionsReport");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isNumberOfVerifiedCasesReportFormed()throws InterruptedException {
        return isReportFormed("numberOfVerifiedCases");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isCasesPendingVerificationOAPReportFormed()throws InterruptedException {
        return isReportFormed("casesPendingVerificationOAP");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isProtocolsCreatedByArticlesReportFormed()throws InterruptedException {
        return isReportFormed("protocolsCreatedByArticles");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isOnSSPWorkConsolidPageReportFormed()throws InterruptedException {
        return isReportFormed("onSSPWorkConsolidPage");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isOnSSPWorkDetailedPageReportFormed()throws InterruptedException {
        return isReportFormed("onSSPWorkDetailedPage");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isAdministrativePenaltiesReportFormed()throws InterruptedException {
        return isReportFormed("administrativePenalties");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isReportOfAppealReportFormed()throws InterruptedException {
        return isReportFormed("reportOfAppeal");
    }
    @Step("Проверяем наличие файла с отчетом")
    public boolean isProtocolsAndResolutionsReportFormed()throws InterruptedException {
        return isReportFormed("protocolsAndResolutions");
    }

}
