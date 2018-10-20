
public class Cookie extends DessertItem{
	protected int number;
	protected double pricePerDozen;
	
	public Cookie() {
		
	}
	
	public Cookie(String name) {
		super(name);
	}
	
	public Cookie(String name, int number, double pricePerDozen) {
		this.name = name;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	public int getCost() {
		return (int) Math.round(number * pricePerDozen / 12);
	}
	
	public String toString() {
		String str = "";
		str += number + " @ " + pricePerDozen + " /dz." + "\n" + name +"      " + (double) Math.round(number * pricePerDozen / 12)/100 + "\n";
		return str;
	}

}
