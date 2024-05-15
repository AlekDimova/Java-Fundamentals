package dataTypesAndVariables.exercises;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;

        while (number > 0) {
            //1. We took the last digit
            int lastDigit = number % 10;
            //2. sum digits
            sumDigits += lastDigit; //sumDigits = sumDigits + lastDigit;
            //3. remove the taken digit from the number
            number = number / 10;  //number /= 10;
        }

        System.out.println(sumDigits);

    }
}
