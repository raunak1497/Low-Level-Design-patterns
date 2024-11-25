public class Main {
    public static void main(String[] args) {
        Vehicle vehicle =  new SportVehicle();
        vehicle.drive();
        Vehicle car = new PassengerVehicle();
        car.drive();
    }
}
