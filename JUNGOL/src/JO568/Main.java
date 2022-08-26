package JO568;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ar1[][] = new int[2][4];
		int ar2[][] = new int[2][4];

		System.out.println("first array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				ar1[i][j] = s.nextInt();
			}
		}
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				ar2[i][j] = s.nextInt();
			}
		}
		s.close();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ar1[i][j] * ar2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
