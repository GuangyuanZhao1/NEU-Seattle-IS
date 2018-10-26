
public class Pet {
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
	
	public Pet (String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return name;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSex(int sexid) {
		this.sex = sexid;
	}
	
	public String getSex() {
		if(this.sex == MALE) {
			return "MALE";
		}
		else if(this.sex == FEMALE) {
			return "FEMALE";
		}
		else if(this.sex == SPAYED) {
			return "SPAYED";
		}
		else if(this.sex == NEUTERED){
			return "NEUTERED";
		}
		else {
			return "ERROR";
		}
	}
	
	public String toString() {
		return this.getPetName() + " owened by " + this.getOwnerName() + "\n" + "Color: " + this.getColor() + "\n" + "Sex: " + this.getSex();
	}


}
