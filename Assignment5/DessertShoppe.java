
public class DessertShoppe {
	final static double taxRate = 0.065;
	final static String name = "M & M Dessert Shoppe ";

	public String cents2dollarsAndCents(int cost){
		String str = "";
		if(cost / 100 != 0) {
			str += cost / 100;
		} else {
			str += "." + cost % 100;
		}
		
		return str;
	}
	

}
