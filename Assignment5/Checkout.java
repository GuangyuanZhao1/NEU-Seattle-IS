import java.util.Vector;

public class Checkout {
	protected Vector<DessertItem> v = new Vector<>();
	
	public Checkout() {
		
	}
	
	public int numberOfItems() {
		return v.size();
	}
	
	public void enterItem(DessertItem item) {
		v.add(item);
	}
	
	public void clear() {
		v.clear();
	}
	
	public int totalCost() {
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			sum += v.get(i).getCost();
		}
		return sum;
	}
	
	public int totalTax() {
		return (int) Math.round(DessertShoppe.taxRate * totalCost());
	}
	
	public String toString() {
		String str = new String();
		for(int i = 0; i < v.size(); i++) {
			str += v.get(i);
		}
		str += "Tax                     " + (double)totalTax()/100 + "\n";
		str += "Total Cost              " + (double)(totalCost() + totalTax()) / 100 + "\n";
		return str;
		
	}



}