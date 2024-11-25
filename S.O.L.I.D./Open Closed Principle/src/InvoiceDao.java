public interface InvoiceDao {
    public void save(Invoice invoice);

    void saveToFile(String filename);

    void saveToDb();
}

////Follows SRP
//public class InvoiceDao {
//    Invoice invoice;
//
//    public InvoiceDao(Invoice invoice) {
//        this.invoice = invoice;
//    }
//
//    public void saveToDb() {
//        System.out.println("Saving to Database");//created a separate class
//    }
//
//    //Doesn't follow Open-Closed Principle
//    public void saveToFile(String filename) {
//        System.out.println("Saving to File: " + filename);
//    }
//
//
//}