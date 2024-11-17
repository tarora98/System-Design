package SystemDesign.Pattern.StrategyPattern.WithStrategyPattern;

// Use of Strategy Design Pattern
// Used when children used the same code and that code is not present in the Parent Class.

public class VehicleMain {

    public static void main(String args[]){
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
    }
}