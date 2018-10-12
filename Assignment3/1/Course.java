
// 5/5
public class Course {
	private String name;
	private int numberOfStudent = 0;
	Student[] student = new Student[10];
	
	public Course(String Name) {
		this.name = Name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNumberOfStudent(int n) {
		this.numberOfStudent = n;
	}
	
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	
	public void setStudent(Student s) {
		if(isFull() == false) {
			student[numberOfStudent] = s;
			numberOfStudent ++;
		}
		else {
			System.out.println("This course is full");
		}
		
	}
	
	public Student[] getStudent() {
		return student;
	}
	
	
	public boolean isFull() {
		if (numberOfStudent < 10) 
			return false;
		else
			return true;
	}
	
	public void register(Student s) {
		if (isFull()) {
			System.out.println("Sorry, you cannot register this course. This course is full");
		}
		else {
			setStudent(s);
			System.out.println("You have successfully registered this course, and you are No" + numberOfStudent +" student to register this course.");
		}
	}

}
