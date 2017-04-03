package demo.tests;

import demo.pages.*;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class SubscribeTest extends BaseTest {

    @Override
    public void runTest() {

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
