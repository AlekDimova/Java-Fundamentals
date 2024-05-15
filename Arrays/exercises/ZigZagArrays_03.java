package arrays.exercises;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //rows
        //the number of the elements in the array will be the same as the number of the rows -n
        int [] firstArray = new int[n];
        int [] secondArray = new int[n];

        for (int row = 1; row <= n; row++) {
            String numbers = scanner.nextLine(); //"1 5".split(" ") -> ["1", "5"]
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]); //"1" -> 1
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]); //"5" -> 5

            if (row % 2 == 0) {
                //even row -> first number ( second array ); second number (first array)
                firstArray[row - 1] = secondNumber;
                secondArray[row - 1] = firstNumber;
            } else {
                //odd row -> firstNumber (firstArray); second number (second array)
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1] = secondNumber;
            }
        }

        //print elements of the first array
        for (int number : firstArray) {
            System.out.print(number + " ");
        }

        System.out.println();

        //we print elements of the second array
        for (int number : secondArray) {
            System.out.print(number + " ");
        }

    }
}
