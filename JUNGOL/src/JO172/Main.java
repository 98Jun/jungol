package JO172;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int count = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(count * j + " ");
			}
			count++;
			System.out.println();
		}
	}

}