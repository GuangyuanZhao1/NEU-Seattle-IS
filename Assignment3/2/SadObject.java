
public class SadObject extends MoodyObject{
	
	String mood = "sad";
	
	protected String getMood() {
		return mood;
	}
	
	public void expressFeelings() {
		System.out.println(" 'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}
	
	public String toString() {
		return "Subject cries a lot \n";
	}

}
