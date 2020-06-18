package selfstudy.exec01.dss01.cube;

public class Rotate05 {
	public static void main(String[] args) {
		/*
		 *      A
		       B I H
		      C N  G
		       D  F
		        E
		 */
		  // TODO Auto-generated method stub
		  char[] array = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		  int n = 7;
		  int num = 0;
		  char[][] cArray = new char[n][n];
		  int x = -1;
		  int y = n/2+1;
		  int m = y;
		  while(m > 0){
		   for(int i = 0; i < m; i++){
		    y--;x++;
		    cArray[x][y] = array[num++];
		   }
		   for(int i = 0; i < m -1; i++){
		    x++;y++;
		    cArray[x][y] = array[num++];
		   }
		   for(int i = 0; i < m -1; i++){
		    x--;y++;
		    cArray[x][y] = array[num++];
		   }
		   m--;
		   for(int i = 0; i < m -1; i++){
		    x--;y--;
		    cArray[x][y] = array[num++];
		   }
		   x--;
		  }
		  printdd(cArray);
		 }
		 public static void printdd(char[][] iArray){
		     for(int i = 0; i< iArray.length; i++){
		      for(int j = 0; j< iArray[i].length; j++){
		        System.out.print(iArray[i][j] + "*");
		      }
		      System.out.println("");
		     }
		 }
}
