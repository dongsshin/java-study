package selfstudy.exec01.dss01.cube;

public class Rotate02 {
	/*
	1  5  9   13  
	2  6  10  14  
	3  7  11  15  
	4  8  12  16  
	 */
	 public static void main(String[] args) {
	  int n = 4;
	  int[][] intArray = new int[n][n];
	  int num  = 1;
	  for(int i = 0; i < n; i++){
	   for(int j = 0; j < n; j++){
	    intArray[j][i] = num++;
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
