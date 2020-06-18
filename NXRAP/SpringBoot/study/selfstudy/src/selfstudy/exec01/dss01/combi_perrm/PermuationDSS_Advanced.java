package selfstudy.exec01.dss01.combi_perrm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermuationDSS_Advanced {

 public static void main(String[] args) {
  String[] strArray = new String[]{"AB","AB","BC","D"};
  String dataStr = "";
  for(int i = 0; i < strArray.length; i++){
   dataStr = dataStr + i;
  }
  List<String> lastResult = new ArrayList<String>();
  Set<String> strSet = new HashSet<String>();
  List<String> result = new ArrayList<String>();
  char[] charArray = dataStr.toCharArray();
  perm(charArray,0,charArray.length-1,result);
  for(String str : result){
   StringBuffer strBuf = new StringBuffer();
   for(int i= 0; i < str.length(); i++){
    Integer idx = Integer.valueOf(str.substring(i, i+1));
    strBuf.append(strArray[idx]);
   }
   lastResult.add(strBuf.toString());
   strSet.add(strBuf.toString());
  }
  for(String str : lastResult){
   System.out.println(str);
  }
  System.out.println(lastResult.size());
  System.out.println(strSet.size());
  
 }
 public static void perm(char[] charArray, int start, int end,List<String> result){
  if(start == end){
   result.add(new String(charArray));
   return;
  }else{
   for( int i = start; i <= end; i++){
    swap(charArray,start,i);
    perm(charArray,start+1,end,result);
    swap(charArray,i,start);
   }
  }
 }
 public static void swap(char[] charArray, int from, int to){
  char temp = charArray[from];
  charArray[from] = charArray[to];
  charArray[to] = temp;
 }
}
