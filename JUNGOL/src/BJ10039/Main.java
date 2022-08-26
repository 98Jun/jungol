package BJ10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = 0;
		int sum = 0;
		int i=0;
		for ( i = 0; i < 5; i++) {
			a = s.nextInt();

			if (a <= 40) {
				a = 40;
			}
			sum += a;
		}
		System.out.println(sum / i);
	}

}
 