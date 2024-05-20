import org.junit.jupiter.api.Test;
import steps.OpenPageSteps;

public class LoginTest extends BaseTest {

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


}
