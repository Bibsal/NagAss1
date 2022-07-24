package RecursionInArrays;
import java.util.*;
public class displayArr {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		} 
		scn.close();
		displayArrFromStarting(arr, 0);
	}
	
	public static void displayArrFromStarting(int[] arr, int idx) {
		if(idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		displayArrFromStarting(arr, idx + 1);
	}
}
