package ArrayList;
import java.util.*;
public class RemovePrime {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			al.add(scn.nextInt());
		}
		scn.close();
		removePrimesViaArrayList(al);
		System.out.println(al);
	}
	
	public static void removePrimesViaArrayList(ArrayList<Integer> al) {
		for(int i = al.size() - 1; i >= 0; i--) {
			int val = al.get(i);
			if(isPrime(val) == true) {
				al.remove(i);
			}
		}
	}
	
	public static boolean isPrime(int val) {
		for(int div = 2; div * div <= val; div++) {
			if(val % div == 0) {
				return false;
			}
		}
		return true;
	}
}