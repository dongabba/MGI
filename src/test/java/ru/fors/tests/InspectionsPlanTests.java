package ru.fors.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.fors.pages.FinControlPage;
import ru.fors.pages.InspectionsPlanPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static org.junit.Assert.assertTrue;

/**
 * Created by Alexander Zhaleyko on 11.12.2015.
 */
public class InspectionsPlanTests extends TestBase{

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

    @Features("План проведения проверок")
    @Stories("План проверок ЮЛ/ИП")
    @Test
    public void jurAndIpPlanTest() throws InterruptedException {
        InspectionsPlanPage inspectionsPlanPage = new InspectionsPlanPage(driver);
        inspectionsPlanPage.userGoToJurAndIpPlanPage();
        assertTrue("Данные не сформировались за 1 минуту", inspectionsPlanPage.isJurAndIpPlanPageFormed());
    }

    @Features("План проведения проверок")
    @Stories("План проверок ОМС/ДЛ ОМС")
    @Test
    public void omsPlanTest() throws InterruptedException {
        InspectionsPlanPage inspectionsPlanPage = new InspectionsPlanPage(driver);
        inspectionsPlanPage.userGoToOmsPlanPage();
        assertTrue("Данные не сформировались за 1 минуту", inspectionsPlanPage.isOmsPlanPageFormed());
    }
}
