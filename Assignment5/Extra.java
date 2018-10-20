import java.util.*;

public class Extra {
	
     public List<Integer> spiralOrder(int[][] matrix) {
    	 List<Integer> result = new ArrayList<>();
         
    	 int rb = 0;
         int cb = 0;
         int re = matrix.length-1;
         int ce = matrix[0].length-1;
         
         while(rb <= re && cb <= ce) {
             for(int i=cb; i<=ce; i++) {
                 result.add(matrix[rb][i]);
             }
             rb++;
             for(int i=rb; i<=re; i++) {
                 result.add(matrix[i][ce]);
             }
             ce--;
             if(rb <= re) {
                 for(int i=ce; i>=cb; i--) {
                     result.add(matrix[re][i]);
                 }
             }
             re--;
             if(cb <= ce) {
                 for(int i=re; i>=rb; i--) {
                     result.add(matrix[i][cb]);
                 }
             }
             cb++;
         }
         return result;
     }
     
     public static void main (String[] args) {
 		Extra a = new Extra();
 		int[][] matrix = new int[][]{{1,2,3},
 			{4,5,6},
 			{7,8,9}};
 		System.out.println(a.spiralOrder(matrix));
 	}
         


}
