package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alexander Zhaleyko on 11.12.2015.
 */
public class CorrespondencePage extends MainMenu {
    public CorrespondencePage(WebDriver driver) {
        super(driver);
    }
    By sentCorrespondenceTitle = By.xpath("//h3[text()='Реестры исходящей корреспонденции']");
    By deliveryDocsTitle = By.xpath("//h3[text()='Информация о вручении']");
    By registerNotificationsTitle = By.xpath("//h3[text()='Регистрация уведомлений']");
    By findButton = By.xpath("//button[text()='Искать']");
    By resultTable = By.xpath("//*[@class='table-wrap']//tbody/tr[1]");

    public void userFormedPage(){
        click(findButton);
    }

    private CorrespondencePage waitForPageLoaded(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return this;
    }
    public void waitForSentCorrespondencePageLoaded(){
        waitForPageLoaded(sentCorrespondenceTitle);
    }

    public void waitForDeliveryDocsPageLoaded(){
        waitForPageLoaded(deliveryDocsTitle);
    }

    public void waitForRegisterNotificationsPageLoaded(){
        waitForPageLoaded(registerNotificationsTitle);
    }

    private boolean isPageFormed(By element){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @Step("Проверяем сформировалась ли таблица с результатами")
    public boolean isSentCorrespondencePageFormed(){
        return isPageFormed(resultTable);
    }
    @Step("Проверяем сформировалась ли таблица с результатами")
    public boolean isDeliveryDocsPageFormed(){
        return isPageFormed(resultTable);
    }
    @Step("Проверяем сформировалась ли таблица с результатами")
    public boolean isRegisterNotificationsPageFormed(){
        return isPageFormed(resultTable);
    }
}
