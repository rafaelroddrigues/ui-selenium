package base;

import browser.Chrome;
import org.junit.AfterClass;

public class BaseStep {

    @AfterClass
    public static void clean() {
        Chrome.getDriver().quit();
    }

}
