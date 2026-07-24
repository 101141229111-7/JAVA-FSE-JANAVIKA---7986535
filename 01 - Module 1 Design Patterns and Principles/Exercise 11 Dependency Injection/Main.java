public class Main {
    static class CPU {
        void start() {
            System.out.println("CPU started");
        }
    }

    static class Memory {
        void load() {
            System.out.println("Memory loaded");
        }
    }

    static class Computer {
        CPU cpu = new CPU();
        Memory mem = new Memory();

        void startComputer() {
            cpu.start();
            mem.load();
            System.out.println("Computer started");
        }
    }

    public static void main(String[] args) {
        Computer c = new Computer();
        c.startComputer();
    }
}