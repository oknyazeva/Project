package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import webdriver.BaseForm;
import webdriver.elements.TextBox;

/**
 * Created by o_knyazeva on 4/2/17.
 */
public class SearchVideoPage extends BaseForm {
    private TextBox txbSearch = new TextBox(By.id("masthead-search-term"), "SearchTextBox");
    public SearchVideoPage(){super(By.id("appbar-nav"), "SearchVideoPage");}

    public void EnterSrcText(){
        txbSearch.setText("QAZamb");
        txbSearch.sendKeys(Keys.ENTER);
    }
}
