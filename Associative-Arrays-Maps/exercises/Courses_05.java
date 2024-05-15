package associativeArraysMaps.exercises;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while(!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String personName = input.split(" : ")[1];
            if(!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }

            courses.get(courseName).add(personName);

            input = scanner.nextLine();
        }

        //print
        courses.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size()); //Programming Fundamentals: 2
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName)); //-- John Smith // -- Linda Johnson
                });
    }
}
