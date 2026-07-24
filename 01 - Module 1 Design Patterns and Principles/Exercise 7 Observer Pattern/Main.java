public class Main {
    interface Food {
        void prepare();
    }

    static class Burger implements Food {
        public void prepare() {
            System.out.println("Burger");
        }
    }

    static class CheeseDecorator implements Food {
        Food f;

        CheeseDecorator(Food f) {
            this.f = f;
        }

        public void prepare() {
            f.prepare();
            System.out.println("Cheese added");
        }
    }

    public static void main(String[] args) {
        Food f = new CheeseDecorator(new Burger());
        f.prepare();
    }
}