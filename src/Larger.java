import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		int x, y, max;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		x = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		y = sc.nextInt();
		
//		if(x > y) {
//			max = x;
//		}else {
//			max = y;
//		}
		max = (x > y)?x:y;
		
		System.out.println("�� ���� �� ū ���� "+ max);

	}

}
