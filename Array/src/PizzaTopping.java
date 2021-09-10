
public class PizzaTopping {

	public static void main(String[] args) {
//		String topping[] = {"Peperoni","Mushrooms","Onions","Sausage","Bacon"};
		String topping[] = new String[5];
		topping[0] = "Peperoni";
		topping[1] = "Mushrooms";
		topping[2] = "Onions";
		topping[3] = "Sausage";
		topping[4] = "Bacon";
		
		for (int i = 0; i < topping.length; i++) {
			System.out.println(topping[i]);
		}
	}

}
