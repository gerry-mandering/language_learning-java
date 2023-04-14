package ch01;

class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.author;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("태백산맥", "조정래");
        System.out.println("book.toString() = " + book.toString());

        String str = new String("test");
        System.out.println("str = " + str);

        Integer number = new Integer(100);
        System.out.println("number = " + number);
    }
}
