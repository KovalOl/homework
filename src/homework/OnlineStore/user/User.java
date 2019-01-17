package homework.OnlineStore.user;

import homework.OnlineStore.basket.Basket;

import java.util.Objects;
import java.util.Scanner;

public class User {
    private String login;
    private String password;
    private Basket basket;
    private static Scanner scanner = new Scanner(System.in);

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(basket, user.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, basket);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + getLogin() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", basket=" + getBasket() +
                '}';
    }

    public static String inputString() {
        String str;
        while (true) {
            str = scanner.nextLine();
            if (str.isEmpty()) {
                System.out.println("Вы не ввели данные, попробуйте снова!");
            } else {
                break;
            }
        }
        return str;
    }
}
