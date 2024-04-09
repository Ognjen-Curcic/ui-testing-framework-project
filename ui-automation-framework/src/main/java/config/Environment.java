package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:src/main/resources/environment.properties",
                "classpath:environment.properties"})

public interface Environment extends Config {

    @Key("homepage.url")
    String homepage();

}
