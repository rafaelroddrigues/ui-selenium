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

            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", "Nexus 5");

            //String videoPath = System.getProperty("user.dir") + "\\src\\main\\resources\\videoMock.y4m";

            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("mobileEmulation", mobileEmulation);
            //options.addArguments("disable-infobars");
            options.addArguments("window-size=360,728");
            //options.addArguments("--disable-web-security");
            //options.addArguments("--use-fake-ui-for-media-stream=1");
            //options.addArguments("--use-fake-device-for-media-stream");
            //options.addArguments("--use-file-for-fake-video-capture=" + videoPath);

            driver = new ChromeDriver(options);
        }

        return driver;
    }

}
