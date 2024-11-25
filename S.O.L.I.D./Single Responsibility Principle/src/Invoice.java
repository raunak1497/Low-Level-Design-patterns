//class doesn't follow SRP
//public class Invoice {
//    private Marker marker;
//    private int quantity;
//
//    public Invoice(Marker marker, int quantity) {
//        this.marker = marker;
//        this.quantity = quantity;
//    }
//
//    public int calculateTotal(){ //Changing just this would change the class ->1
//        int price = quantity*marker.price;
//        return price;
//    }
//
//    public void printInvoice(){ //Changing just this would change the class ->2
//        System.out.println("This is invoice");
//    }
//
//    public void saveToDb(){ //Changing just this would change the class ->3
//        System.out.println("Saving to Database");
//    }
//}

//Follows SRP
public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){ //Changing just this would change the class ->1
        int price = (this.quantity)*(marker.price);
        return price;
    }
}