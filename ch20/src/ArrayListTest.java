import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book>   list = new ArrayList<>();

        list.add(new Book("1", "minseok2"));
        list.add(new Book("2", "minseok2"));
        list.add(new Book("3", "minseok2"));
        list.add(new Book("4", "minseok2"));
        list.add(new Book("5", "minseok2"));

        for (Book book : list) {
            book.showBookInfo();
        }
    }
}
