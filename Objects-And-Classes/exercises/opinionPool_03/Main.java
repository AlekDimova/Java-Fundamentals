package objectsAndClasses.exercises.opinionPool_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>(); //in this list we keep objects Person

        int n = Integer.parseInt(scanner.nextLine()); //3 number of the people
        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine(); //Peter 12
            String name = data.split("\\s+")[0]; //name of the person Peter
            int age = Integer.parseInt(data.split("\\s+")[1]); //age of the person 12

            if (age > 30) {
                Person person = new Person(name, age); //crate object from the class Person(with a help of our constructor)
                peopleList.add(person);
            }
        }

        //print
        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

    }
}
