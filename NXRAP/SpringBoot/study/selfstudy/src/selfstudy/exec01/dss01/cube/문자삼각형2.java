package selfstudy.exec01.dss01.cube;

public class ¹®ÀÚ»ï°¢Çü2 {
/*
E
F B 
G C A
H D
I
 */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  char[] alphabetArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  int alphabetLength = alphabetArray.length;
  int N = 5;
  int currentX = N/2;
  int currentY = N/2;
  char[][] charArray = new char[N][N];
  int num = 0;
  int loopCount = 1;
  for( int i = 0; i < N-1; i++){
   for( int j = 0; j < N-1; j++){
    charArray[i][j] = ' ';
   }
  }
  for( int i = 0; i <= N/2; i++){
   for(int j = 0; j < loopCount; j++){
    charArray[currentX++][currentY] = alphabetArray[num++%alphabetLength];
   }
   currentX = N/2 - i - 1;
   currentY = N/2 - i - 1;
   loopCount = loopCount + 2;
  }
     for(int i = 0; i< charArray.length; i++){
      for(int j = 0; j< charArray[i].length; j++){
       System.out.print(String.valueOf(charArray[i][j]) + "  ");
      }
      System.out.println("");
     }
 }
}