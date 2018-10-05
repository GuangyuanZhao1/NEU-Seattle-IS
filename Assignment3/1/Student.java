
public class Student {
	private String name;
	private int id;
	
//	private Student() {
//		
//	}
	
	public Student(String Name, int Id) {
		this.name = Name;
		this.id = Id;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public void setId(int Id) {
		this.id = Id;
	}
	
	public String getName() {
		String n = name;
		return n;
	}
	
	public int getId() {
		int i = id;
		return i;
	}

}
