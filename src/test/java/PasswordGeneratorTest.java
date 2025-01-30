import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordGeneratorTest {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    @Test
    void generateRandomPassword_expectRandomPassword_WhenPasswordIsSecure() {
        String password = PasswordGenerator.generateRandomPassword();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) hasUppercase = true;
            if (Character.isLowerCase(character)) hasLowercase = true;
            if (Character.isDigit(character)) hasDigit = true;
            if ("!@#$%^&*()-_=+".indexOf(character) >= 0) hasSpecialChar = true;
        }

        assertTrue(hasUppercase);
        assertTrue(hasLowercase);
        assertTrue(hasDigit);
        assertTrue(hasSpecialChar);

        System.out.println(GREEN + "generateRandomPassword passed" + RESET);
    }
}
