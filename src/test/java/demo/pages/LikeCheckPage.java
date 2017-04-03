package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webdriver.BaseForm;
import webdriver.Browser;
import webdriver.elements.Label;

import java.util.List;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class LikeCheckPage extends BaseForm {
    private Label lblLikedVideo = new Label(By.xpath("//*[@id='pl-load-more-destination']//a[contains(text(), 'QAZamb')]"));

    public LikeCheckPage(){super(By.id("pl-header"), "LikeCheckPage");}

    public List<WebElement> list() {
        WebDriver driver = Browser.getInstance().getDriver();
        return driver.findElements(By.xpath("//td[@class='pl-video-title']"));
    }

    //public void CheckLike() {
      //  lblLikedVideo.click();
    //}
}
