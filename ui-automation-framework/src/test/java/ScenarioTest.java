import data.ContextConstants;
import data.ScenarioContext;
import org.junit.jupiter.api.Test;
import steps.OpenPageSteps;
import utils.RandomUtils;

public class ScenarioTest extends BaseTest{

    @Test
    public void scenarioTest() throws InterruptedException {

        String randomEmail = RandomUtils.generateRandomEmail("example.com");
        ScenarioContext.getInstance().put(ContextConstants.EMAIL, randomEmail);

        new OpenPageSteps()
                .openHomePage()
                .acceptPrivacyModal()
                .clickOnAccountIconForCreateAccount()
                .clickCreateAccountButtonInAccountSidebar()
                .fillCreateAccountForm("Ogi", "Grid", "Password123", "Password123", "11000", "December", "24")
                .clickCreateAccountButtonInCreateAccountPage()
                .clickOnLogOutButton();



    }

}
