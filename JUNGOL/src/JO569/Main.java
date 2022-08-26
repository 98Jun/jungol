package JO569;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int ar[][] = new int[5][4];
		int sum[] = new int[5];
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = s.nextInt();
				sum[i] += ar[i][j];
			}
		}
		s.close();
		for (int i = 0; i < ar.length; i++) {
			if ((sum[i] / 4) >= 80) {
				System.out.println("pass");
				count++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + count);
	}

}
