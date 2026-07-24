class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Main {

    static void display(Employee[] emp) {
        for (Employee e : emp) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }

    static void search(Employee[] emp, int key) {
        for (Employee e : emp) {
            if (e.id == key) {
                System.out.println("Employee Found: " + e.name);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    public static void main(String[] args) {
        Employee[] emp = {
            new Employee(1, "John", 50000),
            new Employee(2, "Alice", 60000),
            new Employee(3, "Bob", 55000)
        };

        System.out.println("Employee List:");
        display(emp);

        search(emp, 2);
    }
}