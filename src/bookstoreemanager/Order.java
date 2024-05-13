package bookstoremanager;

import java.util.*;

public class Order {
    private Customer customer;
    private List<Book> books;
    private double totalPrice;
    private PricingStrategy pricingStrategy;

    
     public Order(Customer customer, PricingStrategy strategy) {
        this.customer = customer;
        this.books = new ArrayList<>();
        this.totalPrice = 0.0;
        this.pricingStrategy = strategy;
    }

    public void setPricingStrategy(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
    }

    public void addBook(Book book) {
        books.add(book);
        totalPrice += book.getPrice();
    }

    // Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

   

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Book book : books) {
            double bookPrice = pricingStrategy.calculatePrice(book);
            totalPrice += bookPrice;
        }
        return totalPrice;
    }
