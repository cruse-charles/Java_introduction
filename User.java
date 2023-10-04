import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    // These were all public before, so we could call user.name, but now we will
    // make it private and need to perform a getter

    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    // We can create a constructor method
    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    // This will tell us which 'user' it is referencing when we have multiple
    // instances of the class, so it will refer to the current object
    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }

    // void here means that it returns nothing
    public void borrow(Book book) {
        this.books.add(book);
    }

    // Here are out getters
    public String getName() {
        return this.name;
    }

    public String getBirthDay() {
        return this.birthDay.toString();
    }

    public String borrowedBooks() {
        return this.books.toString();
    }
}
