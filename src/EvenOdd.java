import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number;
		number = scn.nextInt();
		
		if(number % 2 == 0) {
			System.out.print("이 숫자는 짝수입니다.");
		}else {
			System.out.print("이 숫자는 홀수입니다.");
		}
		

	}

}
