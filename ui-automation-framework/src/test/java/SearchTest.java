import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import selenium.WebDriverFactory;
import steps.OpenPageSteps;

public class SearchTest {
    @BeforeClass
    public static void setUp() {
        WebDriverFactory.initialize();
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

    @AfterClass
    public static void tearDown() {
        WebDriverFactory.driver.quit();
    }

}
