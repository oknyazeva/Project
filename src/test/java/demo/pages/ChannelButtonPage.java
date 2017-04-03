package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class ChannelButtonPage extends BaseForm {
    private Button btnChannel = new Button(By.id("UCAvGWbMd5KUtnww7P7DIKxA-guide-item"), "HistoryButton");
    public ChannelButtonPage(){super(By.id("feed-main-what_to_watch"), "MainPage");}

    public void ChannelBtn(){
        btnChannel.click();
    }
}
