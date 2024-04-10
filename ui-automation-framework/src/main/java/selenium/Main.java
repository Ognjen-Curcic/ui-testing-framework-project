package selenium;

import config.Environment;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

public class Main {

    public static void main(String[] args) {

        Environment environment = ConfigFactory.create(Environment.class);

        WebDriverFactory webDriverFactory = new WebDriverFactory();

        webDriverFactory.initialize();

        WebDriver driver = webDriverFactory.get();

        String URL = environment.homepage();
        driver.get(URL);

        webDriverFactory.end();
    }

}
