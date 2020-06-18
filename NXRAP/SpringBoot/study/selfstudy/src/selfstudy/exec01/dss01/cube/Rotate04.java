package selfstudy.exec01.dss01.cube;

public class Rotate04 {
	/*
	A  J  K  T  U  
	B  I  L  S  V  
	C  H  M  R  W  
	D  G  N  Q  X  
	E  F  O  P  Y  

	 */
	 public static void main(String[] args) {
	  char[] array = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	  int n = 5;
	  char[][] cArray = new char[n][n];
	  int num = 0;
	  for(int i = 0; i < n; i++){
	   if(i%2 == 0){
	    for(int j = 0; j < n; j++){
	     cArray[j][i] = array[num%array.length];
	     num++;
	    }
	   }else{
	    for(int j = n -1; j >= 0; j--){
	     cArray[j][i] = array[num%array.length];
	     num++;
	    }
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
