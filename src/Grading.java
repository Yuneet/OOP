import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력해주세요 : ");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.print("당신은 A학점 입니다.");
		}else if(score >= 80) {
			System.out.print("당신은 B학점 입니다.");
		}else if(score >= 70) {
			System.out.print("당신은 C학점 입니다.");
		}else if(score >= 60) {
			System.out.print("당신은 D학점 입니다.");
		}else {
			System.out.print("당신은 F학점 입니다.");
		}
	}

}
