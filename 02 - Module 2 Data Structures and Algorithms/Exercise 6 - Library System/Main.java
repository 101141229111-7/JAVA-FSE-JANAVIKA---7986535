class Book {
    int id;
    String title;
    boolean issued;

    Book(int id, String title, boolean issued) {
        this.id = id;
        this.title = title;
        this.issued = issued;
    }
}

public class Main {

    static void display(Book[] books) {
        for (Book b : books) {
            System.out.println(b.id + " " + b.title + " " + (b.issued ? "Issued" : "Available"));
        }
    }

    static void issueBook(Book[] books, int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book Issued");
                } else {
                    System.out.println("Already Issued");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java", false),
            new Book(2, "DSA", false),
            new Book(3, "DBMS", false)
        };

        System.out.println("Library Books:");
        display(books);

        issueBook(books, 2);

        System.out.println("After Issuing:");
        display(books);
    }
}