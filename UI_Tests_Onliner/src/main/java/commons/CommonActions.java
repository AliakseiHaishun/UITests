package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static commons.Config.PLATFORM_AND_BROWSER;
import static constants.Constants.IMPLICIT_WAIT;

public class CommonActions {
public static WebDriver createDriver() {

    /*
    * WebDriver settings
     */
    WebDriver driver = null;
    switch (PLATFORM_AND_BROWSER) {
        case "windows_chrome":
            System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
            driver = new ChromeDriver();
            break;
        default:
            System.out.println("Доработать Assert.fail()");
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
    return driver;
}

}
