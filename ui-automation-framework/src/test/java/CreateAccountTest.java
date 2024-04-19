import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import selenium.WebDriverFactory;
import steps.OpenPageSteps;

public class CreateAccountTest {

    @BeforeClass
    public static void setUp() {
        WebDriverFactory.initialize();
    }

    @Test
    public void testSignInFunctionality() throws InterruptedException {
        new OpenPageSteps()
                .openHomePage()
                .acceptPrivacyModal()
                .clickOnAccountIcon()
                .clickCreateAccountButtonInAccountSidebar()
                .fillCreateAccountForm("Ognjen", "GD", "GridDynamics22", "GridDynamics22", "10017", "January", "24")
                .clickCreateAccountButtonInCreateAccountPage();
    }

    @AfterClass
    public static void tearDown() {
        WebDriverFactory.driver.quit();
    }

}
