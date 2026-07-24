public class Main {
    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        public void draw() {
            System.out.println("Circle");
        }
    }

    static class Square implements Shape {
        public void draw() {
            System.out.println("Square");
        }
    }

    static class Factory {
        Shape getShape(String type) {
            if (type.equals("circle")) return new Circle();
            if (type.equals("square")) return new Square();
            return null;
        }
    }

    public static void main(String[] args) {
        Factory f = new Factory();
        f.getShape("circle").draw();
    }
}