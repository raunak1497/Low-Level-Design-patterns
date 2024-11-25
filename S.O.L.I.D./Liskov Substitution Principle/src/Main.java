import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Motorcycle());
        //adding Bicycle will throw NULL pointer exception
        vehicleList.add(new Bicycle());

        for(Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.getNoOfWheels().toString());
        }
    }
}