package Arrays;
import java.util.*;
public class SpanOfTwoArrays {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.print(span(arr));
		scn.close();
	}
	
	public static int span(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
			
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		
		return max - min;
	}
}
