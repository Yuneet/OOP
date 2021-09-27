
public class Car {
	String color;
	int speed;
	int gear;
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
	void speedUp() {
		speed += 10;
	}
	
	void speedDown() {
		speed -= 10;
	}
}
