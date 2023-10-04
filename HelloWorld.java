import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        // Below is the old way we made users:

        // User youngerUser = new User();

        // youngerUser.name = "Charles Cruse";
        // youngerUser.birthDay = LocalDate.parse("1994-02-21");

        // User olderUser = new User();
        // olderUser.name = "Kevin Cruse";
        // olderUser.birthDay = LocalDate.parse("1997-05-30");

        User youngerUser = new User("Charles Cruse", "1994-02-21");
        User olderUser = new User("Kevin Cruse", "1997-05-30");

        // Below is the old way to get all the class properties when they were public,
        // but after switching to private we have to change stuff

        // System.out.printf("%s was born in %s and is now %d years old \n",
        // youngerUser.name,
        // youngerUser.birthDay.toString(), youngerUser.age());

        // System.out.printf("%s was born in %s and is now %d years old \n",
        // olderUser.name,
        // olderUser.birthDay.toString(), olderUser.age());

        Book book1 = new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook book2 = new AudioBook("Dracula", "Bram Stoker", 30000);
        Ebook book3 = new Ebook("Carry on", "P.G Wode", 280, "pdf");

        youngerUser.borrow(book1);
        youngerUser.borrow(book2);
        youngerUser.borrow(book3);

        // So the below code doesn't actually work, it will show the book's reference
        // and not the hash. Now all reference types always come with a .toString method
        // innately. This book class is a custom class so whatever object we work with
        // is a reference type, we need to make a toString method and put it in our
        // custom class
        System.out.printf("%s has borrowed these books: %s \n", youngerUser.getName(), youngerUser.borrowedBooks());
    }
}
