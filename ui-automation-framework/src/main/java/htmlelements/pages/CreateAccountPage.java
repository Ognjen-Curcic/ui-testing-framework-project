package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface CreateAccountPage extends ExtendedWebPage {

    @Description("Email input field")
    @FindBy("//input[@autocomplete = 'email']")
    ExtendedMyWebElement emailInputField();

    @Description("First Name field")
    @FindBy("//input[contains(@class,'form-input-firstname autofill-detect')]")
    ExtendedMyWebElement firstNameField();

    @Description("Last Name field")
    @FindBy("//input[contains(@class,'form-input-lastname autofill-detect')]")
    ExtendedMyWebElement lastNameField();

    @Description("Password field")
    @FindBy("//input[@placeholder='Password']")
    ExtendedMyWebElement passwordField();

    @Description("Confirm password field")
    @FindBy("//input[@placeholder='Confirm Password']")
    ExtendedMyWebElement confirmPasswordField();

    @Description("Zip Code field")
    @FindBy("//input[contains(@class,'form-input-postal-code autofill-detect')]")
    ExtendedMyWebElement zipCodeField();

    @Description("Month Select field")
    @FindBy("//select[@aria-label='Month']")
    ExtendedMyWebElement monthDropdown();

    @Description("Day Select field")
    @FindBy("//select[@aria-label='Day']")
    ExtendedMyWebElement dayDropdown();

    @Description("Terms and Conditions Button")
    @FindBy("//div[@data-test-checkbox='acceptTerms']")
    ExtendedMyWebElement termsAndConditionsButton();

    @Description("Create Account button")
    @FindBy("//button[@data-test-btn='register']")
    ExtendedMyWebElement createAccountButtonInCreateAccountPage();

}
