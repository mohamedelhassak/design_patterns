package Behavioral_Patterns.DP_Strategy;

import Behavioral_Patterns.DP_Strategy.strategies.IStrategey;
import Behavioral_Patterns.DP_Strategy.strategies.StrategyImplDefault;

public class Context {
    private IStrategey strategey;

    public Context() {

        this.strategey = new StrategyImplDefault();
    }

    public void process() {
        strategey.applyStrategy();
    }

    public IStrategey getStrategey() {
        return strategey;
    }

    public void setStrategey(IStrategey strategey) {
        this.strategey = strategey;
    }


}
