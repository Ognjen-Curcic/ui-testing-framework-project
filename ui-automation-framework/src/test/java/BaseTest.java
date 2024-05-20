import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;

public class BaseTest {

    WebDriver driver;
    static WebDriverFactory factory = new WebDriverFactory();

    @BeforeAll
    static void setupAll() {
        WebDriverFactory.initialize();
    }

    @BeforeEach
    void setup() {
        driver = factory.get();
    }

//    @AfterAll
//    public static void tearDown() {
//        WebDriverFactory.end();
//    }

}
