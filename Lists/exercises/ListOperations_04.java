package lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =  Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Add")) {
                //command =	"Add 5".split(" ") -> ["Add", "5"][1] -> "5" -> parse -> 5
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("Insert")) {
                //command = "Insert 120 1".split(" ") -> ["Insert", "120", "1"]
                String [] commandParts = command.split("\\s+"); //["Insert", "120", "1"]
                int numberToInsert = Integer.parseInt(commandParts[1]); //"120" -> parse -> 120
                int index = Integer.parseInt(commandParts[2]); //"1" -> parse -> 1

                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                //command = "Remove 4".split(" ") -> ["Remove", "4"]
                int indexForRemove = Integer.parseInt(command.split("\\s+")[1]); //"4" -> parse -> 4

                if (indexForRemove >= 0 && indexForRemove <= numbers.size() - 1) {
                    numbers.remove(indexForRemove);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {
                //command = "Shift left 5".split(" ") -> ["Shift", "left", "5"]
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]); //"5" -> parse -> 5
                for (int time = 1; time <= countShiftLeft; time++) {
                    //first number becomes last
                    //numbers = {1, 23, 29, 18, 43, 21, 20}
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);
                }
            } else if (command.contains("Shift right")) {
                //command = "Shift right 4".split(" ") -> ["Shift", "right", "4"]
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]); //"4" -> 4
                for (int time = 1; time <= countShiftRight; time++) {
                    //last number becomes first times
                    //numbers = {23, 29, 18, 43, 21, 20, 123}
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);
                }
            }
            command = scanner.nextLine();
        }

       /* for (int number : numbers) {
            System.out.print(number + " ");
        }*/
        System.out.println(numbers.toString() //"[23, 29, 18, 43, 21, 20]"
                .replace("[", "") //"23, 29, 18, 43, 21, 20]"
                .replace("]", "") //"23, 29, 18, 43, 21, 20"
                .replace(",", "") //"23 29 18 43 21 20"
        );
    }
}
