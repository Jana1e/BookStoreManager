package BookstoreManager;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, Author author, double price) {
        super(title, author, price);
    }

    @Override
    public String getBookType() {
        return "Non-Fiction";
    }
}
