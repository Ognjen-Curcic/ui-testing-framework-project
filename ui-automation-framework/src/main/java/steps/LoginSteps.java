package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.AccountSidebar;
import htmlelements.pages.LogInSidebar;

public class LoginSteps {

    private static final MyPageFactory PAGE_FACTORY = MyPageFactoryProvider.getInstance();

    private AccountSidebar accountSidebar() {
        return PAGE_FACTORY.on(AccountSidebar.class);
    }

    private LogInSidebar logInSidebar() {
        return PAGE_FACTORY.on(LogInSidebar.class);
    }

    public LoginSteps clickSignInButtonInAccountSidebar() {
        accountSidebar().signInButtonInAccountSidebar().click();
        return new LoginSteps();
    }

    public LoginSteps enterEmail(String email) {
        logInSidebar().emailInputField().sendKeys(email);
        return new LoginSteps();
    }

    public LoginSteps enterPassword(String password) {
        logInSidebar().passwordInputField().sendKeys(password);
        return new LoginSteps();
    }

    public void clickSignInButtonInSignInSidebar() {
        logInSidebar().signInButton().click();
    }
}
