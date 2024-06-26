package arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine() //"23 -2 321 87 42 90 -123"
                        .split(" "))  //["23", "-2", "321", "87", "42", "90", "-123"]
                .mapToInt(Integer::parseInt)  //[23, -2, 321, 87, 42, 90, -123]
                .toArray();

        String command = scanner.nextLine();
        //"swap {index1} {index2}".split(" ") ->
        //"multiply {index1} {index2}".split(" ") -> ["multiply", "3", "4"]
        //"decrease".split(" ") -> ["decrease"]

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0]; //"swap", "multiply", "decrease"
            switch (commandType) {
                case "swap":
                    //commandParts: ["swap", "3", "4"]
                    int index1 = Integer.parseInt(commandParts[1]); // we took the index of the input "3" and parse it as number 3
                    int element1 = numbers[index1]; //we took the number in the array of the mention index1 (ex 3)
                    int index2 = Integer.parseInt(commandParts[2]); // we took the 2nd index of the input "4" and parse it as number 4
                    int element2 = numbers[index2];

                    //swap
                    numbers[index1] = element2;
                    numbers[index2] = element1;
                    break;
                case "multiply":
                    int multiplyElementIndex1 = Integer.parseInt(commandParts[1]); // {index1}
                    int multiplyElement1 = numbers[multiplyElementIndex1];
                    int multiplyElementIndex2 = Integer.parseInt(commandParts[2]); // {index2}
                    int multiplyElement2 = numbers[multiplyElementIndex2];

                    int result = multiplyElement1 * multiplyElement2;
                    numbers[multiplyElementIndex1] = result;
                    break;
                case "decrease":
                    for (int index = 0; index <= numbers.length - 1; index++) {
                        numbers[index] = numbers[index] - 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (int index = 0; index <= numbers.length - 1; index++) {
            if (index != numbers.length - 1) {
                System.out.print(numbers[index] + ", ");
            } else {
                System.out.print(numbers[index]);
            }
        }

        //System.out.println(Arrays.toString(numbers).replace("[", "").replace("]", ""));
    }
}
