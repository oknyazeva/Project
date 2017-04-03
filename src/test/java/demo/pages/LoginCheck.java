package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class LoginCheck extends BaseForm {
    private Button btnUser = new Button(By.xpath("//span[@id='yt-masthead-account-picker']/button[@type='button']"), "UserSettingsButton");
    private Label lblMail = new Label(By.xpath("//*[@class='yt-uix-clickcard-card-body']//*[contains(text(),'TestVolhaUser')]"),"MailCheck");
    public LoginCheck() {
        super(By.className("appbar-nav-menu"), "MainPageAfterSignIn");
    }

    public void ClickSettings(){
        btnUser.click();
    }
    public void FindMail(){
        lblMail.click();
    }

}
