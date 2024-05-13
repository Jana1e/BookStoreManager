package bookstoremanager;

import java.util.ArrayList;
import java.util.List;

public class SalesManager implements InventoryObserver {
    private List<Order> orders;

    public SalesManager() {
        this.orders = new ArrayList<>();
    }
    @Override
    public void update(Book book, String action) {
        System.out.println("Sales Manager notified about book: " + book.getTitle() + ", Action: " + action);
    }
    public void processOrder(Order order) {
        orders.add(order);
    }

    // Getters and setters
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
