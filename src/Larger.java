import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		int x, y, max;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		x = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		y = sc.nextInt();
		
//		if(x > y) {
//			max = x;
//		}else {
//			max = y;
//		}
		max = (x > y)?x:y;
		
		System.out.println("두 숫자 중 큰 값은 "+ max);

	}

}
