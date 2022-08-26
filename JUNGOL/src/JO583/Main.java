package JO583;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double ar[] = new double[3];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextDouble();
		}
		s.close();
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {

			switch (i) {
			case 0:
				ar[i] = Math.floor(ar[i]);
				break;
			case 1:
				ar[i] = Math.round(ar[i]);
				break;
			case 2:
				ar[i] = Math.ceil(ar[i]);
				break;
			}
		}
		System.out.print((int) ar[2] + " ");
		System.out.print((int) ar[0] + " ");
		System.out.print((int) ar[1] + " ");
	}

}
