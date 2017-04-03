package demo.tests;

import demo.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class LikeTest extends BaseTest {

    String userName;
    String password;
    String searchText;
    @Parameters({"userName","password","searchText"})
    @BeforeTest
    public void setUp(String userName, String password, String searchText){
        this.userName = userName;
        this.password = password;
        this.searchText = searchText;
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
        srcPage.EnterSrcText(searchText);

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
