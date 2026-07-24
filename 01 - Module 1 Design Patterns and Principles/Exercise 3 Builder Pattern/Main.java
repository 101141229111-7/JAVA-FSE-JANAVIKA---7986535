public class Main {
    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        public void draw() {
            System.out.println("Circle");
        }
    }

    static class Rectangle implements Shape {
        public void draw() {
            System.out.println("Rectangle");
        }
    }

    interface Factory {
        Shape createShape();
    }

    static class CircleFactory implements Factory {
        public Shape createShape() {
            return new Circle();
        }
    }

    static class RectangleFactory implements Factory {
        public Shape createShape() {
            return new Rectangle();
        }
    }

    public static void main(String[] args) {
        Factory f = new CircleFactory();
        f.createShape().draw();
    }
}