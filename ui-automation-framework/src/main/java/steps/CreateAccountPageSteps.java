package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.AccountSidebar;
import htmlelements.pages.CreateAccountPage;
import org.openqa.selenium.support.ui.Select;
import utils.RandomUtils;

public class CreateAccountPageSteps {

    private static final MyPageFactory PAGE_FACTORY = MyPageFactoryProvider.getInstance();

    private AccountSidebar accountSidebar() {
        return PAGE_FACTORY.on(AccountSidebar.class);
    }

    private CreateAccountPage createAccountPage() {
        return PAGE_FACTORY.on(CreateAccountPage.class);
    }

    public CreateAccountPageSteps clickCreateAccountButtonInAccountSidebar() throws InterruptedException {
        accountSidebar().createAccountButtonInAccountSidebar().click();
        Thread.sleep(5000);
        return new CreateAccountPageSteps();
    }

    public CreateAccountPageSteps fillCreateAccountForm(String firstName, String lastName, String password, String confirmPassword, String zipCode, String month, String day) throws InterruptedException {

        // Here I am making a randomEmail
        String randomEmail = RandomUtils.generateRandomEmail("mail.com");

        createAccountPage().emailInputField().sendKeys(randomEmail);
        createAccountPage().firstNameField().sendKeys(firstName);
        createAccountPage().lastNameField().sendKeys(lastName);
        createAccountPage().passwordField().sendKeys(password);
        createAccountPage().confirmPasswordField().sendKeys(confirmPassword);
        createAccountPage().zipCodeField().sendKeys(zipCode);

        // Here Month and Day should be Selected
        selectMonthAndDay(month, day);

        createAccountPage().termsAndConditionsButton().click();
        return new CreateAccountPageSteps();
    }

    public void clickCreateAccountButtonInCreateAccountPage() {
        createAccountPage().createAccountButtonInCreateAccountPage().click();
    }

    public void selectMonthAndDay(String month, String day) {
        Select monthDropdown = new Select(createAccountPage().monthDropdown());
        monthDropdown.selectByVisibleText(month);
        Select dayDropdown = new Select(createAccountPage().dayDropdown());
        dayDropdown.selectByVisibleText(day);
    }

}
