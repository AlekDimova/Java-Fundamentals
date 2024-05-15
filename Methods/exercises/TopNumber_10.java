package methods.exercises;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            boolean isSum = isSumOfDigitsIsDivisibleBy8(number);
            boolean isContains = isContainsOddDigit(number);
            if (isSum && isContains) {
                System.out.println(number);
            }
        }
    }
    public static boolean isSumOfDigitsIsDivisibleBy8 (int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10; //last digit
            sum += lastDigit; //sum the last digit
            number = number / 10; //we delete the last digit
        }
        return sum % 8 == 0;
    }
    public static boolean isContainsOddDigit (int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
}
