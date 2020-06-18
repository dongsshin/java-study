package selfstudy.exec01.dss01.cube;
public class ¸¶¹æÁø {
/*
 6  1  8  
 7  5  3  
 2  9  4  
*/
 public static void main(String[] args) {
  int N = 3;
  int[][] iArray = new int[N][N];
  int num = 1;
  int cirentX = 0;
  int cirentY = N/2;
  while(num <= N*N){
   iArray[cirentX][cirentY] = num;
   if(num%N == 0){
    cirentX++;
   }else{
    if(cirentX > 0 ) {
     cirentX--;
    }else{
     cirentX = N -1;
    }
    if(cirentY > 0 ) {
     cirentY--;
    }else{
     cirentY = N -1;
    }
   }
   num++;
  }
     for(int i = 0; i< iArray.length; i++){
      for(int j = 0; j< iArray[i].length; j++){
       System.out.print(iArray[i][j] + "  ");
      }
      System.out.println("");
     }
 }

}