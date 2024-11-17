package SystemDesign.Pattern.StrategyPattern.WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Sports Driver Capability");
    } 
}