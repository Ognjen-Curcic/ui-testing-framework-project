package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface AccountSidebar extends ExtendedWebPage {

    @Description("Sign in button in sidebar")
    @FindBy("//button[contains(@class, 'qa-btn-signin')]")
    ExtendedMyWebElement signInButtonInAccountSidebar();

    @Description("Create an account button")
    @FindBy("//a[contains(@class,'qa-btn-register')]")
    ExtendedMyWebElement createAccountButtonInAccountSidebar();

}
