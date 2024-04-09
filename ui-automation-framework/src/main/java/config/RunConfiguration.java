package config;

import org.aeonbits.owner.Config;

public interface RunConfiguration extends Config {

    @Key("browser.name")
    String browserName();
    @Key("browser.width")
    int browserWidth();
    @Key("browser.height")
    int browserHeight();
    @Key("selenium.version")
    String seleniumVersion();

}
