package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import webdriver.BaseForm;
import webdriver.elements.TextBox;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class UserNamePage extends BaseForm {
    private TextBox txbUser = new TextBox(By.id("Email"), "UserName");
    public UserNamePage(){super(By.className("hidden-small"), "UserNamePage");}
    public void enterUserName(String text){
        txbUser.setText(text);
        txbUser.sendKeys(Keys.ENTER);
    }
}
