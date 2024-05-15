package objectsAndClasses.exercises.opinionPool_03;

public class Person {
    //to describe our fields -> characteristics (name, age..)
    private String name;
    private int age;

    //constructor -> method, with whom we create objects from a class
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters -> methods, with whom we get the value of the corresponding field
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
