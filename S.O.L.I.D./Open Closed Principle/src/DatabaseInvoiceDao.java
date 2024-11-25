public abstract class DatabaseInvoiceDao implements InvoiceDao {
    @Override
    public void saveToDb() {
        System.out.println("Saving to Database");//created a separate class
    }
}
