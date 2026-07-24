public class Main {
    static class Student implements Cloneable {
        String name;

        Student(String name) {
            this.name = name;
        }

        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        void show() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Janu");
        Student s2 = (Student) s1.clone();
        s2.show();
    }
}