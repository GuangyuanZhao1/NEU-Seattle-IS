
public class MyIndexOutOfBoundsException extends IndexOutOfBoundsException {
	private int lowerBound;
	private int upperBound;
	private int index;
	
	public MyIndexOutOfBoundsException(int lowerBound, int upperBound, int index) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.index = index;
	}
	
	public String toString() {
		return "Error Message: Index: " + index + " , but Lower bound: " + lowerBound + ", Upper bound: " + upperBound;
	}
	
	
	public static void main(String[] args) throws MyIndexOutOfBoundsException{
		int l = 0, u = 9, i = 10;
		try {
			if(i < l || i > u) {
				throw new MyIndexOutOfBoundsException(l, u, i);
			}
			else {
				System.out.println("Go on!");
			}
		}
		catch(Exception e) {
			throw e;
		}
	}

}
