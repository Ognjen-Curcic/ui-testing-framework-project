
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;

public class BaseTest {

    WebDriver driver;
    static WebDriverFactory factory = new WebDriverFactory();

    @BeforeAll
    static void setupAll() {
        factory.initialize();
    }

    @BeforeEach
    void setup() {
        driver = factory.get();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
