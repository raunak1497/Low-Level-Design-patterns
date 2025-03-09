import java.util.logging.Logger;

public class VehicleFactory {
    private static final Logger logger = Logger.getLogger(VehicleFactory.class.getName());

    public static Vehicle getVehicleObject(VehicleType vehicleType) {
        if (vehicleType == VehicleType.CAR) {
            logger.info("Creating a Car");
            return new Car();
        } else if (vehicleType == VehicleType.BIKE) {
            logger.info("Creating a Bike");
            return new Bike();
        } else {
            logger.warning("Unknown vehicle type. Returning NullVehicle");
            return NullVehicle.getInstance(); // Use singleton instance
        }
    }
}