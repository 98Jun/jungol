package JO1047;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		s.close();
		int num = 1;
		int ar[] = new int[40];
		for (int i = 0; i < 2; i++) {
			ar[i] = num;
		}
		for (int i = 2; i < ar.length; i++) {
			ar[i] = ar[i - 1] + ar[i - 2];
		}

		System.out.println(ar[count - 1]);

	}
}
