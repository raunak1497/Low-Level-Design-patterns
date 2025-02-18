public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Camel","Black",2012,30);

        PricingStrategy defaultPricingStrategy = new DefaultPricingStrategy();
        InvoiceDao fileInvoiceDao = new FileInvoiceDaoImpl();
        Invoice invoice = new Invoice(marker, 30, defaultPricingStrategy, fileInvoiceDao);

        System.out.println("Total price : " + invoice.calculateTotal());
        invoice.save();

        //use DB saving mechanism
        InvoiceDao databaseInvoiceDao = new DatabaseInvoiceDaoImpl();
        Invoice dbInvoice = new Invoice(marker, 30, defaultPricingStrategy, databaseInvoiceDao);
        dbInvoice.save();
    }
}