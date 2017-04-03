package demo.tests;

import demo.pages.*;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class SigninTest extends BaseTest {

    @Override
    public void runTest()  {
        logStep();
        MainPage mainPage = new MainPage();
        mainPage.SignInbtn();

        logStep();
        UserNamePage entUser = new UserNamePage();
        entUser.enterUserName();

        logStep();
        PasswordPage entPass = new PasswordPage();
        entPass.enterPassword();

        logStep();
        LoginCheck signInSettings = new LoginCheck();
        signInSettings.ClickSettings();

        logStep();
        LoginCheck mail = new LoginCheck();
        mail.FindMail();

    }
}
