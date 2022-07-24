package RecursionInArrays;
import java.util.*;
public class LastIndex {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int x = scn.nextInt();
		scn.close();
		int last = lastIndexOfVal(arr, 0, x);
		System.out.println(last);
	}
	
	public static int lastIndexOfVal(int[] arr, int idx, int x) {
		if(idx == arr.length) {
			return -1;
		}
		
		int lisa = lastIndexOfVal(arr, idx + 1, x);
		if(lisa == -1) {
			if(arr[idx] == x) {
				return idx;
			} else {
				return -1;
			}
		} else {
			return lisa;
		}
	}
}
