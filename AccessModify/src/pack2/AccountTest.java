package pack2;

public class AccountTest {
	public static void main(String[] args) {
		Account obj = new Account(123456);
		
		obj.setName("Tom");
		obj.setBalnce(100000);
		System.out.println("계좌번호는 " + obj.getRegNumber()+"이고 ");
		System.out.println("이름은 "+obj.getName()+"이고 잔고는 "+obj.getBalnce()+" 입니다.");
	}
}
