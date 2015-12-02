package ru.fors.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;

/**
 * Created by azhaleyko on 02.12.2015.
 */
public class ReportsPage extends MainMenu {

    public ReportsPage(WebDriver driver) {
        super(driver);
    }
    By dateFromField = By.cssSelector("input[name*='from:date']");
    By dateToField = By.cssSelector("input[name*='to:date']");
    By buildButton = By.xpath("//button[text()='Сформировать']");
    By dataOfDocEnteredInMgiReportTitle = By.xpath("//h3[text()='Данные по документам, введенным в ЕИС МЖИ, за период']");

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
    public void userBuildDataOfDocEnteredInMgiReport(String date){
        waitForReportLoaded(dataOfDocEnteredInMgiReportTitle);
        userSetDataFrom(date);
        userSetDataTo(date);
        userBuildReport();
    }

    public boolean isReportFormed(String reportName) {
        File file = new File("target\\");
        File [] files = file.listFiles();
        int count=0;
        for (int i=0; i<files.length; i++){
            File f1 = files[i];
            if(f1.getName().startsWith(reportName)){
                f1.delete();
                count++;
                break;
            }
        }
        if (count>0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isDataOfDocEnteredInMgiReportFormed(){
        return isReportFormed("dataOfDocEnteredInMg");
    }

}
