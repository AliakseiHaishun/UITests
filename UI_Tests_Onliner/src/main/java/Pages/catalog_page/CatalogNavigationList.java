package Pages.catalog_page;

import Pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CatalogNavigationList extends BasePage {
    public CatalogNavigationList(WebDriver driver) {
        super(driver);
    }

    protected final By catalogComponentsListBy =
            By.xpath("//div[@data-id= '2']/div[@class = 'catalog-navigation-list__aside']" +
                    "/div[@class = 'catalog-navigation-list__aside-list']" +
                    "/div[@class = 'catalog-navigation-list__aside-item'][2]");

    public CatalogNavigationList movingToComponentsList() {
        Actions action = new Actions(driver);
        WebElement componentsList = driver.findElement(catalogComponentsListBy);
        action.moveToElement(componentsList).build().perform();
        return this;
    }

    public boolean namePriceAndAmountInfo (By element) {
        String string = driver.findElement(element).getText();
        Boolean bln = false;
        if (string != null) {
            bln = true;
            System.out.println(string);
        }
        return bln;
    }

    public boolean displayingComputerAndNetworkElements (By element) {
        boolean bln = false;
        if(driver.findElement(element).isDisplayed()) {
            bln = true;
        }
        return bln;
    }

}
