import java.util.Scanner;

public class bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TargetSales = 1000;
		int mySales;
		int bouns;
		String resurt;
		System.out.print("������ �Է��ϼ���(���� : ����) : ");
		mySales = sc.nextInt();
		
		if(mySales >= TargetSales) {
			resurt = "�����޼�!";
			bouns = (mySales - TargetSales) / 10;
		}else {
			resurt = "��������!";
			bouns = 0;
		}
		System.out.println(resurt +" ���ʽ� : "+bouns);
	}

}
