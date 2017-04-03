package demo.tests;

import demo.pages.*;
import org.testng.Assert;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class LikeTest extends BaseTest {

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
        VideoSearchResultPage linkVideo = new VideoSearchResultPage();
        linkVideo.GoToVideo();

        logStep();
        LikeVideoPage likebtn = new LikeVideoPage();
        likebtn.PressLike();

        logStep();
        LikeVideoPage menu = new LikeVideoPage();
        menu.MenuLike();

        logStep();
        LikeVideoPage liked = new LikeVideoPage();
        liked.LikedVideosClick();

        logStep();
        LikeCheckPage likedVideos = new LikeCheckPage();
        Assert.assertFalse(likedVideos.list().isEmpty());
    }
}
