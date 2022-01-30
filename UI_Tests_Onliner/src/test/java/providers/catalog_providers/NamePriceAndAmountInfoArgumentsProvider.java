package providers.catalog_providers;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.openqa.selenium.By;

import java.util.stream.Stream;

public class NamePriceAndAmountInfoArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[1]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[2]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[3]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[4]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[5]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[6]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[7]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[8]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[9]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[10]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[11]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[12]")),
                Arguments.of(By.xpath("//div[@class = 'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']//a[13]"))
                );
    }
}
