package BookstoreeManager;



public class BookFactory {
    public static Book createBook(String title, Author author, double price, String type) {
        if ("Fiction".equalsIgnoreCase(type)) {
            return new FictionBook(title, author, price);
        } else if ("Non-Fiction".equalsIgnoreCase(type)) {
            return new NonFictionBook(title, author, price);
        } else {
            throw new IllegalArgumentException("Invalid book type: " + type);
        }
    }
}
