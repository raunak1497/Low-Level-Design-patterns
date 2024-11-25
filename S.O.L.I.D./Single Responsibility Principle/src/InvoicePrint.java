//Follows SRP
public class InvoicePrint {
    Invoice invoice;

    public InvoicePrint(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("This is invoice");
    }
}
