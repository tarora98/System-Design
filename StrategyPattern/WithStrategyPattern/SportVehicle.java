package SystemDesign.Pattern.StrategyPattern.WithStrategyPattern;


import SystemDesign.Pattern.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle {

    SportVehicle() {
        super(new SportsDriveStrategy());
    }
    
}
