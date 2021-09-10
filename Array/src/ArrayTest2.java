import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		final int STUDENT_NUMBER = 5;
		int total = 0;
		int[] score = new int[STUDENT_NUMBER];

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"번 성적을 입력하세요 : ");
			score[i] = sc.nextInt();
		}
		
		for (int i = 0; i < score.length; i++) {
			total += score[i]; 
		}
		System.out.println("평균성적은 "+(double)total/STUDENT_NUMBER + "입니다.");
	}
}
