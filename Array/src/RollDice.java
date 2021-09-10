import java.util.Iterator;

public class RollDice {

	public static void main(String[] args) {
		final int SIZE = 6;
		int[] freq = new int[SIZE];
	    for (int i = 0; i < 100; i++) {
			++freq[(int)(Math.random()*SIZE)];
		}
		
	    for (int i = 0; i < SIZE; i++) {
			System.out.println((i+1)+"번이 나온 횟수 + " +  freq[i]);
		}

	}

}
