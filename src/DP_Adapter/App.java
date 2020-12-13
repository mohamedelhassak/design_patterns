package DP_Adapter;

public class App {

	public static void main(String[] args) {
		Client client = new Client();
		
		client.setStd(new StandardImpl());
		client.process(5, 5);
		
		client.setStd(new StandardImpl2());
		client.process(5, 5);
		
		//utilser adapter
		client.setStd(new Adapter());
		client.process(5, 5);

	}

}
