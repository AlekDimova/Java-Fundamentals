package associativeArraysMaps.exercises;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();//student -> list of all their grades
        for (int i = 0; i < countStudents; i++) {

            String studentName = scanner.nextLine(); //John
            double grade = Double.parseDouble(scanner.nextLine()); //5.5

            //if student is not in the list we add them
            if (!studentGrades.containsKey(studentName)) {
                studentGrades.put(studentName, new ArrayList<>());
            }
            studentGrades.get(studentName).add(grade); //if it's in the list we took his current grades and add new one
        }

        //student -> average grade
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();
        //looking for an average grade of all students
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade (grades);
            if(averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        //print
        studentAverageGrade.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}
