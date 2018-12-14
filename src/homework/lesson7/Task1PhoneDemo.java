package homework.lesson7;

public class Task1PhoneDemo {
    public static void main(String[] args) {
        Task1Phone task1Phone1 = new Task1Phone("+380957852369", "Apple", 4.5);
        Task1Phone task1Phone2 = new Task1Phone("+380684251179", "Samsung");
        Task1Phone task1Phone3 = new Task1Phone();

        task1Phone3.setDim("+380667845127", "Huawei", 5.3);

        System.out.println(Task1Phone.getCount());

        System.out.println(task1Phone1.getModel());
        System.out.println(task1Phone1.getWeight());
        System.out.println(task1Phone1.getNumber());
        System.out.println();
        System.out.println(task1Phone2.getModel());
        System.out.println(task1Phone2.getWeight());
        System.out.println(task1Phone2.getNumber());
        System.out.println();
        System.out.println(task1Phone3.getModel());
        System.out.println(task1Phone3.getWeight());
        System.out.println(task1Phone3.getNumber());
        System.out.println();

        task1Phone1.receiveCall("Мама ");
        task1Phone1.receiveCall("Мама ", "0971111111");

        System.out.println(task1Phone1.getNumber());

        task1Phone1.sendMessage("Message1","11111");
        task1Phone1.sendMessage("Message2","222222", "333333");


    }
}
