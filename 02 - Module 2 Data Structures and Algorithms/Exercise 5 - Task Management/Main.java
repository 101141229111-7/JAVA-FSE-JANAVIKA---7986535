class Task {
    int id;
    String name;
    String status;

    Task(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
}

public class Main {

    static void display(Task[] tasks) {
        for (Task t : tasks) {
            System.out.println(t.id + " " + t.name + " " + t.status);
        }
    }

    static void updateStatus(Task[] tasks, int id, String newStatus) {
        for (Task t : tasks) {
            if (t.id == id) {
                t.status = newStatus;
                System.out.println("Task Updated");
                return;
            }
        }
        System.out.println("Task Not Found");
    }

    public static void main(String[] args) {
        Task[] tasks = {
            new Task(1, "Design", "Pending"),
            new Task(2, "Coding", "Pending"),
            new Task(3, "Testing", "Pending")
        };

        System.out.println("Before Update:");
        display(tasks);

        updateStatus(tasks, 2, "Completed");

        System.out.println("After Update:");
        display(tasks);
    }
}