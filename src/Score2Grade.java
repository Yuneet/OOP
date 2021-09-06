import java.util.Scanner;

public class Score2Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score, number;
		char grade;
		
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		number = score / 10;
		switch(number) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		System.out.print("당신의 학점은 "+ grade + "입니다.");
	}

}
