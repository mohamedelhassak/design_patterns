package DP_Adapter3;

public interface FileManagerInterface {

	public String open(String s);
	public String close();
	public String read(int pos, int amount, byte[] data);
	public String write(int pos, int amount, byte[] data);
}
