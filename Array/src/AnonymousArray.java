
public class AnonymousArray {

	public static void main(String[] args) {
		System.out.println("숫자들의 합 : "+ sum(new int[] {1,2,3,4,5}));
	}
	
	public static int sum(int[] number) {
		int total = 0;
		for (int i = 0; i < number.length; i++) {
			total += number[i];
		}
		return total;
	}
}
