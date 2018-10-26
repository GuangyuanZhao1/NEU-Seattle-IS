
public class Dog extends Pet implements Boardable{
	private String size;
	private int startMonth, startDay, startYear;
	private int endMonth, endDay, endYear;
	
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public String toString() {
		return "DOG:" + "\n" + super.toString() + "\n" + "Size: " + this.getSize();
	}
	
	public void setBoardStart(int month, int day, int year) {
		if(month >= 1 && month <= 12 && day >= 1 && day <=31 && year >= 1000 && year <= 9999) {
			this.startMonth = month;
			this.startDay = day;
			this.startYear = year;
		}
		else {
			System.out.println("Your input is illegal.");
		}
		
	}
	
	public void setBoardEnd(int month, int day, int year) {
		if(month >= 1 && month <= 12 && day >= 1 && day <=31 && year >= 1000 && year <= 9999) {
			this.endMonth = month;
			this.endDay = day;
			this.endYear = year;
		}
		else {
			System.out.println("Your input is illegal.");
		}
	}
	
	public boolean boarding(int month, int day, int year) {
		if(month >= 1 && month <= 12 && day >= 1 && day <=31 && year >= 1000 && year <= 9999) {
			if(year > this.startYear && year < this.endYear) {
				return true;
			}
			else if(year == this.startYear && month > this.startMonth) {
				return true;
			}
			else if(year == this.endYear && month < this.endMonth) {
				return true;
			}
			else if (year == this.startYear && month == this.startMonth && day >= this.startDay) {
				return true;
			}
			else if(year == this.endYear && month == this.endMonth && day <= this.endDay) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Dog Spot = new Dog("Spot", "Susan","white","medium");
		Spot.setBoardStart(11, 22, 1994);
		Spot.setBoardEnd(11, 25, 2018);
		Spot.setSex(SPAYED);
		System.out.println(Spot);
		System.out.println(Spot.boarding(11, 26, 2018));
	}

}
