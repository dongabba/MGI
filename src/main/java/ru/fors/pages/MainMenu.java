package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by azhaleyko on 02.12.2015.
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

    public void userGoToInspReports(){
        click(reportsLink);
        wait.until(ExpectedConditions.visibilityOfElementLocated(inspReportsPage));
        click(inspReportsPage);
    }

    //Данные по документам, введенным в ЕИС МЖИ
    public ReportsPage userGoToDataOfDocEnteredInMgiReport(){
        userGoToInspReports();
        wait.until(ExpectedConditions.visibilityOfElementLocated(dataOfDocEnteredInMgiReport));
        click(dataOfDocEnteredInMgiReport);
        return new ReportsPage(driver);
    }

}
