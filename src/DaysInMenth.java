import java.util.Scanner;

public class DaysInMenth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, days, year;
		
		System.out.print("년도를 입력하세요 : ");
		year = sc.nextInt();
		System.out.print("달을 입력하세요 : ");
		month = sc.nextInt();
		
		switch(month) {
		   	case 4:
		   	case 6:
		   	case 9:
		   	case 11:
		   		days = 30;
		   		break;
		   	case 2:
		   		if(year%4==0 && year%100!=0 || year%400 == 0) {
		   			days = 29;
		   		}else {
			   		days = 28;	
		   		}
		   		break;
		   	default:
		   		days = 31;
		}
		
		System.out.print(year+"년도의 "+month+"월 달의 일수는 "+days+"일 입니다.");

	}

}
