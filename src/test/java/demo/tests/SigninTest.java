package demo.tests;

import demo.pages.LoginCheck;
import demo.pages.MainPage;
import demo.pages.PasswordPage;
import demo.pages.UserNamePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class SigninTest extends BaseTest {

    String userName;
    String password;
    @Parameters({"userName","password"})
    @BeforeTest
    public void setUp(String userName, String password){
    this.userName = userName;
    this.password = password;
    }
    @Override
    public void runTest()  {
        logStep();
        MainPage mainPage = new MainPage();
        mainPage.SignInbtn();

        logStep();
        UserNamePage entUser = new UserNamePage();
        entUser.enterUserName(userName);

        logStep();
        PasswordPage entPass = new PasswordPage();
        entPass.enterPassword(password);

        logStep();
        LoginCheck signInSettings = new LoginCheck();
        signInSettings.ClickSettings();

        logStep();
        LoginCheck mail = new LoginCheck();
        mail.FindMail();

    }
}
