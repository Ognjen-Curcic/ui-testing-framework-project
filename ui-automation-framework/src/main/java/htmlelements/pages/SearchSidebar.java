package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface SearchSidebar extends ExtendedWebPage {

    @Description("Search input field in sidebar")
    @FindBy("//input[contains(@class,'form-input-search')]")
    ExtendedMyWebElement searchInputField();

    @Description("Search button in sidebar")
    @FindBy("//button[contains(@class, 'search-btn')]")
    ExtendedMyWebElement searchButton();

}
