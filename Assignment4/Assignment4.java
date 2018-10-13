public class Assignment4 {
	
	/**
	 * The deadline of assignment4 is 10/12/2018 23:59 PST.
	 * Please feel free to contact Zane and Amanda for any questions.
	 */
	
	/*
	 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
	 * s = "leetcode" return 0. 
	 * s = "loveleetcode" return 2.
	 */
    public int firstUniqChar(String s) {
    	int freq[] = new int[26];
    	for(int i=0; i<s.length(); i++) {
    		freq[s.charAt(i)-'a']++;
    	
    	}
    	for(int i=0; i<s.length(); i++) {
    		if(freq[s.charAt(i)-'a']==1) {
    			return i;
    		}
    	}
    	return -1;
  
     }
    
    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
    		int y = 0;
    		int z = 0;
    		while(n!=0) {
    			y = n%10;
    			n = n/10;
    			z = z+y;
    			
    		}
    		if(z >=10) {
    			return addDigits(z);
    		}
    		else
    			return z;
    		
    }
    
    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
    	int l = nums.length;
    	int n[] = new int[l];
    	int j = 0;
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i]!=0) {
    			n[j] = nums[i];
    			j ++;
    		}
    		else {
    			n[l-1] = nums[i];
    		}
    	}
    	for(int a=0; a<n.length; a++) {
    		System.out.print(n[a] + ",");
    	}
    	
     }
	
    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
     public String longestPalindrome(String s) {
	        String result = "";
	        int max = 0;
	        for(int i=0; i<s.length(); i++){
	            for(int j=s.length()-1; j>=i; j--){
	                if(isPalindrome(i,j,s) && j-i+1>max){
	                    result = s.substring(i,j+1);
	                    max = j-i+1;
	                    break;
	                }
	            }
	        }
	        return result;
	   }
	    
	   public boolean isPalindrome(int l, int r, String s){
	        while(l < r){
	            if(s.charAt(l) != s.charAt(r)){
	                return false;
	            }
	            l++; 
	            r--;
	        }
	        return true;
	   }
    
	
    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
    		int l = matrix.length;
 //         reverse first
    		for(int i=0, j=l-1; i<j; i++, j--) {
    			int temp[] = matrix[i];
    			matrix[i] = matrix[j];
    			matrix[j] = temp;
    			
    		}
 //        swap
    		for(int x=0; x<l; x++) {
    			for(int y=x+1; y<l; y++) {
    				int temp = matrix[x][y];
    				matrix[x][y] = matrix[y][x];
    				matrix[y][x] = temp;
    			}
    			
    		}
//        This is the test code.
//    		for(int i=0; i<matrix.length; i++) {
//    			for(int j=0; j<matrix[i].length; j++){
//    				System.out.print(matrix[i][j]);
//    			}
//    		}
    		return matrix;

   }
    
}