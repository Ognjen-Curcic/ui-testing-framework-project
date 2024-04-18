package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchResultsPage;
import org.assertj.core.api.Assertions;

public class SearchResultsPageSteps {

    private static final MyPageFactory PAGE_FACTORY = MyPageFactoryProvider.getInstance();

    private SearchResultsPage searchResultsPage() {
        return PAGE_FACTORY.on(SearchResultsPage.class);
    }

    public void verifyNumberOfDisplayedProducts(int numProducts) {
        int actualProducts = searchResultsPage().productList().size();
        Assertions.assertThat(actualProducts).as("Number of products displayed is incorrect").isEqualTo(numProducts);
    }

}
