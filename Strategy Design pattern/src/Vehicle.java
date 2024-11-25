//public class Vehicle {
//    public Vehicle(){
//
//    }
//
//    public void drive(){
//        System.out.println("Driving Normal");
//    }
//}

//Using strategy design pattern and using DriveStrategy Interface to create an Object of it.
public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}