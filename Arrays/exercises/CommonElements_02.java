package arrays.exercises;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints common elements in two arrays.
        // You have to compare the elements of the second array to the elements of the first.

        String firstRow = scanner.nextLine();  //"Hey hello 2 4"
        String secondRow = scanner.nextLine(); //"10 hey 4 hello"

        String [] firstArray = firstRow.split(" ");    //["Hey", "hello", "2", "4"]
        String [] secondArray = secondRow.split(" "); //["10", "hey", "4", "hello"]

        for (String secondElement : secondArray) {
            for (String firstElement : firstArray) {
                if (secondElement.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                    break;
                }
            }
        }
    }
}
