
class Animal {
	private double weight;
	String picture;
	
	void eat() {
		System.out.println("eate 호출");
	}
	
	void sleep() {
		System.out.println("sleep 호출");
	}
}

class Lion extends Animal{
	private int legs = 4;
	void roar() {
		System.out.println("roar 호출");
	}
}

class Eagle extends Animal{
	private int wings = 2;
	void fly() {
		System.out.println("fly 호출");
	}
}
