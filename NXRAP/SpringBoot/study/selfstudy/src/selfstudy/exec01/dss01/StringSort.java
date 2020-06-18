package selfstudy.exec01.dss01;

import java.util.Arrays;

/*
 * 
 * 
{"a1","9999"},
{"a2","99"},
{"a3","66"},
{"a4","588"}



[[a3, 66], [a2, 99], [a4, 588], [a1, 9999]]
 */

public class StringSort {
	public static void main(String[] args) {
		int[] inArray = {1,4,7,20,3,9};
		for(int i = 0; i < inArray.length; i++){
			for(int j = 0; j < inArray.length - i-1; j++){
				if(inArray[j] > inArray[j+1]){
					int temp = inArray[j+1];
					inArray[j+1] = inArray[j];
					inArray[j] = temp;
				}
			}
		}
		for(int i = 0; i < inArray.length; i++){
			//System.out.println(inArray[i]);
		}
		String[][] strArray = {{"a1","9999"},{"a2","99"},{"a3","66"},{"a4","588"}};
		for(int i = 0; i < strArray.length; i++){
			for(int j = 0; j < strArray.length - i -1; j++){
				if(Integer.parseInt(strArray[j][1]) > Integer.parseInt(strArray[j+1][1])){
					String[] temp = strArray[j+1];
					strArray[j+1] = strArray[j];
					strArray[j] = temp;
				}
			}
		}
		System.out.println(Arrays.deepToString(strArray));
	}
}
