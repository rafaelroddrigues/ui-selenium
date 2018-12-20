package org.cucumber.base;

import browser.Chrome;
import org.junit.After;
import org.junit.AfterClass;

public class BaseStep {

    @AfterClass
    public static void clean() {
        Chrome.getDriver().quit();
    }

}
