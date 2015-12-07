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
}
