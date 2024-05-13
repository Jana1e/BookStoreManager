package BookstoreManager;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private static InventoryManager instance;
    private List<Book> books;
    private List<InventoryObserver> observers = new ArrayList<>();

    private InventoryManager() {
        this.books = new ArrayList<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addObserver(InventoryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(InventoryObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book, String action) {
        for (InventoryObserver observer : observers) {
            observer.update(book, action);
        }
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book, "added");
    }

    public void removeBook(Book book) {
        books.remove(book);
        notifyObservers(book, "removed");
    }


    public List<Book> getBooks() {
        return books;
    }

    
}
