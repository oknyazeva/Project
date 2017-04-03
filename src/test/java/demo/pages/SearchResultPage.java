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
public class SearchResultPage extends BaseForm {
        private Label lblSearchResult = new Label(By.xpath("//div[@id='results']//a[contains(text(), 'QAZamb')]"), "ResultsChannelLink");
        public SearchResultPage(){super(By.id("results"), "SearchResultPage");}

        public void GotoChannel() {
            lblSearchResult.click();
        }

    public List<WebElement> list() {
        WebDriver driver = Browser.getInstance().getDriver();
        return driver.findElements(By.className("yt-lockup-title"));
    }


}
