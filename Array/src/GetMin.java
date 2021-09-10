import java.util.Scanner;

public class GetMin {

	public static void main(String[] args) {
//		int s[] = {12,3,19,6,8,4,5,1,6,10};
		int s[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int mininum,maxnum;
		
		for (int i = 0; i < s.length; i++) {
			System.out.println((i+1) + "번째 정수 입력 : ");
			s[i] = sc.nextInt();
		}
		
		mininum = s[0];
		maxnum = s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(mininum > s[i])
				mininum = s[i];
			if(maxnum < s[i])
				maxnum = s[i];
		}
		System.out.println("최소값 : " + mininum + " 최대값 : "+ maxnum);
	}

}
