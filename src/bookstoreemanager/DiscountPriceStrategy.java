package bookstoremanager;
public class DiscountPriceStrategy implements PricingStrategy {
    private double discount;

    public DiscountPriceStrategy(double discountPercentage) {
        this.discount = discountPercentage;
    }

    public double calculatePrice(Book book) {
        double discountAmount = book.getPrice() * (discount / 100);
        return book.getPrice() - discountAmount;
    }
}