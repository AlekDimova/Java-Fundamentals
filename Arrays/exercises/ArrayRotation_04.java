package arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arrayNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countRotations = Integer.parseInt(scanner.nextLine()); //2

        for (int rotation = 1; rotation <= countRotations; rotation++) {
            int firstElement = arrayNumbers [0]; //1. we took the first element "51"

            //2. move all the elements on the left
            for (int index = 0; index < arrayNumbers .length - 1 ; index++) {
                arrayNumbers [index] = arrayNumbers [index + 1];
            }

            //3. we place the first element(51) on the last place
            arrayNumbers [arrayNumbers .length - 1] = firstElement; //[47, 32, 61, 21, 51]
        }

        //we print all the elements in the array
        for(int number : arrayNumbers) {
            System.out.print(number + " ");
        }
    }
}
