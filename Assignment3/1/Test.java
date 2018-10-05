
public class Test {
	public static void main(String[] args) {
		Course java = new Course("java");
		Student s1 = new Student("zgy", 1111);
		Student s2 = new Student("Tom", 1112);
		Student s3 = new Student("Jim", 1113);
		Student s4 = new Student("Jerry", 1114);
		Student s5 = new Student("John", 1115);
		Student s6 = new Student("Tim", 1116);
		Student s7 = new Student("Lucy", 1117);
		Student s8 = new Student("Lily", 1118);
		Student s9 = new Student("Lee", 1119);
		Student s10 = new Student("Ann", 1110);
		Student s11 = new Student("Bob", 1111);
		java.register(s1);
		java.register(s2);
		java.register(s3);
		java.register(s4);
		java.register(s5);
		java.register(s6);
		java.register(s7);
		java.register(s8);
		java.register(s9);
		java.register(s10);
		java.register(s11);
		System.out.println(java.getNumberOfStudent());
		for(Student n: java.getStudent()) {
			if(n != null)
				System.out.println("name: " + n.getName() + " ID:" + n.getId());
		}
		
		
	}

}
