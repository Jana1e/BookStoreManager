package BookstoreManager;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private static InventoryManager instance;
    private List<Book> books;

    private InventoryManager() {
        this.books = new ArrayList<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
    
}
