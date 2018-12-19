package page;

import browser.Chrome;
import org.openqa.selenium.chrome.ChromeDriver;

import static espera.Espera.esperaSpinBarSumir;

public abstract class Page {

    protected ChromeDriver driver = Chrome.getDriver();

    public void goTo() {
        driver.get(getUrl());
    }

    public abstract String getUrl();

    public abstract String getName();

    public boolean textExists(String text) {
        //esperaSpinBarSumir();

        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return driver.getPageSource().contains(text);
    }
}
