public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject(VehicleType.BIKE);
        printVehicleDetails(vehicle);

        vehicle = VehicleFactory.getVehicleObject(VehicleType.CAR);
        printVehicleDetails(vehicle);

        vehicle = VehicleFactory.getVehicleObject(null); // Test unknown type
        printVehicleDetails(vehicle);
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Vehicle Details: " + vehicle);
        System.out.println("Seating Capacity: " + vehicle.getSeatCapacity());
        System.out.println("Tank Capacity: " + vehicle.getTankCapacity());
        System.out.println();
    }
}