import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		final int STUDENT_NUMBER = 5;
		int total = 0;
		int[] score = new int[STUDENT_NUMBER];

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"�� ������ �Է��ϼ��� : ");
			score[i] = sc.nextInt();
		}
		
		for (int i = 0; i < score.length; i++) {
			total += score[i]; 
		}
		System.out.println("��ռ����� "+(double)total/STUDENT_NUMBER + "�Դϴ�.");
	}
}
