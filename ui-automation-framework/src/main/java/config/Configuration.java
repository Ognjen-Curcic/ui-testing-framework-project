package config;
import org.aeonbits.owner.ConfigFactory;

public class Configuration {

        public static void main(String[] args) {

                RunConfiguration runConfiguration = ConfigFactory.create(RunConfiguration.class);

                Environment environment = ConfigFactory.create(Environment.class);

                System.out.println(environment.homepage());
                System.out.println(runConfiguration.seleniumVersion());


        }
}
