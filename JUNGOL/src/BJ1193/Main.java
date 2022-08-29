package BJ1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		int line = 1;
		int sumline = 0;

		while (true) {
			if (num <= line + sumline) {

				if (line % 2 == 0) {
					System.out.println();
					break;
				} else {
					System.out.println();
					break;
				}

			}else {
				sumline += line;
				line++;
				
			}
		}
	}
}