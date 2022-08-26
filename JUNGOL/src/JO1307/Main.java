package JO1307;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		s.close();

		int[][] ar = new int[n][n];
		int num = 65;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				ar[j][i] = num++;
				if (num == 90) {
					num = 65;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print((char) ar[i][j] + " ");
			}
			System.out.println();
		}

	}
}
