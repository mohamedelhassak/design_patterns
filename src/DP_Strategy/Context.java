package DP_Strategy;

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
