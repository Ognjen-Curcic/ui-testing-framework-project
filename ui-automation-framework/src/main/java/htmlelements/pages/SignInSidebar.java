package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface SignInSidebar extends ExtendedWebPage {

    @Description("Email input field")
    @FindBy("//input[contains(@class, 'form-input-username')]")
    ExtendedMyWebElement emailInputField();

    @Description("Password input field")
    @FindBy("//input[contains(@class, 'form-input-password')]")
    ExtendedMyWebElement passwordInputField();

    @Description("Sign In Button")
    @FindBy("//button[@class='btn btn-primary qa-btn-login   btn-block']")
    ExtendedMyWebElement signInButton();

    @Description("Sign In Error Message")
    @FindBy("//div[contains(@class, '_error-msg-headline')]")
    ExtendedMyWebElement signInErrorMessage();

}
