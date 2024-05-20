import org.junit.jupiter.api.Test;
import steps.OpenPageSteps;

public class SearchTest extends BaseTest {

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

}
