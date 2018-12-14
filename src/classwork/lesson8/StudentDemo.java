package classwork.lesson8;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", "G1", 4);
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getGroup() +
                " " + student1.getAvgMark());
        System.out.println();

        Aspirant aspirant = new Aspirant("Евгений", "Зеленский", "G13", 5, "История древнего всего");
        System.out.println(aspirant.getFirstName() + " " + aspirant.getLastName() + " " + aspirant.getGroup() +
                " " + aspirant.getAvgMark() + " " + " " + aspirant.getScienceWork());
        System.out.println();

        Student aspirant2 = new Aspirant("Петр", "Петров", "G2", 4, "Work2");
        System.out.println(aspirant2.getFirstName() + " " + aspirant2.getLastName() + " " + aspirant2.getGroup() +
                " " + aspirant2.getAvgMark() + " ");
    }
}
