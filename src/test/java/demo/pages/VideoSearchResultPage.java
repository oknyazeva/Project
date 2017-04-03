package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class VideoSearchResultPage extends BaseForm {
    private Label lblVideo = new Label(By.xpath("//div[@class='yt-lockup-content']//a[contains(text(),'test video 20170325 204454')]"), "UserName");
    public VideoSearchResultPage(){super(By.id("results"), "VideoSearchPage");}
    public void GoToVideo() {
        lblVideo.click();
    }
}
