import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("������ �Է����ּ��� : ");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.print("����� A���� �Դϴ�.");
		}else if(score >= 80) {
			System.out.print("����� B���� �Դϴ�.");
		}else if(score >= 70) {
			System.out.print("����� C���� �Դϴ�.");
		}else if(score >= 60) {
			System.out.print("����� D���� �Դϴ�.");
		}else {
			System.out.print("����� F���� �Դϴ�.");
		}
	}

}
