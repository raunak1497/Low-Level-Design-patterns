// Discount pricing strategy
public class DiscountPricingStrategy implements PricingStrategy {
    private int discountPercentage;

    public DiscountPricingStrategy(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int calculateTotal(int price, int quantity) {
        int total = price * quantity;
        return total - (total * discountPercentage / 100);
    }
}
