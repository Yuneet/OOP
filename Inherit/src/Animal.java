
class Animal {
	private double weight;
	String picture;
	
	void eat() {
		System.out.println("eate ȣ��");
	}
	
	void sleep() {
		System.out.println("sleep ȣ��");
	}
}

class Lion extends Animal{
	private int legs = 4;
	void roar() {
		System.out.println("roar ȣ��");
	}
}

class Eagle extends Animal{
	private int wings = 2;
	void fly() {
		System.out.println("fly ȣ��");
	}
}
