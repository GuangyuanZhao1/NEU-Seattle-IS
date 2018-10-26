
public class Cat extends Pet implements Boardable{
	private String hairLength;
	private int startMonth, startDay, startYear;
	private int endMonth, endDay, endYear;
	
	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}
	
	public String getHairLength() {
		return this.hairLength;
	}
	
	public String toString() {
		return "CAT:" + "\n" + super.toString() + "\n" + "Hair: " + this.getHairLength();
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
		Cat Tom = new Cat("Tom", "Bob","black","short");
		Tom.setBoardStart(11, 22, 1994);
		Tom.setBoardEnd(11, 25, 2018);
		Tom.setSex(SPAYED);
		System.out.println(Tom);
		System.out.println(Tom.boarding(10, 24, 2018));
	}

}
