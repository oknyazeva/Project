package demo.tests;

import demo.pages.*;
import org.testng.Assert;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class SearchVideoTest extends BaseTest {
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
        SearchVideoPage searvhVideo = new SearchVideoPage();
        searvhVideo.EnterSrcText();

        logStep();
        SearchResultPage listVideos = new SearchResultPage();
        Assert.assertFalse(listVideos.list().isEmpty());

    }
}
