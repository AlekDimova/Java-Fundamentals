package objectsAndClasses.exercises.students_04;

public class Student {
    //полета -> характеристики (firstName, lastName, grade)
    private String firstName;
    private String lastName;
    private double grade;

    //конструктор -> метод, чрез който създаваме обекти от класа
    public Student (String firstName, String lastName, double grade) {
        //нов празен обект
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    //getters
    public double getGrade() {
        return this.grade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
