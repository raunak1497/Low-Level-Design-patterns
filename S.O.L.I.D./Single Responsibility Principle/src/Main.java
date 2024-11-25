public class Main {
    public static void main(String[] args) {
        Marker m = new Marker("Camel","Black",2012,30);
        Invoice inv =  new Invoice(m,30);
        //Without using SRP
//        System.out.println("The total price is: " + inv.calculateTotal());
//        inv.printInvoice();
//        inv.saveToDb();
        //Using SRP
        System.out.println("The total price is: " + inv.calculateTotal());
        InvoiceDao  invoice = new InvoiceDao(inv);
        InvoicePrint print =  new InvoicePrint(inv);
        print.printInvoice();
        invoice.saveToDb();

    }
}