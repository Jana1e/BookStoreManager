
package bookstoremanager;


public class Main {
    public static void main(String[] args) {
        Author author = new Author("Colleen Hoover");
        Customer customer = new Customer("Rahaf", "0509709409");
        // Strategy Pattern

         Order order = new Order(customer, new DiscountPriceStrategy(20));
        // Create FictionBook & NonFictionBook by Factory Method
        Book fictionBook = BookFactory.createBook("It Ends with Us", author, 150.40, "Fiction");
        Book nonFictionBook = BookFactory.createBook("The Power of Now", author, 100.99, "Non-Fiction");
        
         // Using Decorator pattern
        Book giftWrappedfictionBook = new GiftWrappedBook(fictionBook);
        order.addBook(giftWrappedfictionBook);
        Book giftWrappedNonFictionBook = new GiftWrappedBook(nonFictionBook);
        order.addBook(giftWrappedNonFictionBook);
        
        // Singleton instance // observer pattern
        SalesManager salesManager = new SalesManager();
        InventoryManager inventoryManager = InventoryManager.getInstance(); 
        inventoryManager.addObserver(salesManager);
        inventoryManager.addBook(fictionBook);
        inventoryManager.addBook(nonFictionBook);
        salesManager.processOrder(order);
        
        // Adapter Pattern
        CashPayment pay = new CashPayment();
        CreditCardPayment paycriditcard = new CreditCardPayment();
        Payment paymentAdapter = new CriditCardPaymentAdapter(paycriditcard);
       
        
        System.out.println("The Buyer: " + customer.getName());
        System.out.println("____");
        System.out.println("Book Name: " + fictionBook.getTitle());
        System.out.println("price: " + fictionBook.getPrice());
        System.out.println("price with Gift Wrap: " +giftWrappedfictionBook.getPrice());
        System.out.println("__");
        System.out.println("Book Name: " + nonFictionBook.getTitle());
        System.out.println("price: " + nonFictionBook.getPrice());
        System.out.println("___________________________");
        System.out.println("Total price: " + order.getTotalPrice());
        System.out.println(paymentAdapter.processPayment(order.getTotalPrice()));
        System.out.println("___________________________");
       
}}
