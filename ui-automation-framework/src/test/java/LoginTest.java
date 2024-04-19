import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import selenium.WebDriverFactory;
import steps.OpenPageSteps;

public class LoginTest {
    @BeforeClass
    public static void setUp() {
        WebDriverFactory.initialize();
    }

//    @Test
//    public void testEmptyEmailAndPassword() {
//        new OpenPageSteps()
//                .openHomePage()
//                .acceptPrivacyModal()
//                .clickOnAccountIcon()
//                .clickSignInButtonInAccountSidebar()
//                .enterEmail("")
//                .enterPassword("")
//                .clickSignInButtonInSignInSidebar();
//    }

//    @Test
//    public void testValidEmailAndPassword() {
//        new OpenPageSteps()
//                .openHomePage()
//                .acceptPrivacyModal()
//                .clickOnAccountIcon()
//                .clickSignInButtonInAccountSidebar()
//                .enterEmail("ognjen00@gmail.com")
//                .enterPassword("GridDynamics00")
//                .clickSignInButtonInSignInSidebar();
//    }

    @AfterClass
    public static void tearDown() {
        WebDriverFactory.driver.quit();
    }

}
