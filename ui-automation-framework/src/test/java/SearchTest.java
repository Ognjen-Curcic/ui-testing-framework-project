import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import selenium.WebDriverFactory;
import steps.OpenPageSteps;

public class SearchTest extends BaseTest{
    @BeforeAll
    public static void setUp() {
        BaseTest.setupAll();
    }

    @Test
    public void testSearchFunctionality() throws InterruptedException {
        new OpenPageSteps()
                .openHomePage()
                .acceptPrivacyModal()
                .clickSearchButton()
                .inputSearchTerm("0116_6494_432")
                .clickSearchIcon()
                .verifyNumberOfDisplayedProducts(1);
    }

    @AfterEach
    public void tearDown() {
        WebDriverFactory.driver.quit();
    }

}
