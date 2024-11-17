package SystemDesign.Pattern.StrategyPattern.WithStrategyPattern;
import SystemDesign.Pattern.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {super(new SportsDriveStrategy());
    }

}
