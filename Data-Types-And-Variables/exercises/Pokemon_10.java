package dataTypesAndVariables.exercises;

import java.util.Scanner;

public class Pokemon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factorOfExhausting = Integer.parseInt(scanner.nextLine());

        int startPower = power;
        //stop: power < distance
        //continue: power >= distance

        int countPokedTarget = 0; //count the times of poke goals
        while (power >= distance) {
            //1. we go to the goal -> our power decrease regarding the distance
            power -= distance; //power = power - distance;
            countPokedTarget++; //2. succeed to poke the targeted goal

            //check if it's exhausted (if the current power is equal to the half of the starting power)
            if (power == startPower / 2) {
                if (factorOfExhausting != 0) {
                    power = power / factorOfExhausting; // power /= factor;
                }
            }
        }

        System.out.println(power);
        System.out.println(countPokedTarget);


    }
}
