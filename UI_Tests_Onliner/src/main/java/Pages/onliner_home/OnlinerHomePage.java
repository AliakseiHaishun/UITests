package Pages.onliner_home;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerHomePage extends BasePage {
    public OnlinerHomePage(WebDriver driver) {
        super(driver);
    }
    private final By catalogBtn =
            By.xpath("//li[@class = 'b-main-navigation__item'][1]/a[@class = 'b-main-navigation__link']/span[@class = 'b-main-navigation__text']");

    public OnlinerHomePage clickingCatalog () {
        WebElement btnFind = driver.findElement(catalogBtn);
        waitElementsIsVisible(btnFind).click();
        return this;
    }

}
