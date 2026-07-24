public class Main {
    interface Command {
        void execute();
    }

    static class Light {
        void on() {
            System.out.println("Light ON");
        }
    }

    static class LightOn implements Command {
        Light l;

        LightOn(Light l) {
            this.l = l;
        }

        public void execute() {
            l.on();
        }
    }

    public static void main(String[] args) {
        Light l = new Light();
        Command c = new LightOn(l);
        c.execute();
    }
}