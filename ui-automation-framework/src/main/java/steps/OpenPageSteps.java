package steps;

import config.Environment;
import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import org.aeonbits.owner.ConfigFactory;


public class OpenPageSteps {

    Environment environment = ConfigFactory.create(Environment.class);

    private static final MyPageFactory PAGE_FACTORY = MyPageFactoryProvider.getInstance();

    private HomePage homePage() {
        return PAGE_FACTORY.on(HomePage.class);
    }

    public HomePageSteps openHomePage() {
        homePage().open(environment.homepage());
        return new HomePageSteps();
    }

}
