package homework.OnlineStore.menu;

import homework.OnlineStore.basket.Basket;
import homework.OnlineStore.category.Category;
import homework.OnlineStore.category.CategoryList;

public class OutputMenu {

    public static void outputMenu() {
        Menu[] menus = Menu.values();

        for (Menu menu : menus) {
            System.out.println(menu.getMenuElement() + " " + menu);
        }
    }

    public static Menu getMenuElement(int numberMenu) {
        Menu nameMenu = Menu.CATEGORY_LIST;
        Menu[] menus = Menu.values();
        for (Menu menu : menus) {
            if (menu.getMenuElement() == numberMenu) {
                nameMenu = menu;
            }
        }
        return nameMenu;
    }

    public static void outputCategoriesList() {
        CategoryList[] categoryLists = CategoryList.values();
        for (CategoryList categoryList : categoryLists) {
            System.out.println(categoryList.getCategoryNumber() + " " + categoryList);
        }
    }

    public static void outputGoodsOfCategory(Category[] categories, int numberCategory) {
        for (Category category : categories) {
            if (category.getName().getCategoryNumber() == numberCategory) {
                System.out.println(category.toString());
            }
        }
    }

    public static void getCategoryNumber(Category[] categories) {
        OutputMenu.outputCategoriesList();
        System.out.print("Введие номер категории ");
        OutputMenu.outputGoodsOfCategory(categories, Basket.getIntegerValue());
    }
}
