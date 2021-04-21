import model.Category;
import model.Note;
import model.User;
import model.enums.CategoryName;

public class WorkWithNotes {
    public static void main(String[] args) {

        Note first = new Note();
        first.setNoteName("Trial");
        first.setDate("14/04/2021");
        first.setType("Reminder");
        first.setUrgency("High");

        first.printNoteInfo();

        User andrew = new User("Andrew", "Ks", "and@rew.com");
        andrew.printUserInfo();

        Category one = new Category(CategoryName.HB);


    }
}
