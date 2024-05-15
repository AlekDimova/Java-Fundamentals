package midExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine() // "10 20 30 40 50"
                        .split("\\s+")) //["10", "20", "30", "40", "50"]
                .map(Integer::parseInt) // [10, 20, 30, 40, 50]
                .collect(Collectors.toList()); //{10, 20 , 30, 40, 50}

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum * 1.0 / numbers.size();

        List<Integer> greaterElements = new ArrayList<>();
        for (int number : numbers) {
            if (number > average) {
                greaterElements.add(number);
            }
        }

        Collections.sort(greaterElements); //ascending order
        Collections.reverse(greaterElements); //descending order

        if (greaterElements.size() > 0) {
            if (greaterElements.size() <  5) {
                //1st way yo print elements
                System.out.println(greaterElements.toString() //"[2, 4, 5, 6]"
                        .replace("[", "") //"2, 4, 5, 6]"
                        .replace("]", "") //"2, 4, 5, 6"
                        .replace(",", "") //"2 4 5 6"
                );
                //2nd way to print elements
                /*for (int number : greaterElements) {
                    System.out.print(number + " ");
                }*/
            } else {
                //greaterElements = {98, 76, 65, 54, 43, 32, 31, 28, 26}
                List<Integer> top5Numbers = greaterElements.subList(0, 5);
                for (int number : top5Numbers) {
                    System.out.print(number + " ");
                }
            }

        } else {
            System.out.println("No");
        }
    }
}
