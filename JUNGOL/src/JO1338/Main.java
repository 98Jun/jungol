package JO1338;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		char ar[][] = new char[num][num];
		char c = 'A';
		for (int i = 0; i < num; i++) {
			for (int j = i, k = num - 1; j <= num - 1; j++, k--) {
				ar[j][k] = c++;
				if (c > 'Z') {
					c = 'A';
				}

			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (ar[i][j] == '\0') {
					ar[i][j] = ' ';
				}
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j == (num - 1)) {
					System.out.printf("%c", ar[i][j]);
				} else
					System.out.printf("%c ", ar[i][j]);

			}
			System.out.println();
		}
	}

}