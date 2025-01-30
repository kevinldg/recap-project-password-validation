public class PasswordValidation {
    public static void main(String[] args) {}

    public static boolean isPasswordLongEnough(String password) {
        return password.length() >= 8;
    }

    public static boolean isPasswordContainingDigits(String password) {
        for (char character : password.toCharArray()) {
            if (Character.isDigit(character)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPasswordContainingUpperAndLowerCase(String password) {
        boolean isContainingUppercase = false;
        boolean isContainingLowercase = false;

        for (char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) {
                isContainingUppercase = true;
            }

            if (Character.isLowerCase(character)) {
                isContainingLowercase = true;
            }

            if (isContainingUppercase && isContainingLowercase) {
                return true;
            }
        }

        return false;
    }

    public static boolean isPasswordWeak(String password) {
        String[] WEAK_PASSWORDS = {
                "Password1", "Aa345678", "Abcdefg1", "Test1234", "Qwerty12",
                "Letmein1!", "Monkey12", "Football1", "Admin123", "TempPass1"
        };

        for (String weakPassword : WEAK_PASSWORDS) {
            if (weakPassword.equals(password)) {
                return true;
            }
        }

        return false;
    }
}
