// Default pricing strategy
public class DefaultPricingStrategy implements PricingStrategy {
    @Override
    public int calculateTotal(int price, int quantity) {
        return price * quantity;
    }
}
