package homework.OnlineStore.menu;

public enum Menu {
    CATEGORY_LIST(1), GOODS_LIST_OF_CATEGORY(2), ADD_TO_CART(3), BUY_GOODS(4), EXIT(5);

    private int menuElement;

    Menu(int menuElement) {
        this.menuElement = menuElement;
    }

    public int getMenuElement() {
        return menuElement;
    }
}
