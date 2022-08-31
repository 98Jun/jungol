package JO581;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num1 = s.nextInt();
		int num2 = s.nextInt();
		if (Math.abs(num1) > Math.abs(num2)) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		double num3 = s.nextDouble();
		double num4 = s.nextDouble();
		s.close();
		if (Math.abs(num4) > Math.abs(num3)) {
			System.out.printf("%.2f", num3);
		} else {
			System.out.printf("%.2f", num4);
		}

	}

}
