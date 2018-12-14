package homework.lesson7;

public class Task2Person {
    String fullName;
    int age;

    public Task2Person() {

    }

    public Task2Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move(String person) {
        System.out.println("Такой-то " +  person);
    }

    void talk(String person) {
        System.out.println("Такой-то " + person);
    }
}