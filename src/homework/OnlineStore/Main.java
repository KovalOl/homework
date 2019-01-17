package homework.OnlineStore;

import homework.OnlineStore.basket.Basket;
import homework.OnlineStore.basket.BuyGoods;
import homework.OnlineStore.category.Category;
import homework.OnlineStore.category.CategoryList;
import homework.OnlineStore.menu.OutputMenu;
import homework.OnlineStore.product.Product;
import homework.OnlineStore.user.User;
import homework.OnlineStore.user.UserRegistration;

import static homework.OnlineStore.basket.Basket.addToCard;

public class Main {
    public static void main(String[] args) {
        Category[] categories = new Category[CategoryList.values().length];

        Product[] products = new Product[] {
                new Product("T-shirts", 299, 4), new Product("Jeans", 999, 5),
                new Product("Samsung Galaxy A5", 7999, 4), new Product("Huawei P Smart", 6499, 5),
                new Product("Lenovo IdeaPad 320-15IKB", 16499, 4), new Product("ASUS X570UD-E4037", 25999, 5),
        };

        Product[] clothes = new Product[]{products[0], products[1]};
        Product[] phones = new Product[]{products[2], products[3]};
        Product[] laptops = new Product[]{products[4], products[5]};

        Basket basket = new Basket();

        categories[0] = new Category(CategoryList.CLOTHES, clothes);
        categories[1] = new Category(CategoryList.PHONES, phones);
        categories[2] = new Category(CategoryList.LAPTOPS, laptops);

        User user = UserRegistration.getUserRegistration();

        boolean exit = true;
        while (exit) {
            OutputMenu.outputMenu();
            System.out.println();
            System.out.println("Введите номер пункта меню ");
            switch (OutputMenu.getMenuElement(Basket.getIntegerValue())) {
                case CATEGORY_LIST:
                    OutputMenu.outputCategoriesList();
                    break;
                case GOODS_LIST_OF_CATEGORY:
                    OutputMenu.getCategoryNumber(categories);
                    break;
                case ADD_TO_CART:
                    basket.setProducts(addToCard(products));
                    System.out.println("Корзина содержит такие товары: ");
                    System.out.println(basket.toString());
                    break;
                case BUY_GOODS:
                    BuyGoods.buyGoods(user, basket);
                    break;
                case EXIT:
                    System.out.println("Спасибо за покупки!");
                    exit = false;
                    break;
                default:
                    System.out.println("Вы ввели неправильный номер");
            }
        }
    }
}
