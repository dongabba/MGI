package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alexander Zhaleyko on 07.12.2015.
 */
public class JournalsPage extends MainMenu {
    public JournalsPage(WebDriver driver) {
        super(driver);
    }

    By instructionsJournalTitle = By.xpath("//h3[text()='Распоряжения']");
    By actsJournalTitle = By.xpath("//h3[text()='Акты проверок']");
    By prescriptionsJournalTitle = By.xpath("//h3[text()='Предписания']");
    By viewActsJournalTitle = By.xpath("//h3[text()='Акты осмотров / Акты']");
    By criminalJournalTitle = By.xpath("//h3[text()='Определения об отказе в возбуждении дела']");
    By eventsJournalTitle = By.xpath("//h3[text()='Список мероприятий']");
    By findButton = By.xpath("//button[text()='Искать']");
    By tableWithResults = By.xpath("//*[@class='act-panel']/div[2]//table/tbody/tr[1]");
    By tableWithResults2 = By.xpath("//*[@class='act-panel']/div//table/tbody/tr[1]");
    By protocolsJournalTitle = By.xpath("//h3[text()='Протоколы']");
    By apDealJournalTitle = By.xpath("//h3[text()='Дело об АП']");
    By decreeJournalTitle = By.xpath("//h3[text()='Постановления']");
    By adjunctJournalTitle = By.xpath("//h3[text()='Определения']");
    By claimJournalTitle = By.xpath("//h3[text()='Жалобы']");
    By representJournalTitle = By.xpath("//h3[text()='Представления об устранении причин и условий, способствовавших совершению административного правонарушения']");
    By tableWithResultInAdmPractice = By.xpath("//*[@class='table-wrap']//tbody/tr[1]");
    By registryJournalTitle = By.xpath("//h3[text()='Реестры']");
    By referencesJournalTitle = By.xpath("//h3[text()='Обращения']");
    By instructionsOnCheckApplicantsJournalTitle = By.xpath("//h3[text()='Распоряжения РС-']");
    By actsOfChekingApplicantsJournalTitle = By.xpath("//h3[text()='Акты проверки соискателей лицензии']");

    public void waitForPageInstructionsJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(instructionsJournalTitle));
    }

    public void waitForPageActsJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(actsJournalTitle));
    }

    public void waitForPagePrescriptionsJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(prescriptionsJournalTitle));
    }

    public void waitForPageViewActsJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewActsJournalTitle));
    }

    public void waitForPageCriminalJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(criminalJournalTitle));
    }

    public void waitForPageEventsJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(eventsJournalTitle));
    }

    public void userFormedJournal(){
        click(findButton);
    }

    public boolean isJournalFormed(By element){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch (Exception e){
            return false;
        }
    }
    @Step("Проверяем, сформировался ли журнал распоряжений")
    public boolean isInstructionsJournalFormed(){
        return isJournalFormed(tableWithResults);
    }
    @Step("Проверяем, сформировался ли журнал актов проверок")
    public boolean isActsJournalFormed(){
        return isJournalFormed(tableWithResults);
    }

    @Step("Проверяем, сформировался ли журнал предписаний")
    public boolean isPrescriptionsJournalFormed(){
        return isJournalFormed(tableWithResults);
    }

    @Step("Проверяем, сформировался ли журнал актов осмотра")
    public boolean isViewActsJournalJournalFormed(){
        return isJournalFormed(tableWithResults2);
    }

    @Step("Проверяем, сформировался ли журнал определений об отказе в возбуждении дела")
    public boolean isCriminalJournalFormed(){
        return isJournalFormed(tableWithResults2);
    }

    @Step("Проверяем, сформировался ли журнал мероприятий")
    public boolean isEventsJournalFormed(){
        return isJournalFormed(tableWithResults2);
    }

    public void waitForPageProtocolsJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(protocolsJournalTitle));
    }

    public void waitForPagelApDealJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(apDealJournalTitle));
    }

    public void waitForPageDecreeJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(decreeJournalTitle));
    }

    public void waitForPageAdjunctJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(adjunctJournalTitle));
    }

    public void waitForPageClaimJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(claimJournalTitle));
    }

    public void waitForPageRepresentJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(representJournalTitle));
    }

    public void waitForPageRegistryJournalLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(registryJournalTitle));
    }

    public void waitForPageReferencesJournalTitleLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(referencesJournalTitle));
    }

    public void waitForPageInstructionsOnCheckApplicantsJournalTitleLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(instructionsOnCheckApplicantsJournalTitle));
    }

    public void waitForPageActsOfChekingApplicantsJournalTitleLoaded (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(actsOfChekingApplicantsJournalTitle));
    }

    @Step("Проверяем, сформировался ли журнал протоколов")
    public boolean isProtocolsJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }
    @Step("Проверяем, сформировался ли журнал дел об АП")
    public boolean isApDealJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }

    @Step("Проверяем, сформировался ли журнал постановлений")
    public boolean isDecreeJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }

    @Step("Проверяем, сформировался ли журнал определений")
    public boolean isAdjunctJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }

    @Step("Проверяем, сформировался ли журнал жалоб")
    public boolean isClaimJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }

    @Step("Проверяем, сформировался ли журнал представлений")
    public boolean isRepresentJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }

    @Step("Проверяем, сформировался ли журнал реестров")
    public boolean isRegistryJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }

    @Step("Проверяем, сформировался ли журнал обращений")
    public boolean isReferencesJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }

    @Step("Проверяем, сформировался ли журнал распоряжений на проверку соискателей")
    public boolean isInstructionsOnCheckApplicantsJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }

    @Step("Проверяем, сформировался ли журнал актов проверки соискателей")
    public boolean isActsOfChekingApplicantsJournalFormed(){
        return isJournalFormed(tableWithResultInAdmPractice);
    }
}
