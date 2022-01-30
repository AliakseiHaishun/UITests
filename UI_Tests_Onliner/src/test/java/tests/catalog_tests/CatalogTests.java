package tests.catalog_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.openqa.selenium.By;
import providers.catalog_providers.CatalogElementsArgumentsProvider;
import providers.catalog_providers.ComputersAndNetworkArgumentsProvider;
import providers.catalog_providers.NamePriceAndAmountInfoArgumentsProvider;
import tests.base.BaseTest;

import static constants.Constants.urls.ONLINER_HOMEPAGE;

public class CatalogTests extends BaseTest {

    @ParameterizedTest
    @ArgumentsSource(CatalogElementsArgumentsProvider.class)
    public void catalogElementsTest (By element) {
        basePage.open(ONLINER_HOMEPAGE);
        onlinerHomePage.clickingCatalog();;
        Boolean bln = true;
        Assertions.assertEquals(catalogPage.
                catalogElementsArguments(element), bln);
    }

    @ParameterizedTest
    @ArgumentsSource(ComputersAndNetworkArgumentsProvider.class)
    public void computerAndNetworkElementsDisplayingTest (By element) {
        basePage.open(ONLINER_HOMEPAGE);
        onlinerHomePage.clickingCatalog();
        catalogPage.clickingComputersAndNetworkBtn();
        Boolean bln = true;
        Assertions.assertEquals(catalogNavigationList.displayingComputerAndNetworkElements(element), bln);
    }

    @ParameterizedTest
    @ArgumentsSource(NamePriceAndAmountInfoArgumentsProvider.class)
    public void NamePriceAndAmountInfoArgumentsTest (By element) {
        basePage.open(ONLINER_HOMEPAGE);
        onlinerHomePage.clickingCatalog();
        catalogPage.clickingComputersAndNetworkBtn();
        catalogNavigationList.movingToComponentsList();
        Assertions.assertTrue(catalogNavigationList.namePriceAndAmountInfo(element) != null);
    }


}
