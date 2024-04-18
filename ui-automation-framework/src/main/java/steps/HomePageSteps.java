package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import org.openqa.selenium.WebElement;

public class HomePageSteps {

    private static final MyPageFactory PAGE_FACTORY = MyPageFactoryProvider.getInstance();

    private HomePage homePage() {
        return PAGE_FACTORY.on(HomePage.class);
    }

    public HomePageSteps acceptPrivacyModal() {
        homePage().acceptPrivacySettingButton().waitUntil(WebElement::isDisplayed).click();
        return this;
    }

    public SearchSteps clickSearchButton() {
        homePage().searchIcon().click();
        return new SearchSteps();
    }

    public LoginSteps clickOnAccountIcon() {
        homePage().accountIcon().click();
        return new LoginSteps();
    }


}
