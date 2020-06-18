package selfstudy.exec01.dss01.cube;

import java.util.Arrays;

public class Cube_È¸Àü {

	public static void main(String[] args) {
		int inArray[][] = {{5,7,8},{4,2,1},{3,5,6}};
		System.out.println(Arrays.deepToString(inArray));
		int[][] out = rotateRight(inArray);
		System.out.println(Arrays.deepToString(out));
		out = rotateLeft(out);
		System.out.println(Arrays.deepToString(out));
//		for(int l = 0; l < inArray.length; l++){
//			for(int m = 0; m < inArray[l].length; m++){
//				System.out.print(inArray[l][m] + out[l][m] + "   ");
//			}
//			System.out.println("");
//		}
	}
	public static int[][] rotateRight(int[][] in){
		int m  = in.length;
		int n = in[0].length;
		int out[][] = new int[n][m];
		for(int i = 0; i < m; i++ ){
			for(int j = 0; j < n; j++){
				out[j][m-i-1] = in[i][j]; 
			}
		}
		//System.out.println(Arrays.deepToString(out));
		return out;
	}
	public static int[][] rotateLeft(int[][] in){
		int m  = in.length;
		int n = in[0].length;
		int out[][] = new int[n][m];
		for(int i = 0; i < m; i++ ){
			for(int j = 0; j < n; j++){
				out[m-j-1][i] = in[i][j]; 
			}
		}
		//System.out.println(Arrays.deepToString(out));
		return out;

		
	}
	
}