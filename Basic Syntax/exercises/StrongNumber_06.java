package basicSyntax.exercises;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int sumFact = 0; //sum of factorials
        while (number > 0) { //stop: number <= 0
            int lastDigit = number % 10;//we took the last digit
            //we found factorial of the lastDigit
            int fact = 1; //factorial of the current digit
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sumFact += fact; //we sum the received factorial form the digit
            number = number / 10; //deleting the last digit
        }

        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
