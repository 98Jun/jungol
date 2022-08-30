package JO525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		s.close();
		if (num1 > num2 && num1 > num3) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}

		if (num1 == num2 && num2 == num3) {
			System.out.print("1");
		} else {
			System.out.print("0");
		}

	}

}
