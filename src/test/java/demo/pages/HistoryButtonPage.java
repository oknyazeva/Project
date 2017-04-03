package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriver.BaseForm;
import webdriver.Browser;
import webdriver.elements.Button;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class HistoryButtonPage extends BaseForm {
    private Button btnHistory = new Button(By.xpath("//li[@id='history-guide-item']//span[@class = 'display-name  no-count']"), "HistoryButton");
    public HistoryButtonPage(){super(By.className("branded-page-module-title-text"), "HistoryButtonPage");}

    public void FullScreen() {
        WebDriver driver = Browser.getInstance().getDriver();
        driver.manage().window().maximize();
    }
    public void HistoryBtn(){
        btnHistory.click();
    }
}
