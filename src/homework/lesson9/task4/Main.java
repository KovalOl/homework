package homework.lesson9.task4;

public class Main {
    public static void main(String[] args) {
        Fruit fruits1 = new Apple(12.3, 13);
        Fruit fruits2 = new Pear(3.1, 12);
        Fruit fruits3 = new Apricot(4.2, 23.9);

        System.out.println("Продано " + fruits1.getWeight() + " кг яблок, на сумму: " + fruits1.fruitCost() + " грн.");
        System.out.println("Продано " + fruits2.getWeight() + " кг груш, на сумму: " + fruits2.fruitCost() + " грн.");
        System.out.println("Продано " + fruits3.getWeight() + " кг абрикос, на сумму: " + fruits3.fruitCost() + " грн.");
        System.out.println("Общая стоимость проданных фруктов: " + (fruits1.fruitCost() + fruits2.fruitCost() + fruits3.fruitCost()) + " грн.");
    }
}
