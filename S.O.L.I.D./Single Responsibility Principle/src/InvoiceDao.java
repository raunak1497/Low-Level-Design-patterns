//Follows SRP
public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {
        System.out.println("Saving to Database");//created a separate class
    }
}
