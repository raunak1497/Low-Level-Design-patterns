import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Motorcycle());
        vehicleList.add(new Bicycle());

        for(Vehicle vehicle: vehicleList) {
            System.out.println("Number of wheels: " + vehicle.getNoOfWheels());
            if(vehicle instanceof EngineVehicle){
                System.out.println("Has Engine : " + ((EngineVehicle) vehicle).hasEngine());
            }else if(vehicle instanceof NonEngineVehicle){
                System.out.println("Has Engine : " + ((NonEngineVehicle) vehicle).hasEngine());
            }

        }
    }
}