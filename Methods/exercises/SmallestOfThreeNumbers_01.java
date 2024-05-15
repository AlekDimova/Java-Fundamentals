package methods.exercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(number1, number2, number3);
    }

    public static void printSmallestNumber (int n1, int n2, int n3) {
        //if first number is the smallest
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        }
        //if second number is the smallest
        else if (n2 < n1 && n2 < n3) {
            System.out.println(n2);
        }
        //if third number is the smallest
        else {
            System.out.println(n3);
        }
    }
}
