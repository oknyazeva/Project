package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import webdriver.BaseForm;
import webdriver.elements.TextBox;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class PasswordPage extends BaseForm {
    private TextBox txbPassword = new TextBox(By.id("Passwd"),"Password");
    public PasswordPage(){super(By.id("email-display"), "Password");}
    public void enterPassword(){
        txbPassword.setText("TestUser1234");
        txbPassword.sendKeys(Keys.ENTER);
    }
}