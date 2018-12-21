package homework.lesson7;

public class Task2Person {
    private String fullName;
    private int age;

    public Task2Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Task2Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    void move(String person) {
        System.out.println("Такой-то " + person);
    }

    void talk(String person) {
        System.out.println("Такой-то " + person);
    }
}