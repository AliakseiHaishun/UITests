package tests.catalog_tests;

import com.google.j2objc.annotations.Property;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.openqa.selenium.By;
import providers.catalog_providers.CatalogElementsArgumentsProvider;
import providers.catalog_providers.ComputersAndNetworkArgumentsProvider;
import providers.catalog_providers.NamePriceAndAmountInfoArgumentsProvider;
import tests.base.BaseTest;

import java.util.List;

import static constants.Constants.urls.ONLINER_HOMEPAGE;

public class CatalogTests extends BaseTest {


    @ParameterizedTest
    @ArgumentsSource(CatalogElementsArgumentsProvider.class)
    public void catalogElementsTest1 (List<By> byList) {
        basePage.open(ONLINER_HOMEPAGE);
        Assertions.assertTrue(
                onlinerHomePage.clickingCatalog()
                        .catalogElementsArguments(byList));
    }

    @ParameterizedTest
    @ArgumentsSource(ComputersAndNetworkArgumentsProvider.class)
    public void computerAndNetworkElementsDisplayingTest1 (List<By> byList) {
        basePage.open(ONLINER_HOMEPAGE);
        Assertions.assertTrue(onlinerHomePage.clickingCatalog()
                .clickingComputersAndNetworkBtn()
                .displayingComputerAndNetworkElements(byList));
    }

    @ParameterizedTest
    @ArgumentsSource(NamePriceAndAmountInfoArgumentsProvider.class)
    public void NamePriceAndAmountInfoArgumentsTest1 (List<By> byList) {
        basePage.open(ONLINER_HOMEPAGE);
        Assertions.assertTrue(onlinerHomePage.clickingCatalog()
                .clickingComputersAndNetworkBtn()
                .movingToComponentsList()
                .namePriceAndAmountInfo(byList));
    }
}
