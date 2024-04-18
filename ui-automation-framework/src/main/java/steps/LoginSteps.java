package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.AccountSidebar;
import htmlelements.pages.SignInSidebar;

public class LoginSteps {

    private static final MyPageFactory PAGE_FACTORY = MyPageFactoryProvider.getInstance();

    private AccountSidebar accountSidebar() {
        return PAGE_FACTORY.on(AccountSidebar.class);
    }

    private SignInSidebar signInSidebar() {
        return PAGE_FACTORY.on(SignInSidebar.class);
    }

    public LoginSteps clickSignInButtonInAccountSidebar() {
        accountSidebar().signInButton().click();
        return new LoginSteps();
    }

    public LoginSteps enterEmail(String email) {
        signInSidebar().emailInputField().sendKeys(email);
        return new LoginSteps();
    }

    public LoginSteps enterPassword(String password) {
        signInSidebar().passwordInputField().sendKeys(password);
        return new LoginSteps();
    }

    public LoginSteps clickSignInButtonInSignInSidebar() {
        signInSidebar().signInButton().click();
        return new LoginSteps();
    }
}
