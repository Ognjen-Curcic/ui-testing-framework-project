package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchSidebar;

public class SearchSteps {

    private static final MyPageFactory PAGE_FACTORY = MyPageFactoryProvider.getInstance();

    private SearchSidebar searchSidebar() {
        return PAGE_FACTORY.on(SearchSidebar.class);
    }

    public SearchSteps inputSearchTerm(String term) {
        searchSidebar().searchInputField().sendKeys(term);
        return this;
    }

    public SearchResultsPageSteps clickSearchIcon() throws InterruptedException {
        searchSidebar().searchButton().click();
        Thread.sleep(5000);
        return new SearchResultsPageSteps();
    }

}
