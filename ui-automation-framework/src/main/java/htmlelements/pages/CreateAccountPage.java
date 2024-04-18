package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface CreateAccountPage {

    @Description("Email input field")
    @FindBy("//input[contains(@class,'form-input-login autofill-detect')]")
    ExtendedMyWebElement emailInputField();

    @Description("First Name field")
    @FindBy("//input[contains(@class,'form-input-firstname autofill-detect')]")
    ExtendedMyWebElement firstNameField();

    @Description("Last Name field")
    @FindBy("//input[contains(@class,'form-input-lastname autofill-detect')]")
    ExtendedMyWebElement lastNameField();

    @Description("Password field")
    @FindBy("//input[contains(@class, 'form-input-password autofill-detect')]")
    ExtendedMyWebElement passwordField();

    @Description("Confirm password field")
    @FindBy("//input[contains(@class,'confirm-password autofill-detect')]")
    ExtendedMyWebElement confirmPasswordField();

    @Description("Zip Code field")
    @FindBy("//input[contains(@class,'form-input-postal-code autofill-detect')]")
    ExtendedMyWebElement zipCodeField();

    @Description("Month Select field")
    @FindBy("//select[@aria-label='Month']")
    ExtendedMyWebElement monthSelectField();

    @Description("Day Select field")
    @FindBy("//select[@aria-label='Day']")
    ExtendedMyWebElement daySelectField();

    @Description("Terms and Conditions Button")
    @FindBy("//label[@class='aeo-checkbox-label clickable']")
    ExtendedMyWebElement termsAndConditionsButton();

    @Description("Create Account button")
    @FindBy("//button[contains(@class, 'qa-btn-register  btn-block')]")
    ExtendedMyWebElement createAccountButtonInCreateAccountPage();

}
