package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchResultsPage;
import htmlelements.pages.SearchSidebar;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.WebDriverFactory;

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
