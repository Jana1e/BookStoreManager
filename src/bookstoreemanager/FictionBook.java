package BookstoreManager;

public class FictionBook extends Book {
    public FictionBook(String title, Author author, double price) {
        super(title, author, price);
    }

    @Override
    public String getBookType() {
        return "Fiction";
    }
}