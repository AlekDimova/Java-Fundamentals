package methods.exercises;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printVowelsCount(text);
    }

    public static void printVowelsCount (String text) {
        //vowels numbers: a, e, i, o, u, A, E, I, O, U
        //"Alex".toLowerCase() -> "desislava"
        //"alex".toUpperCase() -> "DESISLAVA"

        int countVowels = 0;
        for (char symbol :  text.toLowerCase().toCharArray()) {
            //check if the letter is a vowel
            if (symbol == 'a'|| symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                countVowels++;
            }
        }

        System.out.println(countVowels);

    }
}
