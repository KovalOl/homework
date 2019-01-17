package homework.OnlineStore.category;

public enum CategoryList {
    CLOTHES(1), PHONES(2), LAPTOPS(3);

    private int categoryNumber;

    CategoryList (int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }
}
