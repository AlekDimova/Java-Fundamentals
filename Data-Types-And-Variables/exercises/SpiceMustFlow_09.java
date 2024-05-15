package dataTypesAndVariables.exercises;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = Integer.parseInt(scanner.nextLine()); //бр. подправки в полето

        int days = 0; //бр дни добив
        int totalAmountSpices = 0; //общо количество добити подправки
        while (source >= 100) {
            int spices = source - 26;
            totalAmountSpices += spices;
            days++;
            source = source - 10;
        }
        System.out.println(days);

        //изяждат 26 подправки при пътуването до другата нива
        if (totalAmountSpices >= 26) {
            totalAmountSpices -= 26;
        }
        System.out.println(totalAmountSpices);
    }
}
