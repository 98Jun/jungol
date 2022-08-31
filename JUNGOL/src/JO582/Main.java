package JO582;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		s.close();
		double r = Math.sqrt(((double) num) / 3.14);
		System.out.printf("%.2f", r);
	}

}
