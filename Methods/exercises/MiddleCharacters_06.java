package methods.exercises;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacters(text);

    }
    public static void printMiddleCharacters (String text) {
        if (text.length() % 2 != 0) {
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
        else {
            int indexOfFirstMiddleCharacter = text.length() / 2 - 1;
            int indexOfSecondMiddleCharacter = text.length() / 2;

            System.out.print(text.charAt(indexOfFirstMiddleCharacter));
            System.out.print(text.charAt(indexOfSecondMiddleCharacter));
        }
    }
}
