public class Main {
    public static void main(String[] args) {
        Vehicle lamborghini =  new SportVehicle();
        lamborghini.drive();
        Vehicle sedan = new PassengerVehicle();
        sedan.drive();
        Vehicle gypsy = new OffRoadVehicle();
        gypsy.drive();
    }
}
