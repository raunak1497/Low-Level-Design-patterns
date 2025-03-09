public class NullVehicle implements Vehicle {
    private static final NullVehicle INSTANCE = new NullVehicle();

    private NullVehicle() {} // Private constructor

    public static NullVehicle getInstance() {
        return INSTANCE;
    }

    @Override
    public int getSeatCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public String toString() {
        return "NullVehicle (No vehicle found)";
    }
}