
public class Sundae extends IceCream{
	protected double priceTopping;
	protected String toppingName;
	
	public Sundae(String name, double price, String toppingName, double priceTopping) {
		this.name = name;
		this.price = price;
		this.toppingName = toppingName;
		this.priceTopping = priceTopping;
	}
	
	public int getCost() {
		return (int) Math.round (price + priceTopping);
	}
	
	public String toString() {
		String str = "";
		str += name + "        "+ (double)getCost()/100 +"\n";
		return str;
		
	}

}
