package quiz02;

public class Person {
    String name, bornDate;

    Person(String name, String bornDate) {
        this.name = name;
        this.bornDate = bornDate;
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void printAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Born date: " + bornDate);
    }
}
