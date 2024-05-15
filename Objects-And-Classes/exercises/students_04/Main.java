package objectsAndClasses.exercises.students_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= countStudents; i++) {
            String data = scanner.nextLine();//"Lakia Eason 3.90"
            String firstName = data.split("\\s+")[0]; //"Lakia"
            String lastName = data.split("\\s+")[1]; //"Eason"
            double grade = Double.parseDouble(data.split("\\s+")[2]); //"3.90" -> 3.90

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        //list with students
        //1. orders them by grade (in descending)
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        //2. print students
        for (Student student : studentList) {
            //System.out.println(student.getFirstName() + " " + student.getLastName() + ": " + student.getGrade());
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
