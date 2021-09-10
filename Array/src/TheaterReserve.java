import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		final int SIZE = 10;
		int[] seats = new int[SIZE];
		
		while(true) {
			System.out.println("=================================");
			for (int i = 0; i < seats.length; i++) {
				System.out.printf("%3d",i+1);
			}
			System.out.println();
			System.out.println("=================================");
			for (int i = 0; i < seats.length; i++) {
				System.out.printf("%3d",seats[i]);
			}
			System.out.println();
			System.out.println("=================================");
			Scanner sc = new Scanner(System.in);
			int s;
			System.out.print("������ �¼� ��ȣ�� �Է��ϼ��� : ");
			s = sc.nextInt();
			
			if(s == -1) {
				break;
			}
			if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("������ �Ǿ����ϴ�.");
			}else {
				System.out.println("�̹� ����� �¼��Դϴ�.");
			}
		}

	}
}
