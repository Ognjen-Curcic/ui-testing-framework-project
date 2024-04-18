package htmlelements;

import config.RunConfiguration;
import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import io.qameta.htmlelements.statement.RetryStatement;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;

public class MyPageFactory {

    RunConfiguration configuration = ConfigFactory.create(RunConfiguration.class);

    public <T extends WebPage> T on(Class<T> webpage) {
        WebPageFactory webPageFactory = new WebPageFactory();
        webPageFactory.property(RetryStatement.TIMEOUT_KEY, String.valueOf(configuration.timeout()));
        return webPageFactory.get(getDriver(), webpage);
    }

    public WebDriver getDriver() {
        WebDriverFactory factory = new WebDriverFactory();
        return factory.get();
    }

}
