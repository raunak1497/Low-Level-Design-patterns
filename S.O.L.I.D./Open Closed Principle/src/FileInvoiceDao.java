public abstract class FileInvoiceDao implements InvoiceDao {
    @Override
    public void saveToFile(String filename) {
        System.out.println("Saving to File: " + filename);
    }
}
