package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

/**
 * Created by o_knyazeva on 4/1/17.
 */

public class MainPage extends BaseForm {
    private Button btnSign_in = new Button(By.className("signin-container "), "Sign_in");
    public MainPage(){super(By.id("appbar-nav"), "MainPage");}
    public void SignInbtn(){
        btnSign_in.click();
    }
}
