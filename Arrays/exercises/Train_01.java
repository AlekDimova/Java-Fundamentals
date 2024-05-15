package arrays.exercises;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = Integer.parseInt(scanner.nextLine()); //You will be given a count of wagons in a train n.

        int [] wagons = new int[countWagons];
        for (int wagon = 0; wagon < countWagons; wagon++) {
            int countPeople = Integer.parseInt(scanner.nextLine()); //On the next n lines, you will receive how many people will get on that wagon.
            wagons[wagon] = countPeople;
        }

        int sum = 0;
        for (int number : wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
