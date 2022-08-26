package JO565;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int ar[] = new int[10];
		int ar1[] = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i;
		}
		while (true) {
			int num = s.nextInt();

			for (int i = 0; i < ar.length; i++) {
				if (ar[i] == (num / 10)) {
					ar1[i] += 1;
				}

			}

			if (num == 0) {
				ar1[0]--;
				break;
			}
		}
		s.close();
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] != 0) {
				System.out.println(ar[i] + " : " + ar1[i]);
			}
		}
	}

}
