package selfstudy.exec01.dss01.cube;

public class Rotate01 {
	/*
	1   2   3   4  
	8   7   6   5  
	9   10  11  12  
	16  15  14  13  
	 */
	 public static void main(String[] args) {
	  
	     int n = 4;
	     int m = 4;
	     int[][] intArray = new int[n][m];
	     
	     int numm = 1;
	     for(int i = 0; i < n; i++){
	      if(i%2 == 0){
	       for(int j = 0; j < m; j++){
	        intArray[i][j] = numm++;
	       } 
	      }else{
	       for(int j = m - 1; j >= 0; j--){
	        intArray[i][j] = numm++;
	       } 
	      }
	     }
	     for(int i = 0; i< intArray.length; i++){
	      for(int j = 0; j< intArray[i].length; j++){
	       System.out.print(intArray[i][j] + "  ");
	      }
	      System.out.println("");
	     }
	 }
}
