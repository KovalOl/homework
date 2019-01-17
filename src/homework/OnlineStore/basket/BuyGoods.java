package homework.OnlineStore.basket;

import homework.OnlineStore.user.User;

public class BuyGoods {

    public static void buyGoods(User user, Basket basket) {
        if (basket.getProducts().isEmpty()) {
            System.out.println("Ваша корзина пустая!");
        } else {
            user.setBasket(basket);
            System.out.println("Информация про покупки: ");
            System.out.println(user.toString());
            basket.getProducts().removeAll(basket.getProducts());
            if (basket.getProducts().isEmpty()) {
                System.out.println("Покупка прошла успешно!");
            } else {
                System.out.println("Ошибка!");
            }
        }
    }
}
