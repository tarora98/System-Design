package SystemDesign.Pattern.StrategyPattern.WithStrategyPattern;

import SystemDesign.Pattern.StrategyPattern.WithStrategyPattern.Strategy.NormalDriverStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle(){
        super(new NormalDriverStrategy());
    }
}
