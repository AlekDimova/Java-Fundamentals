package lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"Delete {element}" -> "Delete 3"
        //"Insert {element} {position}" -> "Insert 3 1"
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt) //[1, 2, 3, 4, 5, 5, 5, 6]
                .collect(Collectors.toList()); //{1, 2, 3, 4, 5, 5, 5, 6}

        String command = scanner.nextLine(); //commands
        while (!command.equals("end")) {
            //1. command = "Delete 3"
            if (command.contains("Delete")) {
                int numberForRemove = Integer.parseInt(command.split(" ")[1]); //3
                numbers.removeAll(Arrays.asList(numberForRemove));
            }
            //2. command = "Insert 3 1"
            else if (command.contains("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]); //3
                int index = Integer.parseInt(command.split(" ")[2]); //1
                numbers.add(index, element);
            }
            command = scanner.nextLine();
        }
        //print
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
