import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int[] s = new int[10];
		Scanner sc = new Scanner(System.in);
		int value, index = -1;
		
		for (int i = 0; i < s.length; i++) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			s[i] = sc.nextInt();
		}
		System.out.print("배열에서 탐색할 값 입력 : ");
		value = sc.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if(s[i] == value) {
				index = i;
			}
		}
		
		if(index == -1) {
			System.out.println("배열에는 "+value+" 값이 없습니다.");
		}else {
			System.out.println("배열에는 "+value+ "값이 "+s[index]+"에 있습니다.");
		}

	}

}
