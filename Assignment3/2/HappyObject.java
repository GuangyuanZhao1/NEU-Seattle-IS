
public class HappyObject extends MoodyObject{
	
	String mood = "happy";
	
	protected String getMood() {
		return mood;
	}
	
	public void expressFeelings() {
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
	}
	
	public String toString() {
		return "Subject laughs a lot \n";
	}

}
