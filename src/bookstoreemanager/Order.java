package BookstoreManager;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Book> books;
    private double totalPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.books = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addBook(Book book) {
        books.add(book);
        totalPrice += book.getPrice();
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
   
