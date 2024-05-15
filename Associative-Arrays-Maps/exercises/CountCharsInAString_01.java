package associativeArraysMaps.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine(); //Aleksandra

        Map<Character, Integer> characterCounts = new LinkedHashMap<>();

        //"Aleksandra" -> ['A', 'l', 'e', 'k', 's', 'a', 'n', 'd', 'r', 'a']
        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (characterCounts.containsKey(symbol)) {
                int currentCount = characterCounts.get(symbol);
                characterCounts.put(symbol, currentCount + 1);
            }
            else {
                characterCounts.put(symbol, 1);
            }
        }
        //print
        characterCounts.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
