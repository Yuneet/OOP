import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		double w, h, area, primater;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�簢���� �ʺ� �Է� : ");
		w = sc.nextDouble();
		
		System.out.print("�簢���� ���� �Է� : ");
		h = sc.nextDouble();
		
		area = w * h ;
		primater = 2.0 * (w * h);
		
		System.out.println("�簢���� ������ " + area);
		System.out.println("�簢���� �ѷ��� " + primater);
		sc.close();
	}

}
