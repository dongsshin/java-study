package selfstudy.exec01.dss01.cube;

public class ¹®ÀÚ»ï°¢Çü {
/*
             A
           B F
         C G J
       D H K M
     E I L N O
 */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  char[] alphabetArray = "ABCDEFGHIJKLMNOPQRSTUVWSYZ".toCharArray();
  int alphabetLength = alphabetArray.length;
  
  int N = 5;
  char[][] charArray = new char[N][N];
  int num = 0;
  int loopCount = N;
  int currentX = -1;
  int currentY = N;
  int ee = 0;
  while(loopCount > 0){
   for(int i = 0; i < loopCount; i++){
    charArray[++currentX][--currentY] = alphabetArray[num++%alphabetLength];
   }
   loopCount--;
   currentX = ee++;
   currentY = N;
  }
     for(int i = 0; i< charArray.length; i++){
      for(int j = 0; j< charArray[i].length; j++){
       System.out.print(charArray[i][j] + "  ");
      }
      System.out.println("");
     }
 }
}
