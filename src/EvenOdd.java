import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number;
		number = scn.nextInt();
		
		if(number % 2 == 0) {
			System.out.print("�� ���ڴ� ¦���Դϴ�.");
		}else {
			System.out.print("�� ���ڴ� Ȧ���Դϴ�.");
		}
		

	}

}
