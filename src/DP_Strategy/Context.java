package DP_Strategy;

import DP_Strategy.strategies.IStrategey;
import DP_Strategy.strategies.StrategyImplDefault;

public class Context {
	private IStrategey strategey;

	public void process() {
		strategey.applyStrategy();
	}
	public Context() {
		
		this.strategey = new StrategyImplDefault();
	}

	public IStrategey getStrategey() {
		return strategey;
	}

	public void setStrategey(IStrategey strategey) {
		this.strategey = strategey;
	}
	
	

}
