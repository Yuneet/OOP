import java.util.Scanner;

public class bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TargetSales = 1000;
		int mySales;
		int bouns;
		String resurt;
		System.out.print("실적을 입력하세요(단위 : 만원) : ");
		mySales = sc.nextInt();
		
		if(mySales >= TargetSales) {
			resurt = "실적달성!";
			bouns = (mySales - TargetSales) / 10;
		}else {
			resurt = "실적실패!";
			bouns = 0;
		}
		System.out.println(resurt +" 보너스 : "+bouns);
	}

}
