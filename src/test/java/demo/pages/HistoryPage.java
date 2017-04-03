package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webdriver.BaseForm;
import webdriver.Browser;
import webdriver.elements.Button;

import java.util.List;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class HistoryPage extends BaseForm {
    private Button btnClearHistory = new Button(By.id("watch-history-clear-button"), "ClearHistoryButton");
    private Button btnConfirm = new Button(By.id("watch-history-clear-confirm-button"), "ConfirmButton");

    public HistoryPage(){super(By.id("watch-history-pause-button"), "HistoryPage");}

    public void ClearHistoryBtn(){
        btnClearHistory.click();
    }
    public void Submit() {
        btnConfirm.click();
    }
    public List<WebElement> list(){
        WebDriver driver = Browser.getInstance().getDriver();
        return driver.findElements(By.xpath("//li[@class='yt-uix-menu-top-level-button']"));
    }
}
