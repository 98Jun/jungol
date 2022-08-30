package JO113;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		int w = num1 + 5;
		int l = num2 * 2;

		System.out.println("width = " + w);
		System.out.println("length = " + l);

		System.out.println("area = " + (w * l));

	}
}
