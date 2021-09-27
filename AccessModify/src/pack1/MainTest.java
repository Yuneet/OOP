package pack1;

public class MainTest {

	public static void main(String[] args) {
		PrivTest obj1 = new PrivTest();
		obj1.printB();
		DefaultTest obj2 = new DefaultTest();
		obj2.c = 1;
		obj2.d = 2;
		obj2.printC();
	}

}
