package selfstudy.exec01.dss01.cube;
public class ´ÞÆØÀÌ»ï°¢Çü1 {
/*
0  
23  1  
22  24  2  
21  38  25  3  
20  37  39  26  4  
19  36  44  40  27  5  
18  35  43  42  41  28  6  
17  34  33  32  31  30  29  7  
16  15  14  13  12  11  10  9  8
 */
 
 public static void main(String[] args) {
  int N = 9;
  int num = 0;
  int[][] intArray = new int[N][N];
  int currentX = -1;
  int currentY = -1;
  int loopCount = N;
  while(loopCount > 0){
   for(int i = 0; i < loopCount;i++){
    intArray[++currentX][++currentY] = num++;
   }
   loopCount--;
   for(int i = 0; i < loopCount ;i++){
    intArray[currentX][--currentY] = num++;
   }
   loopCount--;
   for(int i = 0; i < loopCount ;i++){
    intArray[--currentX][currentY] = num++;
   }
   loopCount--;
  }
     for(int i = 0; i< intArray.length; i++){
      for(int j = 0; j< intArray[i].length; j++){
       if(intArray[i][j] > 0 || (i+j == 0)) System.out.print(intArray[i][j] + "  ");
      }
      System.out.println("");
     }
 }
}
