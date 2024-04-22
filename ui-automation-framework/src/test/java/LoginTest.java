import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import selenium.WebDriverFactory;
import steps.OpenPageSteps;

public class LoginTest extends BaseTest{
    @BeforeAll
    public static void setUp() {
        BaseTest.setupAll();
    }

    @Test
    public void testEmptyEmailAndPassword() {
        new OpenPageSteps()
                .openHomePage()
                .acceptPrivacyModal()
                .clickOnAccountIconForLogin()
                .clickSignInButtonInAccountSidebar()
                .enterEmail("")
                .enterPassword("")
                .clickSignInButtonInSignInSidebar();
    }

    @Test
    public void testValidEmailAndPassword() {
        new OpenPageSteps()
                .openHomePage()
                .acceptPrivacyModal()
                .clickOnAccountIconForLogin()
                .clickSignInButtonInAccountSidebar()
                .enterEmail("ognjen00@gmail.com")
                .enterPassword("GridDynamics00")
                .clickSignInButtonInSignInSidebar();
    }

    @AfterEach
    public void tearDown() {
        WebDriverFactory.driver.quit();
    }

}
