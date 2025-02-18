public class FileInvoiceDaoImpl implements InvoiceDao {

    private String fileName;

    @Override
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to file: " );
    }
}
