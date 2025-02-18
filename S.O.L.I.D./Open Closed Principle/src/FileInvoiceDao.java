public interface FileInvoiceDao {
    void saveToFile(Invoice invoice, String filename);
}
