package providers.catalog_providers;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.stream.Stream;

public class CatalogElementsArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][1]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][2]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][3]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][4]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][5]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][6]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][7]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][8]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][9]"),
                        By.xpath("//li[@class = 'catalog-navigation-classifier__item '][10]")
                ))
        );
    }
}

