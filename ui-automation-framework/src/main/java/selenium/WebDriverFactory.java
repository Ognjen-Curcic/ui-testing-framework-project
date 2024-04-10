package selenium;
import config.RunConfiguration;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    private WebDriver driver;

    RunConfiguration runConfiguration = ConfigFactory.create(RunConfiguration.class);

    private void createChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/ocurcic/Documents/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        setBrowserSize();
    }

    private void createFirefoxDriver() {
        FirefoxDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        setBrowserSize();
    }
    public void initialize(){

        switch (runConfiguration.browserName()){
            case "Google Chrome":
                createChromeDriver();
                break;
            case "Mozilla Firefox":
                createFirefoxDriver();
                break;
            default:
                System.out.println("No browser specified, defaulting to Google Chrome");
                createChromeDriver();
        }
    }
    public void end(){
        driver.quit();
    }
    public WebDriver get(){
        return driver;
    }

    private void setBrowserSize() {
        int width = runConfiguration.browserWidth();
        int height = runConfiguration.browserHeight();
        driver.manage().window().setSize(new Dimension(width, height));
    }


}
