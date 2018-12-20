package page;

import browser.Chrome;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Page {

    protected ChromeDriver driver = Chrome.getDriver();

    public void goTo() {
        driver.get(getUrl());
    }

    public abstract String getUrl();

}
