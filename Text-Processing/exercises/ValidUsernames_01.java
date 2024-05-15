package textProcessing.exercises;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // "sh, too_long_username, !lleg@l ch@rs
        String[] usernames = input.split(", "); // ["sh", "too_long_username", "!lleg@l ch@rs"]

        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUsername (String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;
    }

}
