package providers.catalog_providers;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.stream.Stream;

public class NamePriceAndAmountInfoArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[1]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[2]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[3]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[4]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[5]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[6]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[7]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[8]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[9]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[10]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[11]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[12]"),
                                By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[13]")))
                );
    }
}
