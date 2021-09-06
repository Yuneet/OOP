import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y,sum;
		
		System.out.print("첫 번째 입력 : ");
		x = input.nextInt();
		
		System.out.print("두 번째 입력 : ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.print("두 숫자의 합 : "+sum);
		input.close();
	}
}
