package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Label;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class ChannelPage extends BaseForm {
    private Label lblVideo = new Label(By.xpath("//*[@id='browse-items-primary']//a[contains(.,'Test_Video')]"), "VideoLink");
    public ChannelPage(){super(By.className("qualified-channel-title-text"), "ChanelPage");}

    public void clickLinkVodeo(){
        lblVideo.click();
    }
}
