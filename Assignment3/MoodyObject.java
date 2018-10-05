
public abstract class MoodyObject {
	
	String mood;
	protected abstract String getMood() ;
		//return mood;
	
	protected abstract void expressFeelings();
		
	
	public void queryMood() {
		System.out.println("I feel "+ getMood()+ " today!\n");
	}

}
