package homework.OnlineStore.basket;

import homework.OnlineStore.product.Product;

import java.util.*;

public class Basket {
    private Set<Product> products = new HashSet<>();

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + getProducts() +
                '}';
    }

    public static Set<Product> addToCard(Product[] products) {
        Set<Product> shoppingBasket = new HashSet<Product>();
        int stop;
        do {
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ") " + products[i].getNameProduct());
            }
            System.out.println("Введите продукт");
            shoppingBasket.add(products[getIntegerValue() - 1]);
            System.out.println("Введите 1, чтобы продолжить или введите 0, чтобы выйти");
            stop = getIntegerValue();
        } while (stop != 0);
        return shoppingBasket;
    }

    public static int getIntegerValue() {
        Scanner scanner = new Scanner(System.in);
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                break;
            } else {
                System.out.println("Вы ввели некорректное значение, попробуйте снова!");
                scanner.next();
            }
        }
        return value;
    }
}