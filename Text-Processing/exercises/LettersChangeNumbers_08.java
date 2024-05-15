package textProcessing.exercises;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //"A12b s17G"
        String [] codes = input.split("\\s+");

        double totalSum = 0;
        for (String code : codes) {
            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f", totalSum);
    }
    //method that accepts the code and returns the modified number
    private static double getModifiedNumber (String code) {
        char letterBefore = code.charAt(0); //'A'
        char letterAfter = code.charAt(code.length() - 1); // 'b'

        double number = Double.parseDouble(code.replace(letterBefore, ' ') //" 12b"
                .replace(letterAfter, ' ') //" 12 "
                .trim()); //"12" -> 12

        number = modifyByLetterBefore(letterBefore, number);
        number = modifyByLetterAfter(letterAfter, number);
        return number;
    }

    private static double modifyByLetterAfter(char letterAfter, double number) {

        if (Character.isUpperCase(letterAfter)) {
            int positionUpperLetter = (int) letterAfter - 64;
            number = number - positionUpperLetter;
        } else {
            int positionLowerLetter = (int) letterAfter - 96;
            number = number + positionLowerLetter;
        }
        return number;
    }

    private static double modifyByLetterBefore(char letterBefore, double number) {
        if (Character.isUpperCase(letterBefore)) {
            int positionUpperLetter = (int) letterBefore - 64;
            number = number / positionUpperLetter;
        } else {
            int positionLowerCase = (int) letterBefore - 96;
            number = number * positionLowerCase; //number *= positionLowerCase;
        }
        return number;
    }
}
