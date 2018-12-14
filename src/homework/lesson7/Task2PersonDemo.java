package homework.lesson7;

public class Task2PersonDemo {
    public static void main(String[] args) {
        Task2Person task2Person2 = new Task2Person();
        Task2Person task2Person1 = new Task2Person("Ivan, ", 23);

        task2Person2.fullName = "Oleh, ";
        task2Person2.age = 55;

        System.out.print(task2Person2.fullName);
        System.out.println(task2Person2.age);
        System.out.print(task2Person1.fullName);
        System.out.println(task2Person1.age);

        task2Person1.move("идет");
        task2Person1.talk("говорит");




    }
}
