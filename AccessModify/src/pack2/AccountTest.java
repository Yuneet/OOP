package pack2;

public class AccountTest {
	public static void main(String[] args) {
		Account obj = new Account(123456);
		
		obj.setName("Tom");
		obj.setBalnce(100000);
		System.out.println("���¹�ȣ�� " + obj.getRegNumber()+"�̰� ");
		System.out.println("�̸��� "+obj.getName()+"�̰� �ܰ��� "+obj.getBalnce()+" �Դϴ�.");
	}
}