package JO579;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		s.close();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = s.nextInt();
		}
		Arrays.sort(ar);

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
	}

}
