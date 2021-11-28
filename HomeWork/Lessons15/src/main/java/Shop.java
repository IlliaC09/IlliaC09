import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;

@ToString
public class Shop {

    Product milk = new Product(10, "Milk", 15);
    Product meat = new Product(20, "Meat", 100);
    Product bread = new Product(30, "Bread", 20);
    Product butter = new Product(40, "butter", 40);
    Product sugar = new Product(50, "sugar", 10);
    ArrayList<Product> listProduct = new ArrayList<>(Arrays.asList(milk, meat, bread, butter, sugar));


    public void addProduct(int id, String name, int price) {
        ArrayList<Product> copy = new ArrayList<>(listProduct);
        boolean idFound = false;
        for (Product products : copy) {
            if (id == products.getId()) {
                idFound = true;
            }
        }
        if (!idFound) listProduct.add(new Product(id, name, price));
    }

    public void info() {
        System.out.println(listProduct);
    }

    public void deleteProduct(int id) {
        ArrayList<Product> copy = new ArrayList<>(listProduct);
        for (Product products : copy) {
            if (id == products.getId()) {
                listProduct.remove(products);
            }
        }
    }

    public void editProduct(int id, String newName, int newPrice) {
        ArrayList<Product> copy = new ArrayList<>(listProduct);
        for (Product products : copy) {
            if (id == products.getId()) {
                products.setName(newName);
                products.setPrice(newPrice);

            }
        }
    }
}
