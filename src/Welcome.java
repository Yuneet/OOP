import java.util.Calendar;
import java.util.Date;

public class Welcome {

	public static void main(String[] args) {
//		Date date = new Date();
//		int currentHour = date.getHours();
		Calendar cal = Calendar.getInstance();
		int currentHour = cal.get(Calendar.HOUR_OF_DAY);
		
		
		System.out.println("현재시간 : " +  currentHour);
		if(currentHour < 11) {
			System.out.print("Good Moning");
		}else if(currentHour < 15) {
			System.out.print("Good Aftrnoon");
		}else if(currentHour < 20) {
			System.out.print("Good Evening");
		}else {
			System.out.print("Good nit");
		}
	}

}
