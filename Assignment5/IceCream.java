
public class IceCream extends DessertItem{
//	protected int number;
	protected double price;
	
	public IceCream() {
		
	}
	
	public IceCream(String name) {
		super(name);
	}
	
	public IceCream(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public int getCost() {
		return (int)Math.round(price);
	}
	
	public String toString() {
		String str = "";
		str += name + "           "+ (double)getCost()/100 +"\n";
		return str;
		
	}

}



