package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class SubscribeChannelPage extends BaseForm {
    private Button btnSubscribe = new Button(By.className("yt-uix-subscription-button"), "SubscribeButton");
    private Label lblChanelSection = new Label(By.xpath("//li[@id='UCzsru0C3bpCbvi5VZySrcEw-guide-item']//span[contains(text(), 'QAZamb')]"));
    public SubscribeChannelPage(){super(By.className("qualified-channel-title-text"), "ChanelPage");}

    public void pressSubscribe(){
        btnSubscribe.click();
    }

    public void findSubscribedChannel(){
        lblChanelSection.click();
    }
}
