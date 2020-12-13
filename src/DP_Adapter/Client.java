package DP_Adapter;

public class Client {
	private StandardInterface std;
	
	public void process(int a ,int b) {
		std.operation(a, b);
	}

	public StandardInterface getStd() {
		return std;
	}

	public void setStd(StandardInterface std) {
		this.std = std;
	}
	
	
}
