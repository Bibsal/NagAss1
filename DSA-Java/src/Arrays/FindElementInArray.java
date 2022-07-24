package Arrays;
import java.util.*;
public class FindElementInArray {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();           // size of array
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();        // inputting array elements
		}
		int d = scn.nextInt();      // Element to be found
		System.out.print(findElement(arr, d));
		scn.close();
	}
	
	public static int findElement(int[] arr, int d) {
		int idx = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == d) {
				idx = i;
			}
		}
		return idx;
	}
}
