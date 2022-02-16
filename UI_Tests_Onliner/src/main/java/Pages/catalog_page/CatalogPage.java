package Pages.catalog_page;

import Pages.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening [ComputersAndNetwork] ")
    public CatalogPage clickingComputersAndNetworkBtn () {
        By computersAndNetworkBy = By.xpath("//li[@class = 'catalog-navigation-classifier__item '][2]");
        WebElement computersAndNetworkBtn = driver.findElement(computersAndNetworkBy);
        waitElementsIsVisible(computersAndNetworkBtn).click();
        return this;
    }

    @Step("Verifying catalog elements")
    public boolean catalogElementsArguments (List<By> byList) {
        boolean bln = false;
        for (int i = 0; i<byList.size(); i++ ) {
            if (driver.findElement(byList.get(i)).isDisplayed()) {
                bln = true;
            }
        }
        return bln;
    }

    @Step("Opening catalogComponents list ")
    public CatalogPage movingToComponentsList() {
        By catalogComponentsListBy =
                By.xpath("//div[@data-id= '2']/div[@class = 'catalog-navigation-list__aside']" +
                        "/div[@class = 'catalog-navigation-list__aside-list']" +
                        "/div[@class = 'catalog-navigation-list__aside-item'][2]");
        Actions action = new Actions(driver);
        WebElement componentsList = driver.findElement(catalogComponentsListBy);
        action.moveToElement(componentsList).build().perform();
        return this;
    }

    @Step("Verifying name, price, and amount elements")
    public boolean namePriceAndAmountInfo (List<By> byList) {
        boolean bln = false;
        for (int i = 0; i < byList.size(); i++){

            if(driver.findElement(byList.get(i)).getText() != null) {
                bln = true;
            } else {
                bln = false;
            }
        }
        return bln;
    }

    @Step("Verifying computer and network elements")
    public boolean displayingComputerAndNetworkElements (List<By> byList) {
        boolean bln = false;
        for (int i = 0; i<byList.size(); i++ ) {
            if (driver.findElement(byList.get(i)).isDisplayed()) {
                bln = true;
            }
        }
        return bln;
    }
}
