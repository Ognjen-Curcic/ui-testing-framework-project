package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface HomePage extends ExtendedWebPage {

    @Description("Accept privacy settings button")
    @FindBy("//button[@id='onetrust-accept-btn-handler']")
    ExtendedMyWebElement acceptPrivacySettingButton();

    @Description("Account icon on header menu")
    @FindBy("//li[contains(@class, 'account')]")
    ExtendedMyWebElement accountIcon();

    @Description("Cart icon on header menu")
    @FindBy("//li[contains(@class, 'cart')]")
    ExtendedMyWebElement cartIcon();

    @Description("Search icon on header menu")
    @FindBy("//li[contains(@class, 'search')]")
    ExtendedMyWebElement searchIcon();


}
