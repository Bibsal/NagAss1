package RecursionInArrays;
import java.util.*;
public class diaplayArrInReverse {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		displayArrInRev(arr, 0);
	}
	
	public static void displayArrInRev(int[] arr, int idx) {
		if(idx == arr.length) {
			return;
		}
		displayArrInRev(arr, idx + 1);
		System.out.println(arr[idx]);
	}
}
