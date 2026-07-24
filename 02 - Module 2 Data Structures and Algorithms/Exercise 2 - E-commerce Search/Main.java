class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {

    static void linear(Product[] arr, String key) {
        for (Product p : arr) {
            if (p.name.equalsIgnoreCase(key)) {
                System.out.println("Linear Search: Found");
                return;
            }
        }
        System.out.println("Linear Search: Not Found");
    }

    static void binary(Product[] arr, String key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int res = arr[mid].name.compareToIgnoreCase(key);

            if (res == 0) {
                System.out.println("Binary Search: Found");
                return;
            } else if (res < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Binary Search: Not Found");
    }

    public static void main(String[] args) {
        Product[] arr = {
            new Product(1, "Apple"),
            new Product(2, "Banana"),
            new Product(3, "Mango")
        };

        linear(arr, "Mango");
        binary(arr, "Apple");
    }
}