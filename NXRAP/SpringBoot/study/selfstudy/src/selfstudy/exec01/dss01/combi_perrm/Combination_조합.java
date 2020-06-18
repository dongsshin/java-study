package selfstudy.exec01.dss01.combi_perrm;
/*
012
013
014
023
024
034
123
124
134
234

 */
public class Combination_а╤гу {
	public static void main(String[] args) { 
		int[] arr = new int[5]; 
		//0,1,2,3,5   5C3
		combination(arr, 0, 5, 3, 0); 
	} 
	public static void combination(int[] arr, int index, int n, int r, int target) { 
		if (r == 0) {
			print(arr, index); 
		}
		else if (target == n) return; 
		else { 
			arr[index] = target; 
			combination(arr, index + 1, n, r - 1, target + 1); 
			combination(arr, index, n, r, target + 1); 
		}
	}
	public static void print(int[] arr, int length) { 
		for (int i = 0; i < length; i++) System.out.print(arr[i]);
		System.out.println(""); 
	}
}