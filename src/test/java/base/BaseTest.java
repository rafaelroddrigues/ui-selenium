package base;

import browser.Chrome;
import org.junit.After;
import org.junit.AfterClass;

public class BaseTest {

    @AfterClass
    public static void clean() {
        Chrome.getDriver().quit();
    }

}
