package RecursionInArrays;
import java.util.*;
public class firstIndex {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int x = scn.nextInt();
		scn.close();
		int first = firstIndexOfVal(arr, 0, x);
		System.out.println(first);
	}
	
	public static int firstIndexOfVal(int[] arr, int idx, int x) {
		if(idx == arr.length) {
			return -1;
		}
		int fisa = firstIndexOfVal(arr, idx + 1, x);
		if(arr[idx] == x) {
			return idx;
		} else {
			return fisa;
		}
		
		// Below we'll do a better/optimal code than above
		/*
		 if(arr[idx] == x) {
		 	return idx;
		 } else {
		 	int fisa = firstIndexOfVal(arr, idx + 1, x);
		 	return fisa;
		 }
		*/
	}
}
