
public class MoodyTest {
	
	public static void main(String[] args) {
		MoodyObject happy = new HappyObject();
		MoodyObject sad = new SadObject();
		PsychiatristObject Psychiatrist = new PsychiatristObject();
		Psychiatrist.examine(happy);
		Psychiatrist.observe(happy);
		Psychiatrist.examine(sad);
		Psychiatrist.observe(sad);
	}

}
