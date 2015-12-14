package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alexander Zhaleyko on 02.12.2015.
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
    By planOfScheduledInspectionsReport = By.linkText("Выполнение плана проведения плановых проверок");
    By dataForNonRoutineInspectionsReport = By.linkText("Данные по внеплановым проверкам");
    By dataForPlannedInspectionsReport = By.linkText("Данные по плановым проверкам");
    By appealsToTheProsecutorReport = By.linkText("Отчет по обращениям подразделений в прокуратуру для согласования проведения внеплановых проверок ЮЛ");
    By dataGZHIWorkReport = By.linkText("Сведения о работе Государственной жилищной инспекции города Москвы");
    By dataGosControlReport = By.linkText("Сведения об осуществлении государственного контроля (надзора) и муниципального контроля");

    //=======Меню административные========
    By adminReports = By.linkText("Административные");
    By appliedAdministrativeMeasuresReport = By.linkText("Принятые меры административного воздействия за нарушения требований по раскрытию информации УО");
    By implementationOfControlMeasuresReport = By.linkText("Сводная информация о проведенных контрольных мероприятиях");
    By revealedViolationPageReport = By.linkText("Отчет по выявленным нарушениям");
    By redevelopmentReport = By.linkText("Отчет по несанкционированным перепланировкам");
    By administrativeViolationsReport = By.linkText("Данные по возвратам административных дел");
    By financialSanctionsReport = By.linkText("Отчет по финансовым санкциям");
    By casesRefferedForConsiderationReport = By.linkText("Дела, переданные на рассмотрение по подведомственности");
    By nonDeliveryResolutionsReport = By.linkText("Отчет по неврученным постановлениям");
    By unPaidResolutionsReport = By.linkText("Отчет по неоплаченным постановлениям");
    By numberOfVerifiedCasesReport = By.linkText("Отчет по количеству проверенных дел");
    By casesPendingVerificationOAPReport = By.linkText("Дела на проверке в ОАП");
    By protocolsCreatedByArticlesReport = By.linkText("Протоколы, составленные по статьям");
    By onSSPWorkConsolidPageReport = By.linkText("Отчет по работе с ССП. Сводный");
    By onSSPWorkDetailedPageReport = By.linkText("Отчет по работе с ССП. Детализированный");
    By administrativePenaltiesReport = By.linkText("Сведения о просроченной дебиторской задолженности по административным штрафам");
    By reportOfAppealReport = By.linkText("Отчет по обжалованиям");
    By protocolsAndResolutionsReport = By.xpath("//a[contains(text(), 'Протоколы и постановления  по подразделениям МЖИ')]");

    //=======По особым объектам========
    By specialObjectsReports = By.linkText("По особым объектам");
    By exposedPrescriptionsReport = By.linkText("Отчет по выставленным предписаниям");
    By specObjectsRptByChecksReport = By.linkText("Отчет по проверкам");
    By specObjectsRptByInspectionActsReport = By.linkText("Отчет по актам осмотра");

    //=======Меню Журналы и реестры========
    By journalsAnrRegistryLink = By.linkText("Журналы и реестры");

    //=======Инспекционные журналы=======
    By inspJourlalsLink = By.linkText("Инспекционные журналы");
    By instructionsJournal = By.linkText("Журнал распоряжений");
    By actsJournal = By.linkText("Журнал актов проверок");
    By prescriptionsJournal = By.linkText("Журнал предписаний");
    By viewActsJournal = By.linkText("Журнал актов осмотра");
    By criminalJournal = By.linkText("Журнал определений об отказе в возбуждении дела");
    By eventsJournal = By.linkText("Журнал мероприятий");

    //=======Административная практика=======
    By adminPracticsLink = By.linkText("Административная практика");
    By protocolsJournal = By.linkText("Журнал протоколов");
    By apDealJournal = By.linkText("Журнал дел об АП");
    By decreeJournal = By.linkText("Журнал постановлений");
    By adjunctJournal = By.linkText("Журнал определений");
    By claimJournal = By.linkText("Журнал жалоб");
    By representJournal = By.linkText("Журнал представлений");
    By receivedOnJurisdictionAPJournal = By.linkText("Журнал дел, поступивших по подведомственности");

    //Журнал сопроводительных писем в ССП
    By coverLettersJournal = By.linkText("Журнал сопроводительных писем в ССП");

    //=======Журнал реестров=======
    By registryJournal = By.linkText("Журнал реестров");

    //=======Журнал обращений=======
    By referencesJournal = By.linkText("Журнал обращений");

    //=======Проверка соискателя лицензии=======
    By licenseApplicantLink = By.linkText("Проверка соискателя лицензии");
    By instructionsOnCheckApplicantsJournal = By.linkText("Журнал распоряжений на проверку соискателей");
    By actsOfChekingApplicantsJournal = By.linkText("Журнал актов проверки соискателей");

    //=======Финансовый контроль=======
    By finControlLink = By.linkText("Финансовый контроль");
    By profit = By.linkText("Начисления");
    By payments = By.linkText("Платежи");
    By applicationsForRefund = By.linkText("Заявки на возврат");
    By profitAndpaymentsLink = By.linkText("Связывание начислений и платежей");
    By finance = By.linkText("Финансовые показатели");

    //=======Поиск документов=======
    By docsSearch = By.linkText("Поиск документов");

    //=======Корреспонденция=======
    By correspondenceLink = By.linkText("Корреспонденция");
    By sentCorrespondence = By.linkText("Реестры исх. корреспонденции");
    By deliveryDocs = By.linkText("Вручение документов");
    By registerNotifications = By.linkText("Регистрация уведомлений");

    //=======План проведения проверок=======
    By inspectionsPlanLink = By.linkText("План проведения проверок");
    By jurAndIpPlan = By.linkText("План проверок ЮЛ/ИП");
    By omsPlan = By.linkText("План проверок ОМС/ДЛ ОМС");

    //Данные по документам, введенным в ЕИС МЖИ
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataOfDocEnteredInMgiReport(){
        clickOn3Link(reportsLink, inspReportsPage, dataOfDocEnteredInMgiReport);
        return new ReportsPage(driver);
    }
    //Данные по актам осмотра за период
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataOfInspectionActReport() {
        clickOn3Link(reportsLink, inspReportsPage, dataOfInspectionActReport);
        return new ReportsPage(driver);
    }
    //Данные по предписаниям за период
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataOfPrescriptionReport() {
        clickOn3Link(reportsLink, inspReportsPage, dataOfPrescriptionReport);
        return new ReportsPage(driver);
    }
    //Список оформленных документов по адресу
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToListFormedDocsByAddressReport() {
        clickOn3Link(reportsLink, inspReportsPage, listFormedDocsByAddressReport);
        return new ReportsPage(driver);
    }
    //Список актов, не имеющих предписаний
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToListCheckActWithoutPrescriptionReport() {
        clickOn3Link(reportsLink, inspReportsPage, listCheckActWithoutPrescriptionReport);
        return new ReportsPage(driver);
    }

    //Данные по актам осмотра и связанным с ними документам, введенным в ЕИС МЖИ за период
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToInspectionActsReport() {
        clickOn3Link(reportsLink, inspReportsPage, inspectionActsReport);
        return new ReportsPage(driver);
    }

    //Данные по актам поверки и связанным с ними документам, введенным в ЕИС МЖИ за период
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToCheckInspectionActsReport() {
        clickOn3Link(reportsLink, inspReportsPage, checkInspectionActsReport);
        return new ReportsPage(driver);
    }
    //Статистические данные о проведении проверок МЖИ в отношении ЮЛ
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToStatisticDataReport() {
        clickOn3Link(reportsLink, inspReportsPage, statisticDataReport);
        return new ReportsPage(driver);
    }
    //Список распоряжений с истекающим сроком проведения проверки
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToInstructionsFizlReport() {
        clickOn3Link(reportsLink, inspReportsPage, instructionsFizReport);
        return new ReportsPage(driver);
    }
    //Список документов, выданных на субъект предписания
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToSubjectRequirementsReport() {
        clickOn3Link(reportsLink, inspReportsPage, subjectRequirementsReport);
        return new ReportsPage(driver);
    }

    //Справка по проведению инспекционных проверок жилищного фонда за период (на субъект)
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToInspectionReferenceReport() {
        clickOn3Link(reportsLink, inspReportsPage, inspectionReferenceReport);
        return new ReportsPage(driver);
    }

    //Реестр предписаний
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToRegistryRequirementsReport() {
        clickOn3Link(reportsLink, inspReportsPage, registryRequirementsReport);
        return new ReportsPage(driver);
    }
    //Принятые меры административного воздействия за нарушения требований по раскрытию информации УО
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToAppliedAdministrativeMeasuresReport() {
        clickOn3Link(reportsLink, adminReports, appliedAdministrativeMeasuresReport);
        return new ReportsPage(driver);
    }

    //Сводная информация о проведенных контрольных мероприятиях
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToImplementationOfControlMeasuresReport() {
        clickOn3Link(reportsLink, adminReports, implementationOfControlMeasuresReport);
        return new ReportsPage(driver);
    }

    //Отчет по выявленным нарушениям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToRevealedViolationPageReport() {
        clickOn3Link(reportsLink, adminReports, revealedViolationPageReport);
        return new ReportsPage(driver);
    }

    //Отчет по несанкционированным перепланировкам
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToAdministrativeViolationsReport() {
        clickOn3Link(reportsLink, adminReports, administrativeViolationsReport);
        return new ReportsPage(driver);
    }

    //Отчет по финансовым санкциям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToFinancialSanctionsReport() {
        clickOn3Link(reportsLink, adminReports, financialSanctionsReport);
        return new ReportsPage(driver);
    }

    //Отчет по несанкционированным перепланировкам
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToUnauthorRemodelingReport() {
        clickOn3Link(reportsLink, adminReports, redevelopmentReport);
        return new ReportsPage(driver);
    }

    //Отчет по выставленным предписаниям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToExposedPrescriptionsReport() {
        clickOn3Link(reportsLink, specialObjectsReports, exposedPrescriptionsReport);
        return new ReportsPage(driver);
    }

    //Отчет по проверкам
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToSpecObjectsRptByChecksReport() {
        clickOn3Link(reportsLink, specialObjectsReports, specObjectsRptByChecksReport);
        return new ReportsPage(driver);
    }

    //Отчет по актам осмотра
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToSpecObjectsRptByInspectionActsReport() {
        clickOn3Link(reportsLink, specialObjectsReports, specObjectsRptByInspectionActsReport);
        return new ReportsPage(driver);
    }

    //Отчет выполнение плана проведения плановых проверок
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToPlanOfScheduledInspectionsReport() {
        clickOn3Link(reportsLink, inspReportsPage, planOfScheduledInspectionsReport);
        return new ReportsPage(driver);
    }

    //Данные по внеплановым проверкам
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataForNonRoutineInspectionsReport() {
        clickOn3Link(reportsLink, inspReportsPage, dataForNonRoutineInspectionsReport);
        return new ReportsPage(driver);
    }

    //Данные по плановым проверкам
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataForPlannedInspectionsReport() {
        clickOn3Link(reportsLink, inspReportsPage, dataForPlannedInspectionsReport);
        return new ReportsPage(driver);
    }

    //Отчет по обращениям подразделений в прокуратуру для согласования проведения внеплановых проверок ЮЛ
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToAppealsToTheProsecutorReport() {
        clickOn3Link(reportsLink, inspReportsPage, appealsToTheProsecutorReport);
        return new ReportsPage(driver);
    }

    //Сведения о работе Государственной жилищной инспекции города Москвы
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataGZHIWorkReport() {
        clickOn3Link(reportsLink, inspReportsPage, dataGZHIWorkReport);
        return new ReportsPage(driver);
    }

    //Сведения об осуществлении государственного контроля (надзора) и муниципального контроля
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToDataGosControlReport() {
        clickOn3Link(reportsLink, inspReportsPage, dataGosControlReport);
        return new ReportsPage(driver);
    }

    //Дела, переданные на рассмотрение по подведомственности
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToCasesRefferedForConsiderationReport() {
        clickOn3Link(reportsLink, adminReports, casesRefferedForConsiderationReport);
        return new ReportsPage(driver);
    }

    //Отчет по неврученным постановлениям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToNonDeliveryResolutionsReport() {
        clickOn3Link(reportsLink, adminReports, nonDeliveryResolutionsReport);
        return new ReportsPage(driver);
    }

    //Отчет по неоплаченным постановлениям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToUnPaidResolutionsReport() {
        clickOn3Link(reportsLink, adminReports, unPaidResolutionsReport);
        return new ReportsPage(driver);
    }

    //Отчет по количеству проверенных дел
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToNumberOfVerifiedCasesReport() {
        clickOn3Link(reportsLink, adminReports, numberOfVerifiedCasesReport);
        return new ReportsPage(driver);
    }

    //Дела на проверке в ОАП
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToCasesPendingVerificationOAPReport() {
        clickOn3Link(reportsLink, adminReports, casesPendingVerificationOAPReport);
        return new ReportsPage(driver);
    }

    //Протоколы, составленные по статьям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToProtocolsCreatedByArticlesReport() {
        clickOn3Link(reportsLink, adminReports, protocolsCreatedByArticlesReport);
        return new ReportsPage(driver);
    }

    //Отчет по работе с ССП. Сводный
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToOnSSPWorkConsolidPageReportReport() {
        clickOn3Link(reportsLink, adminReports, onSSPWorkConsolidPageReport);
        return new ReportsPage(driver);
    }

    //Отчет по работе с ССП. Детализированный
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToOnSSPWorkDetailedPageReport() {
        clickOn3Link(reportsLink, adminReports, onSSPWorkDetailedPageReport);
        return new ReportsPage(driver);
    }

    //Сведения о просроченной дебиторской задолженности по административным штрафам
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToAdministrativePenaltiesReport() {
        clickOn3Link(reportsLink, adminReports, administrativePenaltiesReport);
        return new ReportsPage(driver);
    }

    //Отчет по обжалованиям
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToReportOfAppealReport() {
        clickOn3Link(reportsLink, adminReports, reportOfAppealReport);
        return new ReportsPage(driver);
    }

    //Протоколы и постановления  по подразделениям МЖИ
    @Step("Переходим на страницу отчета")
    public ReportsPage userGoToProtocolsAndResolutionsReport() {
        clickOn3Link(reportsLink, adminReports, protocolsAndResolutionsReport);
        return new ReportsPage(driver);
    }


    //Журнал распоряжений
    @Step("Переходим на страницу \"Журнал распоряжений\"")
    public JournalsPage userGoToInstructionsJournal(){
        clickOn3Link(journalsAnrRegistryLink, inspJourlalsLink, instructionsJournal);
        return new JournalsPage(driver);
    }

    //Журнал мероприятий
    @Step("Переходим на страницу \"Журнал мероприятий\"")
    public JournalsPage userGoToEventsJournal(){
        clickOn3Link(journalsAnrRegistryLink, inspJourlalsLink, eventsJournal);
        return new JournalsPage(driver);
    }

    //Журнал актов проверок
    @Step("Переходим на страницу \"Журнал актов проверок\"")
    public JournalsPage userGoToActsJournal(){
        clickOn3Link(journalsAnrRegistryLink, inspJourlalsLink, actsJournal);
        return new JournalsPage(driver);
    }

    //Журнал предписаний
    @Step("Переходим на страницу \"Журнал предписаний\"")
    public JournalsPage userGoToPrescriptionsJournal(){
        clickOn3Link(journalsAnrRegistryLink, inspJourlalsLink, prescriptionsJournal);
        return new JournalsPage(driver);
    }

    //Журнал актов осмотра
    @Step("Переходим на страницу \"Журнал актов осмотра\"")
    public JournalsPage userGoToViewActsJournal(){
        clickOn3Link(journalsAnrRegistryLink, inspJourlalsLink, viewActsJournal);
        return new JournalsPage(driver);
    }

    //Журнал определений об отказе в возбуждении дела
    @Step("Переходим на страницу \"Журнал определений об отказе в возбуждении дела\"")
    public JournalsPage userGoToCriminalJournal(){
        clickOn3Link(journalsAnrRegistryLink, inspJourlalsLink, criminalJournal);
        return new JournalsPage(driver);
    }

    //Журнал протоколов
    @Step("Переходим на страницу \"Журнал протоколов\"")
    public JournalsPage userGoToProtocolsJournal(){
        clickOn3Link(journalsAnrRegistryLink, adminPracticsLink, protocolsJournal);
        return new JournalsPage(driver);
    }

    //Журнал дел об АП
    @Step("Переходим на страницу \"Журнал дел об АП\"")
    public JournalsPage userGoToApDealJournal(){
        clickOn3Link(journalsAnrRegistryLink, adminPracticsLink, apDealJournal);
        return new JournalsPage(driver);
    }

    //"Журнал постановлений
    @Step("Переходим на страницу \"Журнал постановлений\"")
    public JournalsPage userGoToDecreeJournal(){
        clickOn3Link(journalsAnrRegistryLink, adminPracticsLink, decreeJournal);
        return new JournalsPage(driver);
    }

    //Журнал определений
    @Step("Переходим на страницу \"Журнал определений\"")
    public JournalsPage userGoToAdjunctJournal(){
        clickOn3Link(journalsAnrRegistryLink, adminPracticsLink, adjunctJournal);
        return new JournalsPage(driver);
    }

    //Журнал жалоб
    @Step("Переходим на страницу \"Журнал жалоб\"")
    public JournalsPage userGoToClaimJournal(){
        clickOn3Link(journalsAnrRegistryLink, adminPracticsLink, claimJournal);
        return new JournalsPage(driver);
    }

    //Журнал представлений
    @Step("Переходим на страницу \"Журнал представлений\"")
    public JournalsPage userGoToRepresentJournal(){
        clickOn3Link(journalsAnrRegistryLink, adminPracticsLink, representJournal);
        return new JournalsPage(driver);
    }

    //Журнал реестров
    @Step("Переходим на страницу \"Журнал реестров\"")
    public JournalsPage userGoToRegistryJournal(){
        clickOn2Link(journalsAnrRegistryLink, registryJournal);
        return new JournalsPage(driver);
    }

    //Журнал обращений
    @Step("Переходим на страницу \"Журнал обращений\"")
    public JournalsPage userGoToReferencesJournal(){
        clickOn2Link(journalsAnrRegistryLink, referencesJournal);
        return new JournalsPage(driver);
    }

    //Журнал распоряжений на проверку соискателей
    @Step("Переходим на страницу \"Журнал распоряжений на проверку соискателей\"")
    public JournalsPage userGoToInstructionsOnCheckApplicantsJournal(){
        clickOn3Link(journalsAnrRegistryLink, licenseApplicantLink,instructionsOnCheckApplicantsJournal);
        return new JournalsPage(driver);
    }

    //Журнал актов проверки соискателей
    @Step("Переходим на страницу \"Журнал актов проверки соискателей\"")
    public JournalsPage userGoToActsOfChekingApplicantsJournal(){
        clickOn3Link(journalsAnrRegistryLink, licenseApplicantLink, actsOfChekingApplicantsJournal);
        return new JournalsPage(driver);
    }

    //Журнал реестров для специалиста ОАП
    @Step("Переходим на страницу \"Журнал реестров\"")
    public JournalsPage userGoToRegistryForOAPSpecialistJournal(){
        clickOn3Link(journalsAnrRegistryLink, adminPracticsLink, registryJournal);
        return new JournalsPage(driver);
    }

    //Журнал дел, поступивших по подведомственности
    @Step("Переходим на страницу \"Журнал дел, поступивших по подведомственности\"")
    public JournalsPage userGoToReceivedOnJurisdictionAPJournal(){
        clickOn3Link(journalsAnrRegistryLink, adminPracticsLink, receivedOnJurisdictionAPJournal);
        return new JournalsPage(driver);
    }

    //Журнал сопроводительных писем в ССП
    @Step("Переходим на страницу \"Журнал сопроводительных писем в ССП\"")
    public JournalsPage userGoToCoverLettersJournal(){
        clickOn2Link(journalsAnrRegistryLink, coverLettersJournal);
        return new JournalsPage(driver);
    }

    //Начисления
    @Step("Переходим на страницу \"Финансовый контроль\" -> \"Начисления\"")
    public FinControlPage userGoToProfitPage(){
        clickOn2Link(finControlLink, profit);
        return new FinControlPage(driver);
    }

    //Платежи
    @Step("Переходим на страницу \"Финансовый контроль\" -> \"Платежи\"")
    public FinControlPage userGoToPaymentsPage(){
        clickOn2Link(finControlLink, payments);
        return new FinControlPage(driver);
    }

    //Заявки на возврат
    @Step("Переходим на страницу \"Финансовый контроль\" -> \"Заявки на возврат\"")
    public FinControlPage userGoToApplicationsForRefundPage(){
        clickOn2Link(finControlLink, applicationsForRefund);
        return new FinControlPage(driver);
    }

    //Связывание начислений и платежей
    @Step("Переходим на страницу \"Финансовый контроль\" -> \"Связывание начислений и платежей\"")
    public FinControlPage userGoToProfitAndPaymentsPage(){
        clickOn2Link(finControlLink, profitAndpaymentsLink);
        return new FinControlPage(driver);
    }

    //Связывание начислений и платежей
    @Step("Переходим на страницу \"Финансовый контроль\" -> \"Финансовые показатели\"")
    public FinControlPage userGoToFinancePage(){
        clickOn2Link(finControlLink, finance);
        return new FinControlPage(driver);
    }

    //Поиск документов
    @Step("Переходим на страницу \"Поиск документов\"")
    public DocsSearchPage userGoToDocsSearchPage(){
        click(docsSearch);
        return new DocsSearchPage(driver);
    }

    //Реестры исходящей корреспонденции
    @Step("Переходим на страницу \"Корреспонденция\" -> \"Реестры исходящей корреспонденции\"")
    public CorrespondencePage userGoToSentCorrespondencePage(){
        clickOn2Link(correspondenceLink, sentCorrespondence);
        return new CorrespondencePage(driver);
    }

    //Вручение документов
    @Step("Переходим на страницу \"Корреспонденция\" -> \"Вручение документов\"")
    public CorrespondencePage userGoToDeliveryDocsPage(){
        clickOn2Link(correspondenceLink, deliveryDocs);
        return new CorrespondencePage(driver);
    }

    //Регистрация уведомлений
    @Step("Переходим на страницу \"Корреспонденция\" -> \"Регистрация уведомлений\"")
    public CorrespondencePage userGoToRegisterNotificationsPage(){
        clickOn2Link(correspondenceLink, registerNotifications);
        return new CorrespondencePage(driver);
    }

    //План проверок ЮЛ/ИП
    @Step("Переходим на страницу \"План проведения проверок\" -> \"План проверок ЮЛ/ИП\"")
    public InspectionsPlanPage userGoToJurAndIpPlanPage(){
        clickOn2Link(inspectionsPlanLink, jurAndIpPlan);
        return new InspectionsPlanPage(driver);
    }

    //План проверок ОМС/ДЛ ОМС
    @Step("Переходим на страницу \"План проведения проверок\" -> \"План проверок ОМС/ДЛ ОМС\"")
    public InspectionsPlanPage userGoToOmsPlanPage(){
        clickOn2Link(inspectionsPlanLink, omsPlan);
        return new InspectionsPlanPage(driver);
    }


}
