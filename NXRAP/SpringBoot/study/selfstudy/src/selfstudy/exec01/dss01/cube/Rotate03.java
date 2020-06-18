package selfstudy.exec01.dss01.cube;

public class Rotate03 {
	/*
	I  F  C  
	H  E  B  
	G  D  A 
	 */
	 public static void main(String[] args) {
	  int n = 3;
	  char[][] cArray = new char[n][n];
	  char[] array = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	  int num = 0;
	  for(int i= n-1; i >= 0; i--){
	   for(int j= n-1; j >= 0; j--){
		   int x = num%array.length;
	    cArray[j][i] = array[num%array.length];
	    num++;
	   }
	  }
	     for(int i = 0; i< cArray.length; i++){
	      for(int j = 0; j< cArray[i].length; j++){
	       System.out.print(cArray[i][j] + "  ");
	      }
	      System.out.println("");
	     }
	 }
}
