public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("1", "minseok2");
        library[1] = new Book("2", "minseok2");
        library[2] = new Book("3", "minseok2");
        library[3] = new Book("4", "minseok2");
        library[4] = new Book("5", "minseok2");

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i] = new Book();
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("============");

        for (Book book : copyLibrary) {
            book.showBookInfo();
        }

        library[0].setAuthor("kim");
        library[0].setTitle("99");

        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("============");

        for (Book book : copyLibrary) {
            book.showBookInfo();
        }
    }
}
