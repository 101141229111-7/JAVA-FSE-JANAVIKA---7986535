import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }
}

public class Main {
    static HashMap<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    static void updateProduct(int id, int qty) {
        if (inventory.containsKey(id)) {
            inventory.get(id).quantity = qty;
        }
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
    }

    static void display() {
        for (Product p : inventory.values()) {
            System.out.println(p.productId + " " + p.productName + " " + p.quantity + " " + p.price);
        }
    }

    public static void main(String[] args) {
        addProduct(new Product(1, "Pen", 50, 10));
        addProduct(new Product(2, "Book", 20, 100));

        updateProduct(1, 60);
        deleteProduct(2);

        display();
    }
}