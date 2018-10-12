
// nice
public class ReverseString {
	public String reverse(String s) {
		s = s.toLowerCase();
		String[] temp = s.split("[\\s]+");
		int i;
		String n = new String();
		for (i = temp.length - 1; i >= 0; i--) {
			n = n + temp[i] + " ";
		}
		return n;
	}
	
	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverse("  The sky is       blue           "));
		
	}

}
