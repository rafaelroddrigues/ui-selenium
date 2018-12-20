package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Chrome {

    private static ChromeDriver driver;

    public static ChromeDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            if ("true".equals(String.valueOf(System.getProperty("browser.mobile")))) {
                Map<String, String> mobileEmulation = new HashMap<>();
                mobileEmulation.put("deviceName", "Nexus 5");

                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("mobileEmulation", mobileEmulation);
                options.addArguments("window-size=360,728");

                driver = new ChromeDriver(options);
            } else {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
            }
        }

        return driver;
    }

}
