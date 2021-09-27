
public class TelevisionTest {

	public static void main(String[] args) {
		Television1 tv1 = new Television1();
		Television1 tv2 = new Television1();
		Television1 tv3 = new Television1();
		
		tv1.setChannel(7);
		tv1.setVolume(9);
		tv1.onOff = true;

		tv2.setChannel(8);
		tv2.setVolume(10);
		tv2.onOff = false;
		
		tv3.setChannel(24);
		tv3.setVolume(15);
		tv3.onOff = true;
		
		tv1.print();
		tv2.print();
		tv3.print();
	}
}
