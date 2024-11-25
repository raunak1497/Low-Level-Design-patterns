public class Main {
    public static void main(String[] args) {
        Marker m = new Marker("Camel","Black",2012,30);
        Invoice inv =  new Invoice(m,30);
        //Using SRP
        System.out.println("The total price is: " + inv.calculateTotal());
        InvoiceDao invoice  = new InvoiceDao(inv);
        FileInvoiceDao  fileInvoice = new FileInvoiceDao();
        DatabaseInvoiceDao dataInvoice =  new DatabaseInvoiceDao();
        fileInvoice.saveToFile("FileInvoice.txt");
        dataInvoice.saveToDb();
    }
}