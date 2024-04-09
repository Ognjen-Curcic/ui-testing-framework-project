package config;

import org.aeonbits.owner.Config;

public interface Environment extends Config {

    @Key("homepage.url")
    String homepage();

}
