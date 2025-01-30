import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+";
    private static final String ALL_CHARS = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARS;
    private static final int PASSWORD_LENGTH = 8;

    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {}

    public static String generateRandomPassword() {
        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for(int i = 0; i < PASSWORD_LENGTH; i++) {
            char randomCharacter = ALL_CHARS.charAt(random.nextInt(ALL_CHARS.length()));
            password.append(randomCharacter);

            if (Character.isUpperCase(randomCharacter)) hasUppercase = true;
            if (Character.isLowerCase(randomCharacter)) hasLowercase = true;
            if (Character.isDigit(randomCharacter)) hasDigit = true;
            if (SPECIAL_CHARS.indexOf(randomCharacter) >= 0) hasSpecialCharacter = true;
        }

        if (!hasUppercase) password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        if (!hasLowercase) password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        if (!hasDigit) password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        if (!hasSpecialCharacter) password.append(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));

        return password.toString();
    }
}
