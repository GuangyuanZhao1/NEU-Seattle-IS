
public class Test {
	public static void main(String[] args) {
		Assignment4 a = new Assignment4();
		int[] array = {0,12,8,9,0,1,3,0,46,0,136,0,0,0,25};
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(a.firstUniqChar("iloveyouilveyug"));
		System.out.println(a.addDigits(99999999));
		a.moveZeroes(array);
		a.rotate(matrix);
		System.out.println(a.longestPalindrome("jkl;oudababadpoiuhyeqr"));
		
	}

}
