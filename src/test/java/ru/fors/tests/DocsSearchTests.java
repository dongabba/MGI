package ru.fors.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.fors.pages.DocsSearchPage;
import ru.fors.pages.FinControlPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.junit.Assert.assertTrue;

/**
 * Created by Alexander Zhaleyko on 11.12.2015.
 */
public class DocsSearchTests extends TestBase {

    @BeforeMethod
    @Parameters({"username", "password"})
    public void testStatus(String username, String password){
        if (driver == null){
            init();
            userLogin(username, password);
        } if (driver.getTitle().equals("МЖИ — Вход")){
            userLogin(username, password);
        }
    }

    @Features("Поиск документов")
    @Stories("Поиск со значениями по умолчанию")
    @Test
    public void docsSearchTest() throws InterruptedException {
        DocsSearchPage docsSearchPage = new DocsSearchPage(driver);
        docsSearchPage.userGoToDocsSearchPage();
        docsSearchPage.waitForDocsSearchPageLoaded();
        docsSearchPage.userFormedPage();
        assertTrue("Данные не сформировались за 1 минуту", docsSearchPage.isPageDocsSearchFormed());
    }
}
