package arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine() //"1 7 6 2 19 23"
                        .split(" ")) //["1", "7", "6", "2", "19", "23"]
                .mapToInt(e -> Integer.parseInt(e)) //[1, 7, 6, 2, 19, 23]
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i< numbers.length - 1; i++) {
            int currentNumber = numbers[i];

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int nextNumber = numbers[j];

                if (currentNumber + nextNumber == magicSum) {
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
