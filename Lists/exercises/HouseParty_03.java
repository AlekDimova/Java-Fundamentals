package lists.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine()); //4
        List<String> guests = new ArrayList<>();

        for (int countCommand = 1; countCommand <= countCommands; countCommand++) {
            String command = scanner.nextLine();
            // Allie is going!
            // George is going!
            // John is not going!
            // George is not going!
            String name = command.split("\\s+")[0]; // Allie

            if (command.contains("is going!")) {
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list!");
                }
                else {
                    guests.add(name);
                }
            } else if (command.contains("is not going!")){
                if (guests.contains(name)) {
                    guests.remove(name);
                }
                else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        //print
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
