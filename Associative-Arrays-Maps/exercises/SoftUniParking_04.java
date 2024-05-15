package associativeArraysMaps.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,String> registeredStudents = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){

            String[] data = scanner.nextLine().split("\\s+"); //"register" "John" "CS1234JS"  //"unregister" "Andy"

            String command = data[0]; //"register" //"unregister"

            switch (command) {
                case "register":
                    String studentName = data[1]; //"John"
                    String plateNumber = data[2]; //"CS1234JS"

                    if(registeredStudents.containsKey(studentName)) {
                        System.out.println(String.format("ERROR: already registered with plate number %s", plateNumber));
                    } else {
                        registeredStudents.put(studentName, plateNumber);
                        System.out.println(String.format("%s registered %s successfully", studentName, plateNumber));
                    }
                    break;
                case "unregister":
                    String userName = data[1]; //"Andy"

                    if(!registeredStudents.containsKey(userName)) {
                        System.out.println(String.format("ERROR: user %s not found", userName));
                    } else {
                        registeredStudents.remove(userName);
                        System.out.println(String.format("%s unregistered successfully", userName));
                    }
                    break;
            }
        }

        registeredStudents.forEach((key, value) ->
                System.out.println(String.format("%s => %s", key, value)));
    }
}
