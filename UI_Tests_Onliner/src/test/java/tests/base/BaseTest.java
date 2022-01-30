package tests.base;

import Pages.base.BasePage;
import Pages.catalog_page.CatalogNavigationList;
import Pages.catalog_page.CatalogPage;
import Pages.onliner_home.OnlinerHomePage;
import commons.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static commons.Config.CLEAR_COOKIES_AND_STORAGE;
import static commons.Config.HOLD_BROWSER_OPEN;


public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected OnlinerHomePage onlinerHomePage = new OnlinerHomePage(driver);
    protected CatalogPage catalogPage = new CatalogPage(driver);
    protected CatalogNavigationList catalogNavigationList = new CatalogNavigationList(driver);

    @AfterEach
    public void clearCookiesAndLocalStorage () {
        if(CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterEach
    public void close() {
        if(HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
