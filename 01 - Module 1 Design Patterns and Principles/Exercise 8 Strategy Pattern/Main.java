import java.util.*;

public class Main {
    interface Observer {
        void update(String msg);
    }

    static class User implements Observer {
        String name;

        User(String name) {
            this.name = name;
        }

        public void update(String msg) {
            System.out.println(name + ": " + msg);
        }
    }

    static class Channel {
        List<Observer> list = new ArrayList<>();

        void subscribe(Observer o) {
            list.add(o);
        }

        void notifyAllUsers(String msg) {
            for (Observer o : list) {
                o.update(msg);
            }
        }
    }

    public static void main(String[] args) {
        Channel c = new Channel();
        c.subscribe(new User("A"));
        c.subscribe(new User("B"));
        c.notifyAllUsers("New Video Uploaded");
    }
}