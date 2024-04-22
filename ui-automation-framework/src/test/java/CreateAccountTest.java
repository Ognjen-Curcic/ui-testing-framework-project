import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import selenium.WebDriverFactory;
import steps.OpenPageSteps;

public class CreateAccountTest extends BaseTest {

    @BeforeAll
    public static void setUp() {
        BaseTest.setupAll();
    }

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

    @AfterEach
    public void tearDown() {
        WebDriverFactory.driver.quit();
    }

}
