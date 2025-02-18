public class DatabaseInvoiceDaoImpl implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        System.out.println("Invoice saved to database");
    }
}
