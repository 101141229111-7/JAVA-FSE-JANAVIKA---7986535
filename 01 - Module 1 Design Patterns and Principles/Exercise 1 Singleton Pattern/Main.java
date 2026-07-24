public class Main {
    static class Singleton {
        private static Singleton obj;

        private Singleton() {}

        public static Singleton getInstance() {
            if (obj == null) {
                obj = new Singleton();
            }
            return obj;
        }

        void show() {
            System.out.println("Singleton Pattern");
        }
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.show();
    }
}