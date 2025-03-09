public class Car implements Vehicle {
    @Override
    public int getSeatCapacity() {
        return 5;
    }

    @Override
    public int getTankCapacity() {
        return 23;
    }

    @Override
    public String toString() {
        return "Car (Seats: " + getSeatCapacity() + ", Tank: " + getTankCapacity() + " liters)";
    }
}