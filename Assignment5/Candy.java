

public class Candy extends DessertItem{
	protected double weight;
	protected double pricePerPound;
	
    public Candy(){
    	
    }
	
	public Candy(String name){
		super(name);
	}
	
	public Candy(String name, double weight, double pricePerPound) {
		this.name = name;
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	public int getCost() {
		return (int)Math.round(weight * pricePerPound);
	}
	
	public String toString() {
		String str = "";
		str += weight + " lbs. @" + pricePerPound/100 + " /lb." + "\n" + name +"         " + (double)Math.round(weight * pricePerPound)/100 + "\n";
		return str;
	}

}
