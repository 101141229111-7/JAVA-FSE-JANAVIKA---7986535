class Order {
    int id;
    String name;

    Order(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {

    static void sortOrders(Order[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].id > arr[j + 1].id) {
                    // swap
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void display(Order[] arr) {
        for (Order o : arr) {
            System.out.println(o.id + " " + o.name);
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(3, "OrderC"),
            new Order(1, "OrderA"),
            new Order(2, "OrderB")
        };

        System.out.println("Before Sorting:");
        display(orders);

        sortOrders(orders);

        System.out.println("After Sorting:");
        display(orders);
    }
}