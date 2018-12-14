package homework.lesson7;

public class Task1Phone {
    private String number;
    private String model;
    private double weight;
    private static int count;

    public Task1Phone(String m, String n, double w) {
        this(n, m);
        this.weight = w;
        count++;
    }

    public Task1Phone(String m, String n) {
        this.number = n;
        this.model = m;
    }

    public Task1Phone() {
        count++;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getCount() {
        return count;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + "с номера телефона " + number);
    }

    String getNumber() {
        return number;
    }

    void setDim(String n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("Отправляем сообщение " + message);
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
