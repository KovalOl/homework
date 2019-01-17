package homework.OnlineStore.product;

import java.util.Objects;

public class Product {
    private String nameProduct;
    private double price;
    private int rank;

    public Product(String nameProduct, double price, int rank) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.rank = rank;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                rank == product.rank &&
                Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, price, rank);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + getNameProduct() + '\'' +
                ", price=" + getPrice() +
                ", rank=" + getRank() +
                '}';
    }
}
