import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int[] s = new int[10];
		Scanner sc = new Scanner(System.in);
		int value, index = -1;
		
		for (int i = 0; i < s.length; i++) {
			System.out.print((i+1)+"��° ���� �Է� : ");
			s[i] = sc.nextInt();
		}
		System.out.print("�迭���� Ž���� �� �Է� : ");
		value = sc.nextInt();
		
		for (int i = 0; i < s.length; i++) {
			if(s[i] == value) {
				index = i;
			}
		}
		
		if(index == -1) {
			System.out.println("�迭���� "+value+" ���� �����ϴ�.");
		}else {
			System.out.println("�迭���� "+value+ "���� "+s[index]+"�� �ֽ��ϴ�.");
		}

	}

}
