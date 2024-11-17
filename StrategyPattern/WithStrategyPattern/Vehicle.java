package SystemDesign.Pattern.StrategyPattern.WithStrategyPattern;

import SystemDesign.Pattern.StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;;

public class Vehicle {

    DriveStrategy driveObject;

    // this is know as constructor injection
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
}
