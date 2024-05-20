import org.junit.jupiter.api.Test;
import steps.OpenPageSteps;

public class CreateAccountTest extends BaseTest {

    @Test
    public void testSignInFunctionality() throws InterruptedException {
        new OpenPageSteps()
                .openHomePage()
                .acceptPrivacyModal()
                .clickOnAccountIconForCreateAccount()
                .clickCreateAccountButtonInAccountSidebar()
                .fillCreateAccountForm("Ognjen", "GD", "GridDynamics22", "GridDynamics22", "10017", "January", "24")
                .clickCreateAccountButtonInCreateAccountPage();
    }

}
