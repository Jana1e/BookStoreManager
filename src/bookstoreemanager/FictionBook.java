package BookstoreeManager;

public class FictionBook implements Book {
    private String title;
    private Author author;
    private double price;

    public FictionBook(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getBookType() {
        return "Fiction";
    }
}
