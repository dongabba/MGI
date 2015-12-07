package ru.fors.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.fors.pages.JournalsPage;
import ru.fors.pages.ReportsPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.junit.Assert.assertTrue;

/**
 * Created by Alexander Zhaleyko on 07.12.2015.
 */
public class JournalsTests extends TestBase {


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

    @Features("Журналы и реестры")
    @Stories("Журнал распоряжений")
    @Test
    public void instructionsJournalTest() throws InterruptedException {
        JournalsPage journalsPage = new JournalsPage(driver);
        journalsPage.userGoToInstructionsJournal();
        journalsPage.waitForPageInstructionsJournalLoaded();
        journalsPage.userFormedJournal();
        assertTrue("Журнал не сформировался или в нем нет данных", journalsPage.isInstructionsJournalFormed());
    }

    @Features("Журналы и реестры")
    @Stories("Журнал актов проверок")
    @Test
    public void actsJournalTest() throws InterruptedException {
        JournalsPage journalsPage = new JournalsPage(driver);
        journalsPage.userGoToActsJournal();
        journalsPage.waitForPageActsJournalLoaded();
        journalsPage.userFormedJournal();
        assertTrue("Журнал не сформировался или в нем нет данных", journalsPage.isActsJournalFormed());
    }

    @Features("Журналы и реестры")
    @Stories("Журнал предписаний")
    @Test
    public void prescriptionsJournalTest() throws InterruptedException {
        JournalsPage journalsPage = new JournalsPage(driver);
        journalsPage.userGoToPrescriptionsJournal();
        journalsPage.waitForPagePrescriptionsJournalLoaded();
        journalsPage.userFormedJournal();
        assertTrue("Журнал не сформировался или в нем нет данных", journalsPage.isPrescriptionsJournalFormed());
    }

    @Features("Журналы и реестры")
    @Stories("Журнал актов осмотра")
    @Test
    public void viewActsJournalTest() throws InterruptedException {
        JournalsPage journalsPage = new JournalsPage(driver);
        journalsPage.userGoToViewActsJournal();
        journalsPage.waitForPageViewActsJournalLoaded();
        journalsPage.userFormedJournal();
        assertTrue("Журнал не сформировался или в нем нет данных", journalsPage.isViewActsJournalJournalFormed());
    }

    @Features("Журналы и реестры")
    @Stories("Журнал определений об отказе в возбуждении дела")
    @Test
    public void criminalJournalTest() throws InterruptedException {
        JournalsPage journalsPage = new JournalsPage(driver);
        journalsPage.userGoToCriminalJournal();
        journalsPage.waitForPageCriminalJournalLoaded();
        journalsPage.userFormedJournal();
        assertTrue("Журнал не сформировался или в нем нет данных", journalsPage.isCriminalJournalFormed());
    }

    @Features("Журналы и реестры")
    @Stories("Журнал мероприятий")
    @Test
    public void eventsJournalTest() throws InterruptedException {
        JournalsPage journalsPage = new JournalsPage(driver);
        journalsPage.userGoToEventsJournal();
        journalsPage.waitForPageEventsJournalLoaded();
        journalsPage.userFormedJournal();
        assertTrue("Журнал не сформировался или в нем нет данных", journalsPage.isEventsJournalFormed());
    }
}
