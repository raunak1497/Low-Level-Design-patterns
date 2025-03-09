public class Bike implements Vehicle {
    @Override
    public int getSeatCapacity() {
        return 2;
    }

    @Override
    public int getTankCapacity() {
        return 9;
    }

    @Override
    public String toString() {
        return "Bike (Seats: " + getSeatCapacity() + ", Tank: " + getTankCapacity() + " liters)";
    }
}