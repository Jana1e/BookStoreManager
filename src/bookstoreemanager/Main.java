package BookstoreeManager;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Colleen Hoover");
        Customer customer = new Customer("Rahaf", "0509709409");
        Order order = new Order(customer);

        // Create FictionBook & NonFictionBook by Factory Method
        Book fictionBook = BookFactory.createBook("It Ends with Us", author, 150.40, "Fiction");
        order.addBook(fictionBook);

        Book nonFictionBook = BookFactory.createBook("The Power of Now", author, 100.99, "Non-Fiction");
        order.addBook(nonFictionBook);

        SalesManager salesManager = new SalesManager();
        salesManager.processOrder(order);

        // Singleton instance
        InventoryManager inventoryManager = InventoryManager.getInstance(); 
        inventoryManager.addBook(fictionBook);
        inventoryManager.addBook(nonFictionBook);

        System.out.println("Book Name: " + order.getBooks().get(0).getTitle());
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println("The Buyer: " + customer.getName());
    }
}
