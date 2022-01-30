package providers.catalog_providers;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.openqa.selenium.By;

import java.util.stream.Stream;

public class CatalogElementsArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][1]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][2]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][3]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][4]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][5]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][6]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][7]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][8]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][9]")),
                Arguments.of(By.xpath("//li[@class = 'catalog-navigation-classifier__item '][10]"))
        );
    }
}
