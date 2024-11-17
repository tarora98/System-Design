package SystemDesign.Pattern.StrategyPattern.WithStrategyPattern.Strategy;

public class NormalDriverStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Sports Driver Capability");
    }
    
}
