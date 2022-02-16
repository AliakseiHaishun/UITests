package providers.catalog_providers;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.openqa.selenium.By;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ComputersAndNetworkArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        By.xpath("//div[@data-id= '2']/div[@class = 'catalog-navigation-list__aside']/div[@class = 'catalog-navigation-list__aside-list']/div[@class = 'catalog-navigation-list__aside-item'][1]"),
                        By.xpath("//div[@data-id= '2']/div[@class = 'catalog-navigation-list__aside']/div[@class = 'catalog-navigation-list__aside-list']/div[@class = 'catalog-navigation-list__aside-item'][2]"),
                        By.xpath("//div[@data-id= '2']/div[@class = 'catalog-navigation-list__aside']/div[@class = 'catalog-navigation-list__aside-list']/div[@class = 'catalog-navigation-list__aside-item'][5]"),
                        By.xpath("//div[@data-id= '2']/div[@class = 'catalog-navigation-list__aside']/div[@class = 'catalog-navigation-list__aside-list']/div[@class = 'catalog-navigation-list__aside-item'][7]")
                ))
        );
    }

}
