//public class OffRoadVehicle extends Vehicle {
//    @Override
//    public void drive(){ //This is a duplicate code in SportVehicle also
//        System.out.println("Special drive");
//    }
//}

//Using Super method to call the DriveStrategy method
public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SpecialDrive());
    }
}