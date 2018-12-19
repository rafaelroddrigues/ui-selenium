package base;

import browser.Chrome;
import org.junit.After;
import org.junit.AfterClass;

public class BaseTest {

    @After
    public void tearDown() {
        Chrome.getDriver().get("https://www.google.com");
    }

    @AfterClass
    public static void clean() {
        Chrome.getDriver().quit();
    }

}
