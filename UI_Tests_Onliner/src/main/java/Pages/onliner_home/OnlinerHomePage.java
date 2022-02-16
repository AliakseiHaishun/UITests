package Pages.onliner_home;

import Pages.base.BasePage;
import Pages.catalog_page.CatalogPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerHomePage extends BasePage {
    public OnlinerHomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open catalog page")
    public CatalogPage clickingCatalog () {
        By catalogBtn = By.xpath("//li[@class = 'b-main-navigation__item'][1]" +
                        "/a[@class = 'b-main-navigation__link']" +
                        "/span[@class = 'b-main-navigation__text']");
        WebElement btnFind = driver.findElement(catalogBtn);
        waitElementsIsVisible(btnFind).click();
        return new CatalogPage(driver);
    }

}
