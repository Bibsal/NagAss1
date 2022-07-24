package RecursionInArrays;
import java.util.*;
public class MaxOfArray {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		int maxi = maxFind(arr, 0);
		System.out.println(maxi);
	}
	
	public static int maxFind(int[] arr, int idx) {
		if(idx == arr.length - 1) {
			return arr[idx];
		}
		int misa = maxFind(arr, idx + 1);
		if(arr[idx] >= misa) {
			return arr[idx];
		} else {
			return misa;
		}
	}
}
