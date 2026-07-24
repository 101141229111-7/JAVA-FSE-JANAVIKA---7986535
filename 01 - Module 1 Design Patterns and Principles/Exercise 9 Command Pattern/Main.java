public class Main {
    interface Strategy {
        void execute();
    }

    static class Add implements Strategy {
        public void execute() {
            System.out.println("Addition Strategy");
        }
    }

    static class Multiply implements Strategy {
        public void execute() {
            System.out.println("Multiplication Strategy");
        }
    }

    static class Context {
        Strategy s;

        Context(Strategy s) {
            this.s = s;
        }

        void run() {
            s.execute();
        }
    }

    public static void main(String[] args) {
        Context c = new Context(new Add());
        c.run();
    }
}