public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(6, "oil", 55);
        shop.addProduct(10, "oil", 55);
        shop.addProduct(20, "vodka", 100);
        shop.info();
        shop.deleteProduct(30);
        shop.info();
        shop.editProduct(10, "apple", 20);
        shop.info();
    }
}

