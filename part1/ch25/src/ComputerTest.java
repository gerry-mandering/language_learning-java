public class ComputerTest {
    public static void main(String[] args) {
        Computer    deskTop = new Desktop();

        deskTop.display();
        deskTop.turnOff();

        NoteBook    myNoteBook = new MyNoteBook();

        myNoteBook.display();
        myNoteBook.turnOff();
        myNoteBook.typing();
    }
}
