package demo.tests;

import demo.pages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class SubscribeTest extends BaseTest {

    String userName;
    String password;
    @Parameters({"userName","password"})
    @BeforeTest
    public void setUp(String userName, String password){
        this.userName = userName;
        this.password = password;
    }


    @Override
    public void runTest() {

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
        SearchVideoPage srcPage = new SearchVideoPage();
        srcPage.EnterSrcText();

        logStep();
        SearchResultPage chalelLink = new SearchResultPage();
        chalelLink.GotoChannel();

        logStep();
        SubscribeChannelPage sbscrChbtn = new SubscribeChannelPage();
        sbscrChbtn.pressSubscribe();

        logStep();
        SubscribeChannelPage sbscrCh = new SubscribeChannelPage();
        sbscrCh.findSubscribedChannel();
    }
}
