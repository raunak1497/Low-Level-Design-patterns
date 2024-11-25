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