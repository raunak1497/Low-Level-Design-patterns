//Follows SRP
public class Invoice {
    private Marker marker;
    private int quantity;
    private PricingStrategy pricingStrategy;
    private InvoiceDao invoiceDao;

    public Invoice(Marker marker, int quantity,PricingStrategy pricingStrategy, InvoiceDao invoiceDao) {
        this.marker = marker;
        this.quantity = quantity;
        this.pricingStrategy = pricingStrategy;
        this.invoiceDao = invoiceDao;
    }

    public int calculateTotal(){ //Changing just this would change the class ->1
        return pricingStrategy.calculateTotal(marker.price, quantity);
    }

    public void save(){
        invoiceDao.save(this);
    }
}