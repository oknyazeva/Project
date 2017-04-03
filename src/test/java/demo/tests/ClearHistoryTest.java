package demo.tests;

import demo.pages.*;
import org.testng.Assert;
import webdriver.BaseTest;

/**
 * Created by o_knyazeva on 4/1/17.
 */
public class ClearHistoryTest extends BaseTest{

    @Override
    public void runTest() {

        logStep();
        HistoryButtonPage fullscr = new HistoryButtonPage();
        fullscr.FullScreen();

        logStep();
        HistoryButtonPage btnHistory = new HistoryButtonPage();
        btnHistory.HistoryBtn();

        logStep();
        HistoryPage btnClHi = new HistoryPage();
        btnClHi.ClearHistoryBtn();

        logStep();
        HistoryPage btnConf = new HistoryPage();
        btnConf.Submit();

        logStep();
        HistoryPage listEl = new HistoryPage();
        Assert.assertTrue(listEl.list().isEmpty());

    }
}
