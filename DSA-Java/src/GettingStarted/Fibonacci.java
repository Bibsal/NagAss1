package GettingStarted;
import java.util.*;
public class Fibonacci {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int a = 0;
		int b = 1;
		System.out.print(a +" "+ b+ " ");
		for(int i = 0; i < n - 2; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
