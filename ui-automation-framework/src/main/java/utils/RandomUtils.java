package utils;

import java.util.Random;

public class RandomUtils {

    public static String generateRandomEmail(String domain) {

        StringBuilder email = new StringBuilder();
        Random random = new Random();

        // Here I am generating a random email prefix (before the @ sign)
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            email.append(randomChar);
        }

        // Here I chain "@" character and domain
        email.append("@").append(domain);

        return email.toString();
    }

}
