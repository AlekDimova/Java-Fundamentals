package methods.exercises;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        //1. to check if the password length is valid
        boolean isValidLength = isValidLength(password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        //2. to check is the content is valid
        boolean isValidContent = isValidContent(password);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        //3. to check is the number of the digits is valid
        boolean isValidCount = isValidCountDigits(password);
        if (!isValidCount) {
            System.out.println("Password must have at least 2 digits");
        }

        //4. to check if the password is fully valid
        if (isValidLength && isValidContent && isValidCount) {
            System.out.println("Password is valid");
        }
    }
    public static boolean isValidLength (String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isValidContent (String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidCountDigits (String password) {
        int countDigits = 0;
        for (char symbol :  password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        return countDigits >= 2;
    }
}
