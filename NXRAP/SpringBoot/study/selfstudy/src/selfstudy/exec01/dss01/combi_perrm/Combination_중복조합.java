package selfstudy.exec01.dss01.combi_perrm;

import java.util.ArrayList;
import java.util.Arrays;

public class Combination_중복조합 {
    public static void main(String[] args) {
    	int[][] result = makeCombination(4,4);
    	System.out.println(Arrays.deepToString(result));
    }
    private static int[][] makeCombination(int N, int K){
     ArrayList<String> list = new ArrayList<String>();
     int[] tempResult = new int[K];
     makeCominationSub(N,0,tempResult,list);
     int[][] result = new int[list.size()][tempResult.length];
     String[] strArray;
     for(int x = 0; x < list.size(); x++){
      strArray = list.get(x).split(",");
      int[] temp = new int[K];
      for(int i = 0; i < K; i++){
       temp[i] = Integer.parseInt(strArray[i]);
      }
      result[x] = temp;
     }
     return result;
    }
    private static void makeCominationSub(int N, int index, int[] tempResult,ArrayList<String> list){
     if(index == tempResult.length){
      StringBuffer strBuf = new StringBuffer();
      for(int x = 0; x < tempResult.length; x++){
       if(x > 0) strBuf.append(",");
       strBuf.append(tempResult[x]);
      }
      list.add(strBuf.toString());
      return;
     }
     for(int i = 0; i < N-1; i++){
      tempResult[index] = i;
      makeCominationSub(N,index+1,tempResult,list);
     }
    }
}