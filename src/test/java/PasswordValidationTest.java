import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    @Test
    void isPasswordLongEnough_expectTrue_WhenPasswordLengthIsEight() {
        String password = "Start-01";
        boolean expected = true;
        boolean actual = PasswordValidation.isPasswordLongEnough(password);

        assertEquals(expected, actual);
        System.out.println(GREEN + "isPasswordLongEnough passed" + RESET);
    }

    @Test
    void isPasswordContainingDigits_expectTrue_WhenPasswordContainsANumber() {
        String password = "Start-01";
        boolean expected = true;
        boolean actual = PasswordValidation.isPasswordContainingDigits(password);

        assertEquals(expected, actual);
        System.out.println(GREEN + "isPasswordContainingDigits passed" + RESET);
    }

    @Test
    void isPasswordContainingUpperAndLowerCase_expectTrue_WhenPasswordContainsUpperAndLowerCase() {
        String password = "Start-01";
        boolean expected = true;
        boolean actual = PasswordValidation.isPasswordContainingUpperAndLowerCase(password);

        assertEquals(expected, actual);
        System.out.println(GREEN + "isPasswordContainingUpperAndLowerCase passed" + RESET);
    }

    @Test
    void isPasswordWeak_expectFalse_WhenPasswordIsNotWeak() {
        String password = "Start-01";
        boolean expected = false;
        boolean actual = PasswordValidation.isPasswordWeak(password);

        assertEquals(expected, actual);
        System.out.println(GREEN + "isPasswordContainingUpperAndLowerCase passed" + RESET);
    }
}
