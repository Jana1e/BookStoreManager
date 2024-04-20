package BookstoreManager;
import java.util.ArrayList;
import java.util.List;

public class SalesManager {
    private List<Order> orders;

    public SalesManager() {
        this.orders = new ArrayList<>();
    }

    public void processOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
