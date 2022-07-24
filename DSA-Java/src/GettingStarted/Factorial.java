package GettingStarted;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		int nfact = factorial(n);
		int nmrfact = factorial(n - r);
		int ncr = nfact / nmrfact;
		System.out.println(ncr);
		scn.close();
	}


	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}