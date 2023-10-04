public class AudioBook extends Book {
    // because this extends on book class, it has all properties and methods
    // described in Book

    private int runTime;

    // Calling super will refer to parent class of current, so we are calling
    // constructor of parent class, and set pageCount to 0 if we want which we take
    // out of constructor
    AudioBook(String title, String author, int runTime) {
        super(title, author, 0);
        this.runTime = runTime;
    }
}
