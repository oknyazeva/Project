package demo.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class LikeVideoPage extends BaseForm {
    private Button btnLike = new Button(By.className("like-button-renderer-like-button"), "LikeButton");
    private Button btnMenu = new Button(By.id("appbar-guide-button"),"MenuButton");
    private Label lblLikedMenu = new Label(By.xpath("//span[@class='yt-valign-container']//span[@class='thumb guide-likes-playlist-icon yt-sprite']"),"LikedVideoLink");

    public LikeVideoPage(){super(By.id("watch-header"), "LikePage");}
    public void PressLike() {
        btnLike.click();
    }
    public void MenuLike(){
        btnMenu.click();

    }
    public void LikedVideosClick(){
        lblLikedMenu.click();
    }
}
