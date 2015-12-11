package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alexander Zhaleyko on 11.12.2015.
 */
public class InspectionsPlanPage extends MainMenu{
    public InspectionsPlanPage(WebDriver driver) {
        super(driver);
    }
    By jurAndIpPlanTitle = By.xpath("//h3[text()='Планы проведения проверок юридических лиц и индивидуальных предпринимателей']");
    By omsPlanTitle = By.xpath("//h3[text()='Планы проведения проверок ОМС и ДЛ ОМС']");

    private boolean isPageFormed(By element){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @Step("Проверяем открылась ли страница \"План проверок ЮЛ/ИП\"")
    public boolean isJurAndIpPlanPageFormed(){
        return isPageFormed(jurAndIpPlanTitle);
    }
    @Step("Проверяем сформировалась ли страница \"План проверок ОМС/ДЛ ОМС\"")
    public boolean isOmsPlanPageFormed(){
        return isPageFormed(omsPlanTitle);
    }

}
