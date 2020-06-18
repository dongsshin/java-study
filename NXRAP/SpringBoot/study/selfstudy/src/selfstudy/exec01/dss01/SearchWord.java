package selfstudy.exec01.dss01;

import java.util.ArrayList;
import java.util.List;

public class SearchWord {
	public static void main(String[] args) {
		String[][] matrix = new String[10][10];
		matrix[0] = convertStr("BHEZRBUOCZ");
		matrix[1] = convertStr("LSLZKEOBSA");
		matrix[2] = convertStr("AYPMDEDAQY");
		matrix[3] = convertStr("CWRPGDTNDI");
		matrix[4] = convertStr("KFUIRTYKNN");
		matrix[5] = convertStr("BGPREDGEWW");
		matrix[6] = convertStr("LGIYEROVUO");
		matrix[7] = convertStr("UNYLNPUXWR");
		matrix[8] = convertStr("KVOESITBCB");
		matrix[9] = convertStr("IWNZWHITEY");
		String[] out = findWordCount(matrix,"ORANGE");
		if(out != null && out.length > 0){
			for(int k = 0; k< out.length; k++){
				System.out.println(out[k].toLowerCase());
			}
		}else{
			System.out.println("null");
		}
	}
	public static String[] findWordCount(String[][] matrix, String word){
		List<String> rslt = new ArrayList<String>();
		int M = matrix.length;
		int N = matrix[0].length;
		int wordLength = word.length();
		for(int i = 0; i < M; i++){
			for(int j =0; j < N; j++){
			if(i == 0){
				@SuppressWarnings("unused")
				String ddd = "";
			}
				String tempStr = "";
				for(int k = 0; k < wordLength && j+k < N; k++){
					tempStr += matrix[i][j+k];
				}
				if(tempStr.equals(word)) {
					rslt.add(String.valueOf((char)(65+i)) + String.valueOf(j));
				}
				tempStr = "";
				for(int k = 0; k < wordLength && i+k < M; k++){
					tempStr += matrix[i+k][j];
				}
				if(tempStr.equals(word)) {
					rslt.add(String.valueOf((char)(65+i)) + String.valueOf(j));
				}
				tempStr = "";
				for(int k = 0; k < wordLength && i+k < M && j+k < N; k++){
					String str = matrix[i+k][j+k];
					tempStr += matrix[i+k][j+k];
				}
				if(tempStr.equals(word)) {
					rslt.add(String.valueOf((char)(65+i)) + String.valueOf(j));
				}
			}
		}
		if(rslt.size() == 0) return null;
		String[] out =new String[rslt.size()];
		int cnt = 0;
		for(String str : rslt){
			out[cnt] = str;
			cnt++;
		}
		return out;
	}
	
	
	
	
	
	public static String[] convertStr(String in){
		char[] charArrat = in.toCharArray();
		String[] strArray = new String[charArrat.length];
		
		for(int i = 0; i<charArrat.length; i++){
			strArray[i] = String.valueOf(charArrat[i]);
		}
		
		return strArray;
	}
}