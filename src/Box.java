import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		double w, h, area, primater;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 너비 입력 : ");
		w = sc.nextDouble();
		
		System.out.print("사각형의 높이 입력 : ");
		h = sc.nextDouble();
		
		area = w * h ;
		primater = 2.0 * (w * h);
		
		System.out.println("사각형의 면적은 " + area);
		System.out.println("사각형의 둘레는 " + primater);
		sc.close();
	}

}
