package objectsAndClasses.exercises.groomingSalon_07;

public class Pet {
    private String name;
    private int age;
    private String owner;


    //alt+insert
    public Pet (String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //field age
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //field owner
    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //default -> "{package}.{class}@{address}"
    @Override
    public String toString() {
        return this.name + " " + this.age + " - (" + this.owner + ")";  //"{name} {age} - ({owner})"
    }
}
