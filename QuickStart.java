import java.util.Scanner;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;

class QuickStart {
    // static int age = 27; -> Can have our variable initialized outside of our
    // codeblock and still have access, but must be static, static method only works
    // with static vars

    // static int age; -> this will actually be automatically assigned if we define
    // in the class. For numbers, it is 0. So running our program will work. We can
    // redeclare inside the main method too
    public static void main(String[] args) {
        // Must initialize variabbles and declare what type they are, must have ; at the
        // end or there will be compiling issues
        // int age = 27;

        // age = 28;
        // System.out.println("I am " + age + " years old.");

        User youngerUser = new User("Charles Cruse", "1994-02-21");
        User olderUser = new User("Kevin Cruse", "1997-05-30");

        Book book1 = new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook book2 = new AudioBook("Dracula", "Bram Stoker", 30000);
        Ebook book3 = new Ebook("Carry on", "P.G Wode", 280, "pdf");

        youngerUser.borrow(book1);
        youngerUser.borrow(book2);
        youngerUser.borrow(book3);

        System.out.printf("%s has borrowed these books: %s \n", youngerUser.getName(), youngerUser.borrowedBooks());
    }
}