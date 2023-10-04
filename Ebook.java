public class Ebook extends Book {
    private String format;

    // Calling super will refer to parent class of current, so we are calling
    // constructor of parent class, and set pageCount to 0 if we want which we take
    // out of constructor
    Ebook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;
    }
}
