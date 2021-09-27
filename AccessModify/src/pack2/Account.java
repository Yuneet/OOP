package pack2;

public class Account {
	int regNumber;
	private String name;
	private int balnce;
	
	public Account(int regNumber) {
		super();
		this.regNumber = regNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalnce() {
		return balnce;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setBalnce(int balnce) {
		this.balnce = balnce;
	}
}
