package homework.lesson9.task4;

import java.util.Objects;

public class Pear extends Fruit {
    private double price;

    public Pear(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pear pear = (Pear) o;
        return Double.compare(pear.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "price=" + price +
                "} " + super.toString();
    }

    @Override
    public double fruitCost() {
        return getWeight() * getPrice();
    }
}
