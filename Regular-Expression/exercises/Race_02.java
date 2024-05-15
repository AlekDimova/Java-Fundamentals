package regularExpression.exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine(); //"George, Peter, Bill, Tom"
        List<String> racersNames = Arrays.stream(names.split(", ")) //["George", "Peter", "Bill", "Tom"]
                .toList();  //{"George", "Peter", "Bill", "Tom"}

        Map<String, Integer> racersDistances = new LinkedHashMap<>();//racer name -> destination
        racersNames.forEach(racer -> racersDistances.put(racer, 0));

        //Regex
        String lettersRegex = "[A-Za-z]";
        Pattern patternLetter = Pattern.compile(lettersRegex);

        String digitsRegex = "[0-9]";
        Pattern patternDigit = Pattern.compile(digitsRegex);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            //input = "G!32e%o7r#32g$235@!2e"
            StringBuilder nameBuilder = new StringBuilder(); //we construct the name of the racer
            Matcher matcherLetter = patternLetter.matcher(input); //all races -> ["G", "e", "o", "r", "g", "e"]
            while (matcherLetter.find()) {
                nameBuilder.append(matcherLetter.group());
            }

            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input); // ["3", "2", "7", "3", "2", "2", "3", "5"]
            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }

            String racerName = nameBuilder.toString();
            if (racersNames.contains(racerName)) {
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, currentDistance + distance);
            }
            input = scanner.nextLine();
        }

        //{"George", "Peter", "Bill", "Tom"}
        for (int index = 0; index <= 2; index++) {
            String racer = racersNames.get(index);
            if (index == 0) {
                System.out.println("1st place: " + racer);
            } else if (index == 1) {
                System.out.println("2nd place: " + racer);
            } else if (index == 2) {
                System.out.println("3rd place: " + racer);
            }
        }

    }
}
