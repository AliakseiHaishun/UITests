package Pages.catalog_page;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    protected final By computersAndNetworkBy = By.xpath("//li[@class = 'catalog-navigation-classifier__item '][2]");

    public CatalogPage clickingComputersAndNetworkBtn () {
        WebElement computersAndNetworkBtn = driver.findElement(computersAndNetworkBy);
        waitElementsIsVisible(computersAndNetworkBtn).click();
        return this;
    }

    public boolean catalogElementsArguments (By element) {
        boolean bln = false;
        if(driver.findElement(element).isDisplayed()) {
            bln = true;
        }
        return bln;
    }
}
